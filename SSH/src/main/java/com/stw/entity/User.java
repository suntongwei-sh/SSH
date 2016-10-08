package com.stw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class User {

	private Integer id;
	private String userName;
	private String password;

	// private String address;
	// private String phoneNumber;
	// private Date createTime;
	// private Date updateTime;

	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@GeneratedValue(generator = "generator")
	@Column(name = "ID", length = 11)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "username", length = 20)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "password", length = 20)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}

	/*
	 * @Column(name = "address", length = 100) public String getAddress() {
	 * return address; }
	 * 
	 * public void setAddress(String address) { this.address = address; }
	 * 
	 * @Column(name = "phone_number", length = 20) public String
	 * getPhoneNumber() { return phoneNumber; }
	 * 
	 * public void setPhoneNumber(String phoneNumber) { this.phoneNumber =
	 * phoneNumber; }
	 * 
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @Column(name = "create_time") public Date getCreateTime() { return
	 * createTime; }
	 * 
	 * public void setCreateTime(Date createTime) { this.createTime =
	 * createTime; }
	 * 
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @Column(name = "update_time") public Date getUpdateTime() { return
	 * updateTime; }
	 * 
	 * public void setUpdateTime(Date updateTime) { this.updateTime =
	 * updateTime; }
	 */
}
