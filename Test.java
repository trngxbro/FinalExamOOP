import java.util.ArrayList;

public class Test extends Manager{	
	public static void main (String [] args) {
		//Create Object - Journal, Literature
		Journal journal 	  = new Journal();
		Literature literature = new Literature ();
		
		System.out.println(journal);
		System.out.println();
		System.out.println(literature);
		System.out.println("-----------------------");
		
		//Book List
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(new Journal(100000, "The Art"		, "Thoi trang", 250, 1));
		list.add(new Journal(200000, "Sketch Book"	, "Thoi trang", 300, 2));
		list.add(new Journal(350000, "Stylish"		, "Thoi trang", 100, 3));
		list.add(new Journal(650000, "Mix Mag"		, "Am nhac"	  , 50 , 1));
		list.add(new Journal(100000, "Rolling Stone", "Am nhac"	  , 100, 2));
		list.add(new Journal(200000, "Bill Broad"	, "Am nhac"	  , 200, 3));
		list.add(new Literature(75000 , "Animal Farm"	, "Giao duc", "A", 2021));
		list.add(new Literature(150000, "Moby-Dick"		, "Giao duc", "B", 2002));
		list.add(new Literature(250000, "Middlemarch"	, "Giao duc", "V", 1984));
		list.add(new Literature(90000 , "Dracula"		, "Van hoc",  "T", 1965));
		list.add(new Literature(500000, "Harry Poster"	, "Van hoc",  "W", 1998));
		list.add(new Literature(450000, "Breaking Dawn"	, "Van hoc",  "L", 2010));
		
		System.out.println();;
        for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
        }
		System.out.println("-----------------------");
		
		//Call Method in class Manager
		System.out.println();
		System.out.println("Total Cost of Journal: " + TotalCostOfJournal(list));
	}
}