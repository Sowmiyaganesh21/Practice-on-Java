class Vehicle{
    public void start(){
        System.out.println("vehicle started");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("car driving");
    }
}
class SportsCar extends Car{
    void drive(){
        System.out.println("Sports car driving fast");
}
}
public class Vehicles{
    public static void main(String[] args) {
        Vehicle bike=new Vehicle();
        bike.start();
        Car car=new Car();
        car.start();
        car.drive();
        SportsCar spcar=new SportsCar();
        spcar.start();
        spcar.drive();
    }
}
