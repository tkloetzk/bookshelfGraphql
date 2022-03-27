package com.kloetzke.bookshelf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "amazonAverageRating")
	private Double amazonAverageRating;

	@Column(name = "amazonRatingsCount")
	private Integer amazonRatingsCount;

//	@Column(name = "categories")
//	private String[] categories;

	@Column(name = "description")
	private String description;

	@Column(name = "goodreadsAverageRating")
	private Double goodreadsAverageRating;

	@Column(name = "goodreadsRatingsCount")
	private Integer goodreadsRatingsCount;

	@Column(name = "isbn")
	private String isbn;

	@Column(name = "title")
	private String title;

	@Column(name = "owned")
	private Boolean owned;

	@Column(name = "price")
	private String price;

	@Column(name = "subtitle")
	private String subtitle;

	@Column(name = "thumbnail")
	private String thumbnail;

	@Column(name = "unread")
	private Boolean unread;

	public Book() {

	}
	
	public Book(String isbn, String title) {
		super();
		this.isbn = isbn;
		this.title = title;
	}

	public Book(Double amazonAverageRating, Integer amazonRatingsCount, String description,
			Double goodreadsAverageRating, Integer goodreadsRatingsCount, String isbn, String title, Boolean owned,
			String price, String subtitle, String thumbnail, Boolean unread) {
		super();
		this.amazonAverageRating = amazonAverageRating;
		this.amazonRatingsCount = amazonRatingsCount;
	//	this.categories = categories;
		this.description = description;
		this.goodreadsAverageRating = goodreadsAverageRating;
		this.goodreadsRatingsCount = goodreadsRatingsCount;
		this.isbn = isbn;
		this.title = title;
		this.owned = owned;
		this.price = price;
		this.subtitle = subtitle;
		this.thumbnail = thumbnail;
		this.unread = unread;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getAmazonAverageRating() {
		return amazonAverageRating;
	}

	public void setAmazonAverageRating(Double amazonAverageRating) {
		this.amazonAverageRating = amazonAverageRating;
	}

	public Integer getAmazonRatingsCount() {
		return amazonRatingsCount;
	}

	public void setAmazonRatingsCount(Integer amazonRatingsCount) {
		this.amazonRatingsCount = amazonRatingsCount;
	}

//	public String[] getCategories() {
//		return categories;
//	}
//
//	public void setCategories(String[] categories) {
//		this.categories = categories;
//	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getGoodreadsAverageRating() {
		return goodreadsAverageRating;
	}

	public void setGoodreadsAverageRating(Double goodreadsAverageRating) {
		this.goodreadsAverageRating = goodreadsAverageRating;
	}

	public Integer getGoodreadsRatingsCount() {
		return goodreadsRatingsCount;
	}

	public void setGoodreadsRatingsCount(Integer goodreadsRatingsCount) {
		this.goodreadsRatingsCount = goodreadsRatingsCount;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getOwned() {
		return owned;
	}

	public void setOwned(Boolean owned) {
		this.owned = owned;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Boolean getUnread() {
		return unread;
	}

	public void setUnread(Boolean unread) {
		this.unread = unread;
	}
}