package Collect_Exercise;

public class SecondaryData {

	private String mobileNumber;
	private String address;

	public SecondaryData() {

	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "SecondaryData [mobileNumber=" + mobileNumber + ", address=" + address + "]";
	}

}
