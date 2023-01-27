package com.example.demo;

import java.util.ArrayList;

public class CarCalculator {
	
	/**
	 * レンタカーのリストと走行距離から走るために必要なガソリン量を計算します
	 * @param carModels ガソリンの使用料を知りたいレンタカーのリスト
	 * @param distance 走行距離
	 * @return 必要なガソリンの量
	 */
	
	public ArrayList<Double> gasNeeds(ArrayList<CarModel> carModels,double distance){
		ArrayList<Double> distanceByGas = new ArrayList<Double>();
		for (int i = 0 ; i < carModels.size() ; i++) {
			distanceByGas.add(gasNeeds(carModels.get(i),distance));
		}
		return distanceByGas;
	}
	
	/**
	 * レンタカーと走行距離から走るために必要なガソリン量を計算します
	 * @param carModels ガソリンの使用料を知りたいレンタカー
	 * @param distance 走行距離
	 * @return 必要なガソリンの量
	 */
	public Double gasNeeds(CarModel carModel,double distance){
		double gasNeeds = distance/carModel.getGas();
		return (double)(Math.round(gasNeeds*10))/10;
	}

}