package com.example.demo;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;

class CarCalculatorTest {
	

	@Test
	void test() {
		
		CarCalculator carCalculator = new CarCalculator();
		CarModel carModel = new CarModel(1,"a","a","a",15);
		
		double gasNeeds = carCalculator.gasNeeds(carModel,100);
		
		assertThat(gasNeeds,is(6.7));
	}

}
