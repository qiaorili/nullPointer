/*
 * 说明
 * 创建时间 2013-5-3
 * 修改日期
 * 文件名称 Position.java
 * @author Administrator
 */

package com.xgc.java;


/**
 * <p><b>说	明</b></p> 
 * @author xie.gc
 */
public class Position {
	private String title;
	private Person person;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Position(String title, Person person){
		this.title = title; 
		this.person = person;
		if(this.person == null){
			person = Person.NULL;
		}
	}
	
	public Position(String job){
		title = job;
		person = Person.NULL;
	}

	@Override
	public String toString() {
		
		return "Position" + title + " " + person;
	}

}
