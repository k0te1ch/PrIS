public class institute {

	public String name;
	public String address;

	/**
	 *
	 * @param name
	 * @param address
	 */
	public institute(String name, String address) {
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "institute{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}