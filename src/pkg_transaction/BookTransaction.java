package pkg_transaction;

import java.io.Serializable;

public class BookTransaction implements Serializable{
	private int isbn;
	private int rollNo;
	
	private String issueDate;
	private String returnDate;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public BookTransaction(int isbn, int rollNo, String issueDate, String returnDate) {
		super();
		this.isbn = isbn;
		this.rollNo = rollNo;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
	}
	public BookTransaction() {
		super();
	}
	@Override
	public String toString() {
		return "BookTransaction [isbn=" + isbn + ", rollNo=" + rollNo + ", issueDate=" + issueDate + ", returnDate="
				+ returnDate + "]";
	}
	
	
}
