public class Course {

	public int id;
	public String name;
	public float hours;

	public Course(int id, String name, float hours) {
		this.id = id;
		this.name = name;
		this.hours = hours;
	}

	/**
	 * 
	 * @param name
	 * @param id
	 * @param hours
	 */
	public Course(String name, int id, int hours) {
		// TODO - implement Course.Course
		throw new UnsupportedOperationException();
	}

}