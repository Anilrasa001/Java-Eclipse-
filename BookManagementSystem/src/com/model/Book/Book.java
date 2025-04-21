package com.model.Book;

public class Book {
		int  bookID;
		String  title;
		String  author;
		String category;
		float  price;
		public Book(int bookID, String title, String author, String category, float price) {
			super();
			this.bookID = bookID;
			this.title = title;
			this.author = author;
			this.category = category;
			this.price = price;
		}
		public int getBookID() {
			return bookID;
		}
		public void setBookID(int bookID) {
			this.bookID = bookID;
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
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Book [bookID=" + bookID + ", title=" + title + ", author=" + author + ", category=" + category
					+ ", price=" + price + "]";
		}
		

}
