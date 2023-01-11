package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class ConnectDemo {
	
	private static final String URL = "jdbc:mysql://localhost:3306/userdatabase";
	private static final String USER = "user";
	private static final String PASS = "userpass";
	
	public static void main(String[] args) throws SQLException, Exception {

		
	    
        final String SQL = "select * from rentalcarlist where gas >= ?";
        
        try(
        		Connection conn = DriverManager.getConnection(URL,USER,PASS);
    			
        		
            PreparedStatement ps = conn.prepareStatement(SQL)){
            
            ps.setDouble(1,20);
            
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()) {
                    System.out.println(
                    	rs.getInt("id") + " " +
                    	rs.getString("name") + " " +
                        rs.getDouble("gas"));
                }           
            };
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("処理が完了しました");
        }

        
        com.example.demo.CarModelRepository carModelRepository = new com.example.demo.CarModelRepository();
		ArrayList<CarModel> carModel1 = carModelRepository.findByName("ア");
		ArrayList<CarModel> carModel2 = carModelRepository.findByGas(17);
		ArrayList<CarModel> carModel3 = carModelRepository.findById(1);
		printCarModel(carModel1);
		printCarModel(carModel2);
		printCarModel(carModel3);
	}
	
	@SuppressWarnings("unused")
	private static void printCarModel(CarModel carModel) {
		System.out.println(
				carModel.getId()+ " " +
                carModel.getName()+ " " +
                carModel.getGas());
		System.out.println();
	}
	
	private static void printCarModel(ArrayList<CarModel> carModels) {
		for (int i = 0 ; i < carModels.size() ; i++) {
			System.out.println(
					carModels.get(i).getId()+" "+
					carModels.get(i).getName()+" "+
					carModels.get(i).getGas()
					);
		}
		System.out.println();
		
	}
}