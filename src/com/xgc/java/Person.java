/*
 * 说明
 * 创建时间 2013-5-3
 * 修改日期
 * 文件名称 Person.java
 * @author Administrator
 */

package com.xgc.java;


/**
 * <p><b>说	明</b></p> 
 * @author xie.gc
 */
public class Person {
	public final String first;
	public final String last;
	public final String address;
	
	public Person(String first, String last, String address){
		this.first = first;
		this.last = last;
		this.address = address;
	}
	
	public String toString(){
		return "Person" + first + " " + last + " " + address;
	}
	
	public static class NullPerson extends Person implements NULL{
		private NullPerson(){
			super("None", "None", "None");
		}
		
		public String toString() {
			return "NullPerson";
		}
	}
	
	public static final Person NULL = new NullPerson();
}
