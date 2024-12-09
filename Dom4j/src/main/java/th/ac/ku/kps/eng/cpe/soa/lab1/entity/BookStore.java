package th.ac.ku.kps.eng.cpe.soa.lab1.entity;

public class BookStore {
	public String title;
	public String author;
	public String catagory;
	public int year;
	public byte edition;
	public double price;
	
	public BookStore(String title,String author,String catagory,int year,byte edition,double price){
		this.title = title;
		this.author = author;
		this.catagory = catagory;
		this.year = year;
		this.edition = edition;
		this.price = price;
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

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public byte getEdition() {
		return edition;
	}

	public void setEdition(byte edition) {
		this.edition = edition;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
