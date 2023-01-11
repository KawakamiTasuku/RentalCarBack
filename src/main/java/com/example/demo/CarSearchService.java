package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Component;

//autowiredされる奴はcomopnet(部品)DIコンテナに入っている

@Component
public class CarSearchService implements ICarSearchService {
	
	ICarModelRepository carModelRepository = new CarModelRepository();
	
	@Override
	public List<CarModel> findByName(String name){
		return carModelRepository.findByName(name);
	}
		 
}