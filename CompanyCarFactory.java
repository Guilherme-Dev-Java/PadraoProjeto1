package br.com.calosguilherme.padaroProjeto1;

public class CompanyCarFactory extends Factory {

	@Override
	Car retrieveCar(String requestedGarde) {
		switch (requestedGarde) {
		case "A": {

			return new Tesla(1000, "Full", "Black");
		}
		case "B": {

			return new Audi(950, "Full", "White");
		}
		case "C": {

			return new Ferrari(1200, "Full", "Red");
		}
		case "D": {

			return new Lamborghini(1500, "Full", "Yellow");
		}
		case "E": {
			return new Toyota(750, "Full", "Black");
		}
		default:
			System.out.println("The requested car was unfortunately not availeble.");
			return null;
		}
	}

}
