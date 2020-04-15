package course.udemy.SpringDemo;

public class Alien {
	
	private int age;
	private Computer lap;
	
	
	
	public Computer getLap() {
		return lap;
	}

	public void setLap(Computer lap) {
		System.out.println("Laptop assigned");
		this.lap = lap;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Age assigned in Setter...");
		this.age = age;
	}

	/*
	 * public Alien(int age) { // TODO Auto-generated constructor stub this.age=age;
	 * }
	 */

	public void code() {
		System.out.println("Coding");
	}
}
