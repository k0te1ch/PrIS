public class Faculty {

	public String name;
	public Employee dean;

	@Override
	public String toString() {
		return "Faculty{" +
				"name='" + name + '\'' +
				", dean=" + dean +
				'}';
	}

	/**
	 * 
	 * @param dean
	 * @param name
	 */
	public Faculty(Employee dean, String name) {
		this.name = name;
		this.dean = dean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getDean() {
		return dean;
	}

	public void setDean(Employee dean) {
		this.dean = dean;
	}
}