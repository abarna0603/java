package com;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class book {

	    @Id
		private int id;
		private String title;
		private String author;
		private  String genre;
		private int publishedYear;
		private double price;
		private boolean available;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public int getPublishedYear() {
			return publishedYear;
		}
		public void setPublishedYear(int publishedYear) {
			this.publishedYear = publishedYear;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public boolean isAvailable() {
			return available;
		}
		public void setAvailable(boolean available) {
			this.available = available;
		}
		@Override
		public String toString() {
			return "book [id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre
					+ ", publishedYear=" + publishedYear + ", price=" + price + ", available=" + available + "]";
		}
		


	}



