public class Literature extends Book {
	private String authur;
	private int year;
	
	public Literature (int orgPrice, String bookName, String published, String authur, int year) {
		super (orgPrice, bookName, published);
		this.authur = authur;
		this.year = year;
	}
	
	public Literature () {
		super ();
		this.authur = "TDTU";
		this.year = 2021;
	}
	
	public double cost () {
		return this.orgPrice - this.orgPrice*0.05;
	}
	
	public boolean isGift () {
		if (this.year==2021 && published.equals("Giao duc")==true)
			return true;
		return false;
	}
	
	public double FinalCost () {
		return cost() - 50000;
	}
	
	@Override
	public String toString () {
		return "\nName: " + bookName + "\nGift: " + isGift() + "\nCost: " + cost();
	}
}