/*
2.Constructor in Abstract Class
Create abstract class Vehicle with constructor setting model and year.
Extend Car and print values to verify constructor chaining.
 */


abstract class Vehicle{
    String model;
    int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

}
class Car extends Vehicle{

    public Car(String model,int year){
        super(model,year);
    }


    public void printDetails(){
        System.out.println("Model " + model + "\nYear :" + year );
    }
}

public class AbstractionQ2 {
    public static void main(String[] args){

        Car car = new Car("SUV",2020);

        car.printDetails();
    }
}