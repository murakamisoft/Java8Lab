package object;

public class Staff {
	private String name;
	private String gender;
	private int age;
	private int salary;

	public Staff(String name, String gender, int age, int salary) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return name + ", " + gender + ", " + age + ", " + salary;
	}
}
