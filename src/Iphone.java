
public class Iphone extends AbstractPhone implements Ringable {
	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
	

	
    @Override
    public String ring() {
        // your code here
    	
    	return "IPhone " + this.getVersionNumber() + " from " + this.getCarrier();
    }
    @Override
    public String unlock() {
        // your code here
    	return "IPhone " + this.getVersionNumber() + " says " + this.getRingTone();
    }
    @Override
    public void displayInfo() {
        // your code here     
    	System.out.println("Unlocking via facialRecogniztion");
    }
}
