public class IPhone extends Phone implements Ringable {
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	public String ring() {
		String str = ("iPhone "+ this.getVersionNumber() + " says "+ this.getRingTone());
		return str;
	}
	public 	String unlock() {
		String str = "Unlocking via facial recognition";
		return str;		
	}
	public 	void displayInfo() {
		String str = ("iPhone "+this.getVersionNumber()+" from " + this.getCarrier());
		System.out.println(str);
	}
}