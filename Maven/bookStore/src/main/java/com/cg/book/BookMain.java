package com.cg.book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookMain {
	public static void main(String[] args) {
		persistBook(new Book(5044L, "H2G2", "Best IT Scifi Book", "12.5f", "GH4507", 1235));
		Book book = findBook(5000L);
		System.out.println("#" + book);
	}

	//Get an entity manager
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("module-01-persistence-unit");
	private static EntityManager em = emf.createEntityManager();
	
	// Persists the book to the database
	private static void persistBook(Book book) {
		em.persist(book);
	}
	
	//Find the book from the database
	private static Book findBook(Long id) {
		return em.find(Book.class, id);
	}


}
