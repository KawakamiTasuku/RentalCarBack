package com.example.demo;

import java.util.List;


public class CarSearch {
	
	public static String name = "アクア";
	
	//他のクラスからアクセスされるべきではないものにはprivateを付ける
	//変数を定義する時にはきちんと前に何を付けるかを考えてから定義する。
	
	
	private static ICarSearchService carSearchService = new CarSearchService();
	
	public static void main(String[] args) {

	List<CarModel> carModel = carSearchService.findByName(name);
	
	
	System.out.println(carModel);
	}
}