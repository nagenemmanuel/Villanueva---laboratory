import java.util.Scanner;
// main class
class Vehicle {
    private String brand;
    private int speed;
    private String fuelType;
 
    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }
 
    public String getBrand() {
        return brand;
    }
 
    public int getSpeed() {
        return speed;
    }
 
    public String getFuelType() {
        return fuelType;
    }
 
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}
 
// Car class
class Car extends Vehicle {
    private int numDoors;
 
    public Car(String brand, int speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }
 
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}
 
// Motorcycle subclass
class Motorcycle extends Vehicle {
    private boolean hasSidecar;
 
    public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }
 
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
 
// class to vehicles
public class TestVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        //car
        System.out.println("Car company / brand");
        System.out.print("Brand: ");
        String carBrand = scanner.nextLine();
        System.out.print("Speed: ");
        int carSpeed = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fuel Type: ");
        String carFuel = scanner.nextLine();
        System.out.print("Number of Doors: ");
        int carDoors = scanner.nextInt();
        scanner.nextLine();
 
        // Motorcycle info
        System.out.println("\nEnter Motorcycle Details:");
        System.out.print("Brand: ");
        String motoBrand = scanner.nextLine();
        System.out.print("Speed: ");
        int motoSpeed = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fuel Type: ");
        String motoFuel = scanner.nextLine();
        System.out.print("Has Sidecar (true/false): ");
        boolean hasSidecar = scanner.nextBoolean();
 
        
        Car car = new Car(carBrand, carSpeed, carFuel, carDoors);
        Motorcycle motorcycle = new Motorcycle(motoBrand, motoSpeed, motoFuel, hasSidecar);
 
        
        System.out.println("\nCar Specs:");
        car.displayInfo();
 
        System.out.println("\nMotor specs:");
        motorcycle.displayInfo();
 
        // End
        scanner.close();
    }
}