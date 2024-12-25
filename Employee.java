public class Employee {

	public static int counter;
	public String name;
	public String email;
	public int ssNo;

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", email='" + email + '\'' +
				", ssNo=" + ssNo +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSsNo() {
		return ssNo;
	}

	public void setSsNo(int ssNo) {
		this.ssNo = ssNo;
	}

	public static int getCounter() {
		return counter;
	}

	/**
	 * 
	 * @param ssNo
	 * @param name
	 * @param email
	 */
	public Employee(int ssNo, String name, String email) {
		counter++;
		this.ssNo = ssNo;
		this.name = name;
		this.email = email;
	}

}