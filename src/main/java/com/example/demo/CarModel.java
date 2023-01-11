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
  public CarModel(int int1, String string, double double1) {
		// TODO 自動生成されたコンストラクター・スタブ
	  id = int1;
	  name = string;
	  gas = double1;
	}

@Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String name;

  private double gas;
  

}