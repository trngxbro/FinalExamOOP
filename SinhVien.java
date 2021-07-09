public class SinhVien {
	private String name;
	private String id;
	private String dateOfBirdth;
	
	public SinhVien (String name, String id) {
		this.name 			= name;
		this.id				= id;
		this.dateOfBirdth	= "01/01/2021";
	}
	public SinhVien (String name, String id, String dateOfBirdth) {
		this.name 			= name;
		this.id				= id;
		this.dateOfBirdth	= dateOfBirdth;
	}
	
	public String getName() {
		return this.name;
	}
	public String getID() {
		return this.id;
	}
	public String getDOB() {
		return this.dateOfBirdth;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	public void setID(String id) {
		this.id = this.id;
	}
	public void setDOB() {
		this.dateOfBirdth = this.dateOfBirdth;
	}
	
	public String toString() {
		return "        Name:  " + name + "\n        ID:    " + id + "\nDate of Birth: " + dateOfBirdth;
	}
}