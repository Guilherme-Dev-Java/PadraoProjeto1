package br.com.calosguilherme.padaroProjeto1;

public class CarFactory extends Factory {
	
	@Override
	Car retrieveCar(String requestedGarde) {
		switch (requestedGarde) {
		case "A": {
			return new Volkswagem(500, "Full", "White");
		}
		case "B": {
			return new Chevrolet(550,"Full", "Gray");
		}
		case "C": {
			return new Fiat(350, "Full", "Blue");
		}
		case "D": {
			return new Ford(400, "Full", "Black");
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
