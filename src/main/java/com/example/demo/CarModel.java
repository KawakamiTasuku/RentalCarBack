package com.example.demo;



import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // This tells Hibernate to make a table out of this class
@Data
@Table(name = "car_model")
public class CarModel {
  public CarModel(int id, String company, String carName, String carNumber, double gas) {
		// TODO 自動生成されたコンストラクター・スタブ
	  this.id = id;
	  this.company = company;
	  this.carName = carName;
	  this.carNumber = carNumber;
	  this.gas = gas;
	}

@Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String company;

  private String carName;

  private String carNumber;
  
  private double gas;
  

}