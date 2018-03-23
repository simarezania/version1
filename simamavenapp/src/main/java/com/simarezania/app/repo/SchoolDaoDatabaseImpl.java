package com.simarezania.app.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SchoolDaoDatabaseImpl extends AbstractDaoDabaseImpl implements SchoolDao {

	public int countAll() {
		int rowCount = 0;
		Connection conn = getConnection();
		Statement stmt;
		try {
			stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select count (id) from school");

			if (rs.next()) {
				rowCount = rs.getInt(1);
				System.out.println("row count=" + rowCount);
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (

		SQLException e) {
			e.printStackTrace();
		}
		return rowCount;

	}

	public void delete(int id) {
		Connection conn = getConnection();
		PreparedStatement pst = null;

		try {
			pst = conn.prepareStatement("delete from school where id=?");
			pst.setInt(1, id);

			pst.executeUpdate();
			pst.close();
			System.out.println("delet record from school done successfully");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void addSchool(String schoolName, String address) {
		Connection conn = getConnection();
		PreparedStatement pst = null;

		try {
			pst = conn.prepareStatement("insert into school(name, address)values (?,?)");
			pst.setString(1, schoolName);
			pst.setString(2, address);

			pst.executeUpdate();
			pst.close();
			System.out.println("inserted successfully in school");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public boolean updateSchool(int id, String newName, String address) {
		Connection conn = getConnection();
		PreparedStatement pst = null;

		try {
			pst = conn.prepareStatement("update school set  name=?, address=? where id=? ");
			pst.setInt(3, id);
			pst.setString(1, newName);
			pst.setString(2, address);

			pst.executeUpdate();
			pst.close();
			System.out.println("update school successfully");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	public boolean updateSchool(int id, String newName) {
		Connection conn = getConnection();
		PreparedStatement pst = null;

		try {
			pst = conn.prepareStatement("update school set  name=? where id=? ");
			pst.setInt(2, id);
			pst.setString(1, newName);

			pst.executeUpdate();
			pst.close();
			System.out.println("update school successfully");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	public void printSchools(String school) {
		Connection conn = getConnection();

		PreparedStatement pst = null;

		try {
			pst = conn.prepareStatement("select * from school where name=? ");

			pst.setString(1, school);

			// pst.executeUpdate();

			ResultSet rs = pst.executeQuery();

			System.out.println("specific school is1");

			// Retrieve by column name
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				System.out.println("specific school is");
				System.out.println("---------------------------------------------------");
				System.out.println(String.format("%-20s|%-20s|%-20s", id, name, address));
				System.out.println("---------------------------------------------------");

			}
			pst.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void printAllSchools() {
		Connection conn = getConnection();
		Statement stmt;
		try {
			stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select * from school");
			System.out.println(String.format("%-20s|%-20s|%-20s", "ID", "Name", "Address"));
			System.out.println("---------------------------------------------------");

			while (rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString("name");
				String address = rs.getString("address");

				System.out.println(String.format("%-20s|%-20s|%-20s", id, name, address));
				System.out.println("---------------------------------------------------");
			}

			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
