package com.placide.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.placide.web.model.Student;

public class StudentDao {
	public Student getStudent(int sid) {
		Student stud=new Student();
		String link="jdbc:mysql://localhost:3306/student";
		String user="root";
		String pass="toor";
		String sql="SELECT * FROM students WHERE sid=?";
		try(Connection conn=DriverManager.getConnection(link,user,pass)){
			Class.forName("com.mysql.jdbc.Driver");
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1,sid);
			ResultSet result=statement.executeQuery();
			if(result.next()) {
				stud.setSid(result.getInt(1));
				stud.setSname(result.getString(2));
				stud.setTech(result.getString(3));
			}
		}catch(SQLException e) {
			e.getMessage();
		}catch(Exception e) {
			e.getMessage();
		}
		return stud;
	}

}
