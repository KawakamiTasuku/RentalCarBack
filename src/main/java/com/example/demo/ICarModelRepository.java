package com.example.demo;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

public interface ICarModelRepository extends CrudRepository<CarModel, Integer>{
		public ArrayList <CarModel> findByName(String name) throws Exception,SQLException;
		public ArrayList <CarModel> findById(int id) throws Exception,SQLException;
		public ArrayList <CarModel> findByGas(double gas) throws Exception,SQLException;
}
