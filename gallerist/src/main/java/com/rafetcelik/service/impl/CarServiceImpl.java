package com.rafetcelik.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafetcelik.dto.DtoCar;
import com.rafetcelik.dto.DtoCarIU;
import com.rafetcelik.model.Car;
import com.rafetcelik.repository.ICarRepository;
import com.rafetcelik.service.ICarService;

@Service
public class CarServiceImpl implements ICarService{
	
	@Autowired
	private ICarRepository carRepository;
	
	private Car createCar(DtoCarIU dtoCarIU) {
		Car car = new Car();
		car.setCreateTime(new Date());
		
		BeanUtils.copyProperties(dtoCarIU, car);
		return car;
	}
	
	@Override
	public DtoCar saveCar(DtoCarIU dtoCarIU) {
		DtoCar dtoCar = new DtoCar();
		Car savedCar = carRepository.save(createCar(dtoCarIU));
		
		BeanUtils.copyProperties(savedCar, dtoCar);
		return dtoCar;
	}

}
