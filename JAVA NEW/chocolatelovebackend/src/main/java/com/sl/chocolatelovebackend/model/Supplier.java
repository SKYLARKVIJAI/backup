package com.sl.chocolatelovebackend.model;
import javax.persistence.*;

@Entity
public class Supplier {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int supplierId;
	private int supplierPincode;
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public int getSupplierPincode() {
		return supplierPincode;
	}
	public void setSupplierPincode(int supplierPincode) {
		this.supplierPincode = supplierPincode;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierEmail() {
		return supplierEmail;
	}
	public void setSupplierEmail(String supplierEmail) {
		this.supplierEmail = supplierEmail;
	}
	public String getSupplierAddress() {
		return supplierAddress;
	}
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	public String getSupplierCity() {
		return supplierCity;
	}
	public void setSupplierCity(String supplierCity) {
		this.supplierCity = supplierCity;
	}
	public long getSupplierContact() {
		return supplierContact;
	}
	public void setSupplierContact(long supplierContact) {
		this.supplierContact = supplierContact;
	}
	private String supplierName ,supplierEmail,supplierAddress,supplierCity;
	private long supplierContact;
	
	
	
	
	
	
}
