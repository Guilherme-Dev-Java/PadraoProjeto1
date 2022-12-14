package br.com.calosguilherme.padaroProjeto1;

public class Demo {

	public static void main(String[] args) {
		Customer customeOne = new Customer("B", true);
		Factory factory = getCarFactory(customeOne);
		Car carOne = factory.create(customeOne.getGradeRequest());
		carOne.startEngine();
	}

	private static Factory getCarFactory(Customer customer) {
		if(customer.hasComapanyContract()) {
			return new CompanyCarFactory();
		}else {
			return new CarFactory();
		}
		
	}
	
	
	
}
