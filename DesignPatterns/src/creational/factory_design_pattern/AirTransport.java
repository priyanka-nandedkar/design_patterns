package creational.factory_design_pattern;

public class AirTransport implements Transport {

	@Override
	public void deliver() {
		System.out.println("Shipments are shipped by Plane");
		
	}

	@Override
	public boolean isCheckPassRequired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getLicenseCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modeOfTransport() {
		// TODO Auto-generated method stub
		
	}

}
