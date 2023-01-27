package com.example.demo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

public class CarShopModelRepository implements ICarShopModelRepository{

	@Override
	public <S extends CarShopModel> S save(S entity) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public <S extends CarShopModel> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Optional<CarShopModel> findById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return Optional.empty();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public Iterable<CarShopModel> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Iterable<CarShopModel> findAllById(Iterable<Integer> ids) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public long count() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void delete(CarShopModel entity) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void deleteAll(Iterable<? extends CarShopModel> entities) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void deleteAll() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public ArrayList<CarShopModel> findByCarShopName(String carShopName) throws Exception, SQLException {
		// TODO 自動生成されたメソッド・スタブ
		
		return null;
	}

	@Override
	public ArrayList<CarShopModel> findByLongitudeAndLatitude(double longitude, double latitude)
			throws Exception, SQLException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public ArrayList<CarShopModel> findById(int id) throws Exception, SQLException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public ArrayList<CarShopModel> findByCar(CarModel carModel) throws Exception, SQLException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
