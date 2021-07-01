package creational.factory_design_pattern;

public class FactoryDesignPattern {

	public static void main(String[] args) {

		TransportFactory factory = new TransportFactory();
		
		Transport roadTransport = factory.getTransport("Road");
		roadTransport.deliver();
		
		Transport airTransport = factory.getTransport("Air");
		airTransport.deliver();
		
		Transport seaTransport = factory.getTransport("sea");
		seaTransport.deliver();
		
	}

}
