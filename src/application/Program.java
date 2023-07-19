package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null; //consulta sql
		ResultSet rs = null; //resultado da consulta guardado na variavel rs
		try {
			conn = DB.getConnection();
			st = conn.createStatement();
			
			rs = st.executeQuery("select * from department");
			while(rs.next()) {
				System.out.println(rs.getInt("Id")+ ", "+ rs.getString("name"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
