/*
5.Abstract Class + Interface Together
Create:
interface Drivable → drive()
abstract class Machine → start() + abstract run()
Create Car that extends Machine and implements Drivable.
Call start(), run(), and drive().
 */


interface Drivable{

    void drive();
}

abstract class Machine{

    void start(){

        System.out.println("Machine start...");
    }

    abstract void run();
}

class Car extends Machine implements Drivable{

    public void start(){
        System.out.println("Rohit starts a car.");
    }
    public void run(){
        System.out.println("He run car run at the uniform speed");
    }
    public void drive(){
        System.out.println("He driving a car.");
    }
}

public class AbstractionQ5 {
    public static void main(String[] args){

        Car car = new Car();

        car.start();
        car.drive();
        car.run();
    }
}


