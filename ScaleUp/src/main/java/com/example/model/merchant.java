package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

    @Entity
	@Table(name="Merchant")
	public class merchant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String nameOfFirm;
	@NotNull
	private String merchantName;
	@NotNull
	private Integer mobileNo;
	@NotNull
	private String address;
	@NotNull
	private String GSTNo;
	@NotNull
	private String email;
	@NotNull
	private String password;
	public merchant(Long id, String nameOfFirm, String merchantName, Integer mobileNo, String address, String gSTNo,
			String email, String password) {
		super();
		this.id = id;
		this.nameOfFirm = nameOfFirm;
		this.merchantName = merchantName;
		this.mobileNo = mobileNo;
		this.address = address;
		this.GSTNo = gSTNo;
		this.email = email;
		this.password = password;
	}
	public merchant() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameOfFirm() {
		return nameOfFirm;
	}
	public void setNameOfFirm(String nameOfFirm) {
		this.nameOfFirm = nameOfFirm;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public Integer getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGSTNo() {
		return GSTNo;
	}
	public void setGSTNo(String gSTNo) {
		this.GSTNo = gSTNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Merchant [id=" + id + ", nameOfFirm=" + nameOfFirm + ", merchantName=" + merchantName + ", mobileNo="
				+ mobileNo + ", address=" + address + ", GSTNo=" + GSTNo + ", email=" + email + ", password=" + password
				+ "]";
	}

}
