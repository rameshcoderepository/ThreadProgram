package Collect_Exercise;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ResponseClass {
	
	public String getResponse() {
		return "hello";
	}

	public List<PrimaryData> getPrimaryDataResponse() {
		
		List<PrimaryData> primaryList = new ArrayList<PrimaryData>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collection", "root", "admin");
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from primarydata");
			while (rs.next()) {
				String mobnum = rs.getString("mnumber");
				String name = rs.getString("name");

				PrimaryData primaryData = new PrimaryData();
				primaryData.setMobileNumber(mobnum);
				primaryData.setName(name);
				
				primaryList.add(primaryData);
			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		return primaryList;
	}
	
public List<SecondaryData> getSecondaryDataResponse() {
		
		List<SecondaryData> secondaryList = new ArrayList<SecondaryData>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collection", "root", "admin");
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from secondarydata");
			while (rs.next()) {
				String mobnum = rs.getString("mnumber");
				String address = rs.getString("address");

				SecondaryData secondaryData = new SecondaryData();
				secondaryData.setMobileNumber(mobnum);
				secondaryData.setAddress(address);
				
				secondaryList.add(secondaryData);
			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		return secondaryList;
	}

}
