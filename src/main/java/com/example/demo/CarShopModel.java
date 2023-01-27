package com.example.demo;

import java.util.List;

import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@Table(name = "car_shop_model")
public class CarShopModel {
	public CarShopModel(int id,String carShopName,double longitude,double latitude,List<CarModel> carModels) {
		this.id = id;
		this.carShopName = carShopName;
		this.longitude = longitude;
		this.latitude = latitude;
		this.carModels = carModels;
		
		
		
	}
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String carShopName;
	private double longitude;
	private double latitude;
	private List<CarModel> carModels;
	


}
