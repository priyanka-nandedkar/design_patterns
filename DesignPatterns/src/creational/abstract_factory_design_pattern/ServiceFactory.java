package creational.abstract_factory_design_pattern;

import creational.factory_design_pattern.Transport;

public class ServiceFactory extends AbstractFactory {

	@Override
	public Transport getTransport(String transport) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Services getServices(String service) {

		if (!service.equals(null)) {

			if(service.equalsIgnoreCase("imports")) return new Imports();
			
			else if(service.equalsIgnoreCase("exports")) return new Exports();
			
			else if(service.equalsIgnoreCase("goods")) return new ShippingGoods();
			
		}

		return null;
	}

}
