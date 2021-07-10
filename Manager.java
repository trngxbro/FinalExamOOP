import java.util.ArrayList;

public class Manager {
	public static double TotalCostOfJournal (ArrayList list) {
		ArrayList<Journal> j = new ArrayList();
		double total = 0;
		for(int i=0; i<list.size(); i++){
			if(list.get(i) instanceof Journal)
			{
				j.add((Journal)list.get(i));
			}
		}
		
		for(int i=0; i<j.size(); i++){
			total += j.get(i).cost();
		}
		return total;
	}
}