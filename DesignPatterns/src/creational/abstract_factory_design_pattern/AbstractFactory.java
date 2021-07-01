package creational.abstract_factory_design_pattern;

import creational.factory_design_pattern.Transport;

public abstract class AbstractFactory {

	public abstract Transport getTransport(String transport);

	public abstract Services getServices(String service);
}
