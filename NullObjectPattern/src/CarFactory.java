public class CarFactory {
    public static Car getCarInstance(String car) {
        if(car.equals("Bmw")) {
            return new Bmw();
        } else if(car.equals("Maruti")){
            return new Maruti();
        }else {
            return new Nullcar();
        }
    }
}
