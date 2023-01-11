package com.example.demo;

import java.util.List;

public interface ICarSearchService {
	List<CarModel> findByName(String name);
}
