package com.simarezania.app.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class StudentDaoDatabaseImpl extends AbstractDaoDabaseImpl implements StudentDao {


	public void addStudent(String firstName, String lastName, int schoolId) {

		Connection conn = getConnection();
		PreparedStatement pst = null;

		try {
			pst = conn.prepareStatement("insert into student(last_name, first_name, school_id)values (?,?,?)");
			pst.setString(1, lastName);
			pst.setString(2, firstName);
			pst.setInt(3, schoolId);
			pst.executeUpdate();
			pst.close();
			System.out.println("inserted successfully");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public int countAll() {
		// TODO Auto-generated method stub
		int rowCount=0;
		Connection conn = getConnection();
		Statement stmt;
		try {
			stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select count (last_name) from student");

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
			pst = conn.prepareStatement("delete from student where id=?");
			pst.setInt(1, id);

			pst.executeUpdate();
			pst.close();
			System.out.println("delet record from student done successfully");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

	public boolean updateStudent(int id, String newLastName, String newFirstName, int newSchoolID) {
		

		Connection conn = getConnection();
		PreparedStatement pst = null;

		try {
			pst = conn.prepareStatement("update student set last_name=?, first_name=?, school_id=? where id=? ");
			pst.setInt(4, id);
			pst.setString(1, newLastName);
			pst.setString(2, newFirstName);
			pst.setInt(3, newSchoolID);
			pst.executeUpdate();
			pst.close();
			System.out.println("update successfully");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	public void printStudents(String firstName) {

		
		Connection conn = getConnection();

		PreparedStatement pst = null;

		try {
			pst = conn.prepareStatement("select * from student where first_name=? ");

			pst.setString(1, firstName);

			// pst.executeUpdate();

			ResultSet rs = pst.executeQuery();

			System.out.println("specific student is1");

			// Retrieve by column name
			while (rs.next()) {
				int id = rs.getInt("id");
				String first_Name = rs.getString("first_name");
				String last_Name = rs.getString("last_name");
				System.out.println("specific student is");
				System.out.println("---------------------------------------------------");
				System.out.println(String.format("%-20s|%-20s|%-20s", id, first_Name, last_Name));
				System.out.println("---------------------------------------------------");

			}
			pst.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void printAllStudents() {
		Connection conn = getConnection();
		Statement stmt;
		try {
			stmt = conn.createStatement();
			// String sql = "SELECT * FROM Student";
			ResultSet rs = stmt.executeQuery("select * from student");
			System.out.println(String.format("%-20s|%-20s|%-20s", "ID", "firstName", "LastName"));
			System.out.println("---------------------------------------------------");
			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");

				System.out.println(String.format("%-20s|%-20s|%-20s", id, firstName, lastName));
				System.out.println("---------------------------------------------------");
			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
