package day2;

public class Customer {
	private int cid;
	private String cname;
	private String city;
	
	public Customer() {//Default Constructor   - initiailize default value to the objects 
		
		//this(); //invoke the default constructor
		this.cid = 100;
		this.cname = "unknown";
		this.city = "Puducherry";
	}
	
	@Override
	public String toString() {
		return "Customer cid=" + cid + ", cname=" + cname + ", city=" + city;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String canme) {
		this.cname = canme;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
