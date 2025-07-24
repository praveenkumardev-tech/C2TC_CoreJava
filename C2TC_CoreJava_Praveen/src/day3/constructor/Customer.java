package day3.constructor;

public class Customer {
	private int id;
	private String name;
	private String product;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", product=" + product + "]";
	}
	
	
}
