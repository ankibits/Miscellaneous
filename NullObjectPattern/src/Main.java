public class Main {
    public static void main(String[] args) {

        Car car = CarFactory.getCarInstance("Bmw");
        car.printPrice();
        car = CarFactory.getCarInstance("Maruti");
        car.printPrice();
        car = CarFactory.getCarInstance("mercedes");
        car.printPrice();
    }
}