package web.serice;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {

	private final List<Car> cars = new ArrayList<>();

	public CarService() {

		cars.add(new Car(1, "1", 1));
		cars.add(new Car(2, "2", 2));
		cars.add(new Car(3, "3", 3));
		cars.add(new Car(4, "4", 4));
		cars.add(new Car(5, "5", 5));

	}

	public List<Car> getCars() {
		return cars;
	}

	public List<Car> getSomeCars(int quantity){
		return cars.stream().limit(quantity).collect(Collectors.toList());
	}
}
