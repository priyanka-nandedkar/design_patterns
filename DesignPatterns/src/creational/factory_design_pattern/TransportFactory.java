package creational.factory_design_pattern;

import creational.abstract_factory_design_pattern.AbstractFactory;
import creational.abstract_factory_design_pattern.Services;

//public class TransportFactory {
//
//	public Transport getTransport(String transport) {
//
//		if (!transport.equals(null)) {
//
//			if (transport.equalsIgnoreCase("Road"))
//				return new RoadTransport();
//
//			else if (transport.equalsIgnoreCase("Sea"))
//				return new SeaTransport();
//
//			else if (transport.equalsIgnoreCase("Air"))
//				return new AirTransport();
//
//		}
//		return null;
//	}
//
//}

// implementing abstract factory design pattern

public class TransportFactory extends AbstractFactory {

	@Override
	public Transport getTransport(String transport) {
		if (!transport.equals(null)) {

			if (transport.equalsIgnoreCase("Road"))
				return new RoadTransport();

			else if (transport.equalsIgnoreCase("Sea"))
				return new SeaTransport();

			else if (transport.equalsIgnoreCase("Air"))
				return new AirTransport();

		}
		return null;
	}

	@Override
	public Services getServices(String service) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
