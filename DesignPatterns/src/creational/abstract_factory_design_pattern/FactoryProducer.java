package creational.abstract_factory_design_pattern;

import creational.factory_design_pattern.TransportFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factory) {

		if (!factory.equals(null)) {
			if (factory.equalsIgnoreCase("transport"))
				return new TransportFactory();

			else if (factory.equalsIgnoreCase("services"))
				return new ServiceFactory();

		}
		return null;
	}
}
