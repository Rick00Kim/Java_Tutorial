package com.siren.bean;


public class CafeMenuBean {
	private String kinds;
	private String menu;
	private int price;
	
	public CafeMenuBean(){}

	public CafeMenuBean(String kinds, String menu, int price) {
		this.kinds = kinds;
		this.menu = menu;
		this.price = price;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "CafeMenuBean [kinds=" + kinds + ", menu=" + menu + ", price=" + price + "]";
	}

	
}