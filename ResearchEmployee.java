public class ResearchEmployee extends Employee {
	public String fieldOfStudy;

	@Override
	public String toString() {
		return "ResearchEmployee{" +
				"name='" + name + '\'' +
				", email='" + email + '\'' +
				", ssNo=" + ssNo +
				'}';
	}

	/**
	 * 
	 * @param ssNo
	 * @param name
	 * @param email
	 */
	public ResearchEmployee(int ssNo, String name, String email, String fieldOfStudy) {
		super(ssNo, name, email);
		this.fieldOfStudy = fieldOfStudy;
	}

	public String getFieldOfStudy() {
		return fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}
}