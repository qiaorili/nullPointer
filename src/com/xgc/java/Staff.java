/*
 * 说明
 * 创建时间 2013-5-3
 * 修改日期
 * 文件名称 Staff.java
 * @author Administrator
 */

package com.xgc.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

import javax.swing.border.TitledBorder;


/**
 * <p><b>说	明</b></p> 
 * @author xie.gc
 */
public class Staff extends ArrayList<Position> {
	public void add(String title, Person person) {
		add(new Position(title, person));
	}
	
	public void add(String... titles) {
		for(String title : titles){
			add(new Position(title));
		}
	}
	
	public Staff(String... titles){
		add(titles);
	}
	
	public boolean positionAvaliable(String title) {
		for (Position position : this) {
			if (position.getTitle().equals(title) && 
				position.getPerson() == Person.NULL) {
				return true;
			}
		}
		return false;
	}
	
	public void fillPosition(String title, Person hire) {
		for (Position position : this) {
			if (position.getTitle().equals(title) && position.getPerson() == Person.NULL) {
				position.setPerson(hire);
				return;
			}
		}
		throw new RuntimeException("Position " + title + " not avaliable");
	}
	public class A{
		public String title;
		public String name;
		{
			title = "";
			name = "";
		}
		
	}
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn  = DriverManager.getConnection("");
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			for (StackTraceElement errorElement : e.getStackTrace()) {
				errorElement.toString();
			}
		}
		Staff staff = new Staff("Persident", "CTO", "Marketing manager", "Product Manager", 
				"Project Lead", "Software Engineer", "Software Engineer", "Software Engineer",
				"Software Engineer", "Test Engineer", "Technical Writer");
		staff.fillPosition("Persident", new Person("Me", "Last", "The Top, Lonely At"));
		staff.fillPosition("Project Lead", new Person("Janet", "Planner", "The Burbs"));
		if (staff.positionAvaliable("Software Engineer")) {
			staff.fillPosition("Software Engineer", new Person("Bob", "Coder", "Bright Light City"));
		}
		Staff.A a = staff.new A();
		a.title = "";
		a.name = "";
		
		System.out.println(staff);
	}
}
