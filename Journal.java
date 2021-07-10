public class Journal extends Book {
	private int date, period;
	
	public Journal (int orgPrice, String bookName, String published, int date, int period) {
		super (orgPrice, bookName, published);
		this.date = date;
		this.period = period;
	}
	
	public Journal () {
		super ();
		this.date = 285;
		this.period = 10;
	}
	
	public double cost() {
		return this.orgPrice - this.orgPrice*0.1;
	}
	
	public boolean isAttach () {
		if (orgPrice>=100000 && published.equals("Am nhac")==true)
			return true;
		if (orgPrice>=300000 && published.equals("Thoi trang")==true)
			return true;
		return false;
	}
	
	public boolean isSpecial () {
		if (published.equals("Thoi trang")==true)
			if (period==1 || period==6 || period==12)
				return true;
		if (published.equals("Am nhac")==true)
			if (period==3 || period==9)
				return true;
		return false;
	}
	
	@Override
	public String toString () {
		return "\nName: " + bookName + "\nCost: " + cost() + "\nAttach:  " + isAttach() + "\nSpecial: " + isSpecial(); 
	}
}