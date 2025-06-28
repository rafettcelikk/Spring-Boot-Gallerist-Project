package com.rafetcelik.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafetcelik.dto.DtoAddress;
import com.rafetcelik.dto.DtoGallerist;
import com.rafetcelik.dto.DtoGalleristIU;
import com.rafetcelik.exception.BaseException;
import com.rafetcelik.exception.ErrorMessage;
import com.rafetcelik.exception.MessageType;
import com.rafetcelik.model.Address;
import com.rafetcelik.model.Gallerist;
import com.rafetcelik.repository.IAddressRepository;
import com.rafetcelik.repository.IGalleristRepository;
import com.rafetcelik.service.IGalleristService;

@Service
public class GalleristServiceImpl implements IGalleristService{
	
	@Autowired
	private IGalleristRepository galleristRepository;
	
	@Autowired
	private IAddressRepository addressRepository;
	
	private Gallerist createGallerist(DtoGalleristIU dtoGalleristIU) {
		Optional<Address> optAddress = addressRepository.findById(dtoGalleristIU.getAddressId());
		if(optAddress.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoGalleristIU.getAddressId().toString()));
		}
		
		Gallerist gallerist = new Gallerist();
		gallerist.setCreateTime(new Date());
		
		BeanUtils.copyProperties(dtoGalleristIU, gallerist);
		gallerist.setAddress(optAddress.get());
		
		return gallerist;
	}
	
	@Override
	public DtoGallerist saveGallerist(DtoGalleristIU dtoGalleristIU) {
		DtoGallerist dtoGallerist = new DtoGallerist();
		DtoAddress dtoAddress = new DtoAddress();
		
		Gallerist savedGallerist = galleristRepository.save(createGallerist(dtoGalleristIU));
		
		BeanUtils.copyProperties(savedGallerist, dtoGallerist);
		BeanUtils.copyProperties(savedGallerist.getAddress(), dtoAddress);
		
		dtoGallerist.setAddress(dtoAddress);
		return dtoGallerist;
	}

}
