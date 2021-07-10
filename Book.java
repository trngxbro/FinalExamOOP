public abstract class Book {
	public int orgPrice;
	public String bookName, published;
	
	public Book (int orgPrice, String bookName, String published) {
		this.orgPrice = orgPrice;
		this.bookName = bookName;
		this.published = published;
	}
	
	public Book () {
		this.orgPrice = 100000;
		this.bookName = "Object-Oriented Programming";
		this.published = "Java";
	}
	
	public double Discount () {
		if (this.orgPrice>=300000){
			if (this.published.equals("Thoi trang"))
				return 0.1;
			if (this.published.equals("Giao duc"))
				return 0.25;
			if (this.published.equals("Van hoc"))
				return 0.5;
			if (this.published.equals("Am nhac"))
				return 0.75;
		}
		return 0;
	}
	
	public double FinalCost () {
		return this.orgPrice - this.orgPrice*Discount();
	}
	
	public abstract double cost();
	
	@Override
	public String toString () {
		return "Name: " + bookName + "\nCost: " + FinalCost();
	}
}