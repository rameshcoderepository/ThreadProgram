package Collect_Exercise;

public class PrimaryData {

	private String mobileNumber;
	private String name;

	public PrimaryData() {

	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PrimaryData [mobileNumber=" + mobileNumber + ", name=" + name + "]";
	}

}