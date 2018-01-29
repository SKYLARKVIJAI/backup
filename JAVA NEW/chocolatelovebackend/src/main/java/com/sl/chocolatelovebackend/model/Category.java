package com.sl.chocolatelovebackend.model;
import javax.persistence.*;


@Entity
public class Category {
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int categoryId;
	private String categoryName;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
