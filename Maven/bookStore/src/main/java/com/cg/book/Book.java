package com.cg.book;
//
//public class Book {
//	public String Sample() {
//		return "sample";
//	}
//
//}


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
@Id
	private Long id;
	private String title;
	private String description;
	private String unitCost;
	private String isbn;
	private Integer nbOfPage;
	
	public Book() {
		
	}
	
	public Book(Long id) {
		this.id = id;
	}
	
	public Book(Long id, String title, String description, String unitCost,
	String isbn, Integer nbOfPage) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.unitCost = unitCost;
		this.isbn = isbn;
		this.nbOfPage = nbOfPage;
	}
	
	Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(String unitCost) {
		this.unitCost = unitCost;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getNbOfPage() {
		return nbOfPage;
	}
	public void setNbOfPage(Integer nbOfPage) {
		this.nbOfPage = nbOfPage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((nbOfPage == null) ? 0 : nbOfPage.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((unitCost == null) ? 0 : unitCost.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (nbOfPage == null) {
			if (other.nbOfPage != null)
				return false;
		} else if (!nbOfPage.equals(other.nbOfPage))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (unitCost == null) {
			if (other.unitCost != null)
				return false;
		} else if (!unitCost.equals(other.unitCost))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + ", unitCost=" + unitCost
				+ ", isbn=" + isbn + ", nbOfPage=" + nbOfPage + ", getId()=" + getId() + ", getTitle()=" + getTitle()
				+ ", getDescription()=" + getDescription() + ", getUnitCost()=" + getUnitCost() + ", getIsbn()="
				+ getIsbn() + ", getNbOfPage()=" + getNbOfPage() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	

}
