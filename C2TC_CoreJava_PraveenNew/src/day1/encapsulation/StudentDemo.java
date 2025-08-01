package day1.encapsulation;

public class StudentDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student obj = new Student();
		
		obj.setId(101);
		obj.setName("Praveen");
		
//		System.out.println(obj.getName());
//		System.out.println(obj.getId());
//		
		
		System.out.println(obj.toString());
		
		
	}
}
