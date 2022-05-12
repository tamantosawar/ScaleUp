package com.example.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.sun.istack.NotNull;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long orderId;
	
	@NotNull
	private long customerId;
	@NotNull
	private long productId;
	@NotNull
	private String productName;
	
	@NotNull
	private String categoryName;
	
	@NotNull
	private String details;
	@NotNull
	private int price;
	@NotNull
	private int qty;
	@NotNull
	private String image;
	@NotNull
	private long merchantId;
	@NotNull
	private String deliverAddress;
	@NotNull
	private int totalQuantity;
	@NotNull
	private double totalPrice;
	@NotNull
	private String status;
	@NotNull
	@Column(name = "Order_Date")
    private Date orderDate;
	
	public Orders(long orderId, long customerId, long productId, String productName, String categoryName,
			String details, int price, int qty, String image, long merchantId, String deliverAddress, int totalQuantity,
			double totalPrice, String status,Date orderDate) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.productId = productId;
		this.productName = productName;
		this.categoryName = categoryName;
		this.details = details;
		this.price = price;
		this.qty = qty;
		this.image = image;
		this.merchantId = merchantId;
		this.deliverAddress = deliverAddress;
		this.totalQuantity = totalQuantity;
		this.totalPrice = totalPrice;
		this.status=status;
		this.orderDate = orderDate;
	}
	
	
	
	public Date getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}



	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public long getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(long merchantId) {
		this.merchantId = merchantId;
	}
	public String getDeliverAddress() {
		return deliverAddress;
	}
	public void setDeliverAddress(String deliverAddress) {
		this.deliverAddress = deliverAddress;
	}
	public int getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
