package employee;

public class Premament {
	private String name;
	private int payCheck;
	/*private int geunsok;*/
	
	public Premament(String name, int payCheck){
		this.name=name;
		this.payCheck=payCheck;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBill() {
		return payCheck;
	}

	public void setBill(int payCheck) {
		this.payCheck = payCheck;
	}	
	public String toString(){
		return "Name : "+name+", Pay : "+payCheck;
	}
}
