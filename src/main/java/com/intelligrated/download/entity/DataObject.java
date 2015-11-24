package com.intelligrated.download.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DataObject implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="order_number")
	private Integer orderNumber;
	
	@Column(name="sku")
	private String sku;
	
	@Column(name="ship_date")
	private LocalDateTime shipDate;
	
	public DataObject(){};
	
	public DataObject(Integer orderNumber, String sku, LocalDateTime shipDate) {
		this.orderNumber = orderNumber;
		this.sku = sku;
		this.shipDate = shipDate;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public LocalDateTime getShipDate() {
		return shipDate;
	}

	public void setShipDate(LocalDateTime shipDate) {
		this.shipDate = shipDate;
	}
	
	@Override
	public String toString() {
		return String.format(
                "DataObject[id=%d, orderNumber='%d', sku='%s, shipDate='%s']",
                id, orderNumber, sku, shipDate.toString());
	}
}
