package homeWork4;


import homeWork4.details.Engine;
import homeWork4.professions.Driver;
import homeWork4.vehicles.SportCar;
import homeWork4.vehicles.Truck;

public class Test {
    public static void main(String[] args) {
        Driver driver = new Driver("Artem",14, 29,"Artem Odudenko");
        Engine engine = new Engine(3000,"Tesla Company");
        SportCar sportCar = new SportCar("Tesla", "sport car", 980, 390, driver, engine);
        Truck truck = new Truck("MAN","TGX",1400, driver, engine,6000);

        System.out.println(sportCar);
        System.out.println(truck);
        sportCar.printInfo();
        truck.printInfo();
        System.out.println(driver);
    }
}