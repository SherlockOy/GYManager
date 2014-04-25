package com.sherlockoy.po;

public class Order {
	private String orderId;
	private String timeSection;
	private String date;
	private String item;
	private String subscriber;

	public Order() {
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTimeSection() {
		return timeSection;
	}

	public void setTimeSection(String timeSection) {
		this.timeSection = timeSection;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(String subscriber) {
		this.subscriber = subscriber;
	}

}
