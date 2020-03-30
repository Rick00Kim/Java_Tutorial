package com.siren.bean;

import java.util.Date;

public class OrderBean {
	private int order_num;
	private String id;
	private String menu;
	private String kinds;
	private int price;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String option5;
	private String memo;
	private Date orderdate;
	
	public OrderBean() {	}

	public OrderBean(int order_num, String id, String menu, String kinds, int price, String option1, String option2,
			String option3, String option4, String option5, String memo, Date orderdate) {
		this.order_num = order_num;
		this.id = id;
		this.menu = menu;
		this.kinds = kinds;
		this.price = price;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.option5 = option5;
		this.memo = memo;
		this.orderdate = orderdate;
	}

	public int getOrder_num() {
		return order_num;
	}

	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getOption5() {
		return option5;
	}

	public void setOption5(String option5) {
		this.option5 = option5;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	@Override
	public String toString() {
		return "OrderBean [order_num=" + order_num + ", id=" + id + ", menu=" + menu + ", kinds=" + kinds + ", price="
				+ price + ", option1=" + option1 + ", option2=" + option2 + ", option3=" + option3 + ", option4="
				+ option4 + ", option5=" + option5 + ", memo=" + memo + ", orderdate=" + orderdate + "]";
	}
	
	
}