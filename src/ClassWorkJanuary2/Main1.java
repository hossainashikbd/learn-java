package ClassWorkJanuary2;

class Vehicle {
    
    protected int speed;

    public Vehicle() {
        this.speed = 0;
    }
    
    public void speedUp() {
        System.out.println("Vehicle is speeding up.");
    }

    public int getSpeed() {
        return speed;
    }
}

class Car extends Vehicle {

    @Override
    public void speedUp() {
        speed += 20; 
        System.out.println("Car is speeding up. Current speed: " + speed + " km/h");
    }
}

class Bicycle extends Vehicle {

    @Override
    public void speedUp() {
        speed += 5; 
        System.out.println("Bicycle is speeding up. Current speed: " + speed + " km/h");
    }
}

public class Main1 {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        System.out.println("Vehicle:");
        vehicle.speedUp();

        System.out.println("\nCar:");
        car.speedUp();
        car.speedUp(); 

        System.out.println("\nBicycle:");
        bicycle.speedUp();
        bicycle.speedUp(); 
    }
}

