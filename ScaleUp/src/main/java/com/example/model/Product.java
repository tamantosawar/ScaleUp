package com.example.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long prod_id;

	@NotNull
	private String name;
	
	@NotNull
	private String category;
	
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

	/*
	 * @ManyToOne//with cart
	 * 
	 * @JoinColumn(name="id")//primaru key of cart
	 * 
	 * private Merchant merchant;
	 * 
	 * @OneToMany(mappedBy="product",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	 * 
	 * private List<Cart> cartItems;
	 */

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(long merchantId) {
		this.merchantId = merchantId;
	}

	
	public Long getProd_id() {
		return prod_id;
	}

	public void setProd_id(Long prod_id) {
		this.prod_id = prod_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Product(Long prod_id, String name, String category, String details, int price, int qty, String image,
			long merchantId) {
		super();
		this.prod_id = prod_id;
		this.name = name;
		this.category = category;
		this.details = details;
		this.price = price;
		this.qty = qty;
		this.image = image;
		this.merchantId = merchantId;
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

	@Override
	public String toString() {
		return "Product [prod_id=" + prod_id + ", name=" + name + ", category=" + category + ", details="
				+ details + ", price=" + price + ", qty=" + qty + ", image=" + image + ", merchantId=" + merchantId
				+ "]";
	}

	
}
