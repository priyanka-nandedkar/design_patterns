package creational.abstract_factory_design_pattern;

import creational.factory_design_pattern.Transport;

public class AbstractFactoryDesignPattern {

	public static void main(String[] args) {

		AbstractFactory absTransportFactory = FactoryProducer.getFactory("transport");
		AbstractFactory absServicesFactory = FactoryProducer.getFactory("services");

		Services imports = absServicesFactory.getServices("imports");
		imports.shipWithinIndia();
		imports.shipUrgentDeliverables();
		imports.shipOutsideOfIndia();

		Services exports = absServicesFactory.getServices("exports");
		exports.shipWithinIndia();
		exports.shipUrgentDeliverables();
		exports.shipOutsideOfIndia();

		Services goods = absServicesFactory.getServices("goods");
		goods.shipWithinIndia();
		goods.shipUrgentDeliverables();
		goods.shipOutsideOfIndia();

		System.out.println("***********************************************");

		Transport roadTransport = absTransportFactory.getTransport("road");
		roadTransport.deliver();

		Transport seaTransport = absTransportFactory.getTransport("sea");
		seaTransport.deliver();

		Transport airTransport = absTransportFactory.getTransport("air");
		airTransport.deliver();

	}

}
