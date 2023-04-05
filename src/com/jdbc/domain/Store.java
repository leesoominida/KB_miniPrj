package com.jdbc.domain;

public class Store {
	private int storeNum;
	private String info;
	private String name;
	private String location;
	private String address;
	private String storeTel;
	private String openDate;
	private int open;
	private int minPrice;
	private int maxPrice;
	private int categoryId;
	

	
	
	public Store() {
		super();
	}

	public Store(int storeNum, String info, String name, String location, String address, String storeTel,
			String openDate, int open, int minPrice, int maxPrice, int categoryId) {
		super();
		this.storeNum = storeNum;
		this.info = info;
		this.name = name;
		this.location = location;
		this.address = address;
		this.storeTel = storeTel;
		this.openDate = openDate;
		this.open = open;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.categoryId = categoryId;
	}

	public int getStoreNum() {
		return storeNum;
	}

	public void setStoreNum(int storeNum) {
		this.storeNum = storeNum;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStoreTel() {
		return storeTel;
	}

	public void setStoreTel(String storeTel) {
		this.storeTel = storeTel;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public int getOpen() {
		return open;
	}

	public void setOpen(int open) {
		this.open = open;
	}

	public int getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}

	public int getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "Store [storeNum=" + storeNum + ", info=" + info + ", name=" + name + ", location=" + location
				+ ", address=" + address + ", storeTel=" + storeTel + ", openDate=" + openDate + ", open=" + open
				+ ", minPrice=" + minPrice + ", maxPrice=" + maxPrice + ", categoryId=" + categoryId + "]";
	}
	
	
}
