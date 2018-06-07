
public class Galaxy extends AbstractPhone implements Ringable{
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return "Galaxy " + this.getVersionNumber() + " from " + this.getCarrier();
        // your code here
    }
    @Override
    public String unlock() {
        // your code here
		return "Galaxy " + this.getVersionNumber() + " says " + this.getRingTone();
    }
    @Override
    public void displayInfo() {
        // your code here       
    	System.out.println("Unlocking via FingerPrint");
    	
    }
}
