package com.March18;

public class Books {
	private int bookId;
	private String bookName;
	private String authName;
	public Books(int bookId, String bookName, String authName, int prize) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authName = authName;
		this.prize = prize;
	}

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", authName=" + authName + ", prize=" + prize
				+ "]";
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	private int prize;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
