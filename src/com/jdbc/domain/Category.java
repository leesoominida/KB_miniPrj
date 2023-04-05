package com.jdbc.domain;

public class Category {
	private int categoryNum;
	private String categoryName;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(int categoryNum, String categoryName) {
		super();
		this.categoryNum = categoryNum;
		this.categoryName = categoryName;
	}
	public int getCategoryNum() {
		return categoryNum;
	}
	public void setCategoryNum(int categoryNum) {
		this.categoryNum = categoryNum;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "Category [categoryNum=" + categoryNum + ", categoryName=" + categoryName + "]";
	}
	
	

}
