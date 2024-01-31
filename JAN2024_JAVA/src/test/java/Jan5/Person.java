package Jan5;

class AgeException extends Exception{
	private int age;
	
	AgeException(int a){
		age = a;
	}
	public String toString() {
		return age +" is an invalid age";
	}
}

public class Person {
	 public String name;
	  public int age;
	public Person(String name, String string) {
		
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person2_1 [name=" + name + ", age=" + age + "]";
	}
	
	void getempdetails() throws AgeException {

		if(age<15) {
			throw new AgeException(age);
		}
		else {
			System.out.println("Name: "+name+ "\n Age:" +age);
		}
	
	}
}
