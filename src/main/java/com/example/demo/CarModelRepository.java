package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

public class CarModelRepository implements ICarModelRepository{

	@Override
	public <S extends CarModel> S save(S entity) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public <S extends CarModel> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Optional<CarModel> findById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return Optional.empty();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public Iterable<CarModel> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Iterable<CarModel> findAllById(Iterable<Integer> ids) {
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
	public void delete(CarModel entity) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void deleteAll(Iterable<? extends CarModel> entities) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void deleteAll() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public ArrayList<CarModel> findByCarName(String carName) throws Exception,SQLException {
		// TODO 自動生成されたメソッド・スタブ
		
		ArrayList<CarModel>  carModels = new ArrayList<CarModel>(); 
		
		String URL = "jdbc:mysql://localhost:3306/userdatabase";
		String USER = "user";
		String PASS = "userpass";
		
		
		final String SQL1 = "select * from rentalcarlist where carname like ?";

		try (
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			PreparedStatement ps = conn.prepareStatement(SQL1)){
            
			//値を当てはめることをバインドという(?のやつ)
            ps.setString(1,"%" + carName + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
            CarModel carModel = new CarModel(rs.getInt("id"),rs.getString("company"),rs.getString("carName"),rs.getString("carNumber"),rs.getDouble("gas"));
            carModels.add(carModel);
            }
            return carModels;
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
            e.printStackTrace();
            throw e;
        } 
	}

	@Override
	public ArrayList<CarModel> findById(int id) throws Exception, SQLException {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<CarModel>  carModels = new ArrayList<CarModel>(); 
		
		String URL = "jdbc:mysql://localhost:3306/userdatabase";
		String USER = "user";
		String PASS = "userpass";
		
		
		final String SQL1 = "select * from rentalcarlist where id = ?";

		try (
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			PreparedStatement ps = conn.prepareStatement(SQL1)){
            
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
            CarModel carModel = new CarModel(rs.getInt("id"),rs.getString("company"),rs.getString("carName"),rs.getString("carNumber"),rs.getDouble("gas"));
            carModels.add(carModel);
            }
            return carModels;
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
            e.printStackTrace();
            throw e;
        } 
	}

	@Override
	public ArrayList<CarModel> findByGas(double gas) throws Exception, SQLException {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<CarModel>  carModels = new ArrayList<CarModel>(); 
		
		String URL = "jdbc:mysql://localhost:3306/userdatabase";
		String USER = "user";
		String PASS = "userpass";
		
		
		final String SQL1 = "select * from rentalcarlist where gas >= ?";

		try (
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			PreparedStatement ps = conn.prepareStatement(SQL1)){
            
            ps.setDouble(1,gas);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
            CarModel carModel = new CarModel(rs.getInt("id"),rs.getString("company"),rs.getString("carName"),rs.getString("carNumber"),rs.getDouble("gas"));
            carModels.add(carModel);
            }
            return carModels;
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
	}

	@Override
	public ArrayList<CarModel> findByCarNumber(String carNumber) throws Exception, SQLException {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<CarModel>  carModels = new ArrayList<CarModel>(); 
		
		String URL = "jdbc:mysql://localhost:3306/userdatabase";
		String USER = "user";
		String PASS = "userpass";
		
		
		final String SQL1 = "select * from rentalcarlist where carnumber like ?";

		try (
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			PreparedStatement ps = conn.prepareStatement(SQL1)){
            
            ps.setString(1,"%" + carNumber + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
            CarModel carModel = new CarModel(rs.getInt("id"),rs.getString("company"),rs.getString("carName"),rs.getString("carNumber"),rs.getDouble("gas"));
            carModels.add(carModel);
            }
            return carModels;
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
            e.printStackTrace();
            throw e;
        } 
	}

	@Override
	public ArrayList<CarModel> findByCompany(String company) throws Exception, SQLException {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<CarModel>  carModels = new ArrayList<CarModel>(); 
		
		String URL = "jdbc:mysql://localhost:3306/userdatabase";
		String USER = "user";
		String PASS = "userpass";
		
		
		final String SQL1 = "select * from rentalcarlist where company like ?";

		try (
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			PreparedStatement ps = conn.prepareStatement(SQL1)){
            
            ps.setString(1,"%" + company + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
            CarModel carModel = new CarModel(rs.getInt("id"),rs.getString("company"),rs.getString("carName"),rs.getString("carNumber"),rs.getDouble("gas"));
            carModels.add(carModel);
            }
            return carModels;
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
            e.printStackTrace();
            throw e;
        } 
	}
}