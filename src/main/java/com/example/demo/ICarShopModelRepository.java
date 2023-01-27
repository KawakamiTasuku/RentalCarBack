package com.example.demo;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

public interface ICarShopModelRepository extends CrudRepository<CarShopModel, Integer>{
	public ArrayList <CarShopModel> findByCarShopName(String carShopName) throws Exception,SQLException;
	public ArrayList <CarShopModel> findByLongitudeAndLatitude(double longitude,double latitude) throws Exception,SQLException;
	public ArrayList <CarShopModel> findById(int id) throws Exception,SQLException;
	public ArrayList <CarShopModel> findByCar(CarModel carModel) throws Exception,SQLException;	
}