package abstracttest;

public class CarEx {

	public static void main(String[] args) {
		// Cannot instantiate the type Car
		// Car car = new Car();  추상클래스는 객체생성을 할수없다!!!
		
		Car car = new SportsCar();
		car.startCar();
		car.drive();
		car.stop();
		car.turnOff();
		
		car = new Truck();
		car.startCar();
		car.drive();
		car.stop();
		car.turnOff();

	}

}
