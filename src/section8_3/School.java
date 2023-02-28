package section8_3;

public class School {
	
	 String name;
	 int id;
	
	
	public String getName() {
		
		return this.name;
		
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		
		return this.id;
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		System.out.println("this is a print method from School class");
	}

}
