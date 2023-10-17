package lesson1;

public class Carsimulation {
    public static void main(String[] args) {
        Car kaylumCar = new Car("Honda","Civic",2023,1000.2);
        Car mayasCar = new Car("Jeep","Cherooke", 2001, 1.9);

        kaylumCar.drive(2929219);
        mayasCar.printCarInfo();
    }
}
