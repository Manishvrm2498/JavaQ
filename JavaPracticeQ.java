/*
import java.net.Inet4Address;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;


ARRAYLIST QUESTIONS --
1.Create ArrayList<String>, add 5 cities, print


import java.util.ArrayList;

public class CollectionFQ {
    public static void main(String[] args){
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Bengaluru");
        cities.add("Kolkata");
        cities.add("New Delhi");

        System.out.println("Cities : " + cities);
    }
}





2.Replace 2nd element, remove 4th, print list

import java.util.ArrayList;
import java.util.Collections;

public class CollectionFQ {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Bengaluru");
        cities.add("Kolkata");
        cities.add("New Delhi");

        System.out.println("Cities : " + cities);
        cities.set(1,"Lucknow");
        cities.remove(3);
        System.out.println("List of cities after replacing 2nd and removing 4th element : " + cities);
    }
}




3.Check if "Pune" exists → print "Found"/"Not Found" --

import java.util.ArrayList;

public class CollectionFQ {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Bengaluru");
        cities.add("Kolkata");
        cities.add("New Delhi");

        if (cities.contains("Pune")){
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }

    }
}



4.Add integers, sort with Collections.sort(), print


import java.util.ArrayList;
import java.util.Collections;

public class CollectionFQ {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        num.add(12);
        num.add(11);
        num.add(3);
        num.add(5);
        num.add(23);
        num.add(1);

        System.out.println("Integer Before sorting : " + num);
        Collections.sort(num);
        System.out.println("Integer After sorting : " + num);

    }
}


5.Convert ArrayList<String> → String[] array, print

import java.util.ArrayList;

public class CollectionFQ {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Bengaluru");
        cities.add("Kolkata");
        cities.add("New Delhi");

        String[] arr = new String[cities.size()];

        System.out.println("Cities After converting from ArrayList<String> to String[] array : ");
        for (int i = 0; i < cities.size(); i++) {
            arr[i] = cities.get(i);
            System.out.println(arr[i]);
        }
    }
}










LINKED-LIST QUESTIONS --

1.Add 1–5, print using Iterator


import java.util.Iterator;
import java.util.LinkedList;

public class CollectionFQ {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();

        num.add(12);
        num.add(11);
        num.add(3);
        num.add(5);
        num.add(23);
        num.add(1);

        System.out.println("Integers : ");

        Iterator<Integer> it = num.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}




2.Add element at start & end, print

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionFQ {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();

        num.add(12);
        num.add(11);
        num.add(3);
        num.add(5);
        num.add(23);
        num.add(1);

        System.out.println("Integers : ");
        num.addFirst(133);
        num.addLast(145);
        Iterator<Integer> it = num.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

3.Remove value 3; if absent → "Element not found"

public class CollectionFQ {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();

        num.add(12);
        num.add(11);
        num.add(3);
        num.add(5);
        num.add(23);
        num.add(1);

        boolean found = false;
        Iterator<Integer> it = num.iterator();
        while (it.hasNext()) {
            if (it.next().equals(3)){
                num.remove();
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Element Removed.");
        }else {
            System.out.println("Element Not Found");
        }


    }
}



4.Insert 100 at index 2, print


public class CollectionFQ {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();

        num.add(12);
        num.add(11);
        num.add(3);
        num.add(5);
        num.add(23);
        num.add(1);

        System.out.print("Before Insert : " + num);

        num.add(2,100);

        System.out.print("\nAfter Insert : "+  num);


    }
}



5.Print in reverse using descendingIterator()


public class CollectionFQ {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();

        num.add(12);
        num.add(11);
        num.add(3);
        num.add(5);
        num.add(23);
        num.add(1);

        System.out.println("Integer Reverse : ");
        Iterator<Integer> rev = num.descendingIterator();
        while (rev.hasNext()){
            System.out.println(rev.next());
        }
    }
}


STACK QUESTIONS --
1.Push 3 ints, pop 1, print stack



public class CollectionFQ {
    public static void main(String[] args) {

        Stack<Integer> num = new Stack<>();
        num.push(1);
        num.push(23);
        num.push(34);

        System.out.println("Stack : " + num);
        System.out.println("Pop Element : " + num.pop());
    }
}


2.Push values, peek top, print --

public class CollectionFQ {
    public static void main(String[] args) {

        Stack<Integer> num = new Stack<>();
        num.push(1);
        num.push(2);
        num.push(3);

        System.out.println("Stack : " + num);
        System.out.println("Peek top  Element : " + num.peek());
    }
}


3.Pop until empty → print "Stack is empty" -


public class CollectionFQ {
    public static void main(String[] args) {

        Stack<Integer> num = new Stack<>();

        System.out.println("Stack : " + num);
        if (!num.isEmpty()){
            System.out.println("Pop element :" + num.pop());
        }else {
            System.out.println("Stack is empty");
        }
    }
}


4.Push 5, search value using stack.search(), print pos --


public class CollectionFQ {
    public static void main(String[] args) {

        Stack<String> name = new Stack<>();

        name.push("Mumbai");
        name.push("New Delhi");
        name.push("Chennai");
        name.push("Lucknow");
        name.push("Patna");

        System.out.println(name);

        System.out.println("Position of element : " + name.search("Chennai"));
    }
}

5.Copy stack to another without losing data (use temp stack)


public class CollectionFQ {
    public static void main(String[] args) {

        Stack<String> org = new Stack<>();

        org.push("Mumbai");
        org.push("Chennai");
        org.push("New Delhi");
        org.push("Lucknow");
        org.push("Patna");

       Stack<String> temp = new Stack<>();
       Stack<String> copy = new Stack<>();

       while (!org.isEmpty()) {
           temp.push(org.pop());
       }
       while (!temp.isEmpty()){
           String value = temp.pop();
           org.push(value);
           copy.push(value);
       }

        System.out.println("Original Stack : " +org);
        System.out.println("Copy Stack : " + copy);

    }
}






QUEUE (LinkedList) QUESTIONS --

1.Enqueue ints, print queue -

public class CollectionFQ {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(12);
        queue.add(11);
        queue.add(1);
        queue.add(122);
        queue.add(13);
        queue.add(4);

        System.out.println(queue);

    }
}



2.poll(), peek(), print queue --

public class CollectionFQ {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(12);
        queue.add(11);
        queue.add(1);
        queue.add(122);
        queue.add(13);
        queue.add(4);

        System.out.println("Queue Elements before poll and peak :" + queue);
        System.out.println("Poll means retrieve and remove head element : " + queue.poll());
        System.out.println("Peek means only retrieve head element not remove : " +  queue.peek());
        System.out.println("Queue Elements after poll and peak : " + queue);

    }
}


3.Print queue.size() & queue.isEmpty() --

public class CollectionFQ {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(12);
        queue.add(11);
        queue.add(1);
        queue.add(122);
        queue.add(13);
        queue.add(4);

        System.out.println("Size of queue : " + queue.size());
        System.out.println("Queue is empty or not : " + queue.isEmpty());
    }
}



4. Convert queue into ArrayList and print --



public class CollectionFQ {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(12);
        queue.add(11);
        queue.add(1);
        queue.add(122);
        queue.add(13);
        queue.add(4);

        ArrayList<Integer>  arr = new ArrayList<>(queue);

        System.out.println("Queue : " + queue);
        System.out.println("ArrayList : "  + arr);
    }
}


5.Task queue: enqueue 5 strings, poll each → print "Processing: <task>" --


public class CollectionFQ {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        queue.add("File");
        queue.add("Send Email");
        queue.add("Image");
        queue.add("Uploading");
        queue.add("Video");

        while (!queue.isEmpty()){
            String task = queue.poll();
            System.out.println("Processing: " + task);
        }

        System.out.println("All task completed successfully.");
    }
}












HASHMAP QUESTIONS --

.Add 5 (rollNo → name) pairs, print map


public class CollectionFQ {
    public static void main(String[] args) {
        HashMap<Integer,String> el= new HashMap<>();

        el.put(101,"Rahul");
        el.put(102,"Anchal");
        el.put(103,"Rohan");
        el.put(104,"Kabir");
        el.put(105,"Ram");

        System.out.println(el);
    }
}



2.Check key (e.g., 102) → print value or "Not found"


public class CollectionFQ {
    public static void main(String[] args) {
        HashMap<Integer, String> el = new HashMap<>();

        el.put(101, "Rahul");
        el.put(102, "Anchal");
        el.put(103, "Rohan");
        el.put(104, "Kabir");
        el.put(105, "Ram");

        System.out.println(el);
       if (el.containsKey(102)){
           System.out.println(el.get(102));
       }else {
           System.out.println("Not found");
       }
    }
}



3.Remove key, print map -

public class CollectionFQ {
    public static void main(String[] args) {
        HashMap<Integer, String> el = new HashMap<>();

        el.put(101, "Rahul");
        el.put(102, "Anchal");
        el.put(103, "Rohan");
        el.put(104, "Kabir");
        el.put(105, "Ram");

        if (el.containsKey(101)){
            System.out.println("After remove key value : " +  el.remove(102));
            System.out.println("Rest of the elements : " + el);
        }else {
            System.out.println("Not found");
        }
    }
}



4.replace(key, newVal), show before/after -

public class CollectionFQ {
    public static void main(String[] args) {
        HashMap<Integer, String> el = new HashMap<>();

        el.put(101, "Rahul");
        el.put(102, "Anchal");
        el.put(103, "Rohan");
        el.put(104, "Kabir");
        el.put(105, "Ram");

        System.out.println("Set Before replace: " + el);
        el.put(102,"Shiva");
        System.out.println("Set after replace : " + el
        );
    }
}



5.Iterate using entrySet() and print key/value --


public class CollectionFQ {
    public static void main(String[] args) {
        HashMap<Integer, String> el = new HashMap<>();

        el.put(101, "Rahul");
        el.put(102, "Anchal");
        el.put(103, "Rohan");
        el.put(104, "Kabir");
        el.put(105, "Ram");


        for(Map.Entry<Integer,String> entry : el.entrySet()){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}










HASHSET QUESTIONS--

1.Add 5 ints, print set

public class CollectionFQ {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(14);
        set.add(11);
        set.add(3);
        set.add(51);
        set.add(23);
        set.add(1);

        System.out.println(set);

    }
}

2.Add duplicate → print (observe)

public class CollectionFQ {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(14);
        set.add(11);
        set.add(312);
        set.add(51);
        set.add(11);
        set.add(1);

        System.out.println("HashSet auto remove duplicate element :"+set);
    }
}


3.Check contains(value), print --


public class CollectionFQ {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(14);
        set.add(11);
        set.add(312);
        set.add(51);
        set.add(1);

        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (set.contains(n)){
            System.out.println("Element "+n+" Existed." );
        }else{
            System.out.println("Element Not Existed.");
        }
    }
}



4.Remove value; if fail → "Element not present"


public class CollectionFQ {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(14);
        set.add(11);
        set.add(312);
        set.add(51);
        set.add(1);

        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (set.contains(n)){
            set.remove(n);
            System.out.println("Element "+n+" removed successfully." );
            System.out.println("Set of elements after removing : " +  set);
        }else{
            System.out.println("Element Not present.");
        }
    }
}




5.Convert to ArrayList, sort, print list --

public class CollectionFQ {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(14);
        set.add(11);
        set.add(312);
        set.add(51);
        set.add(1);

        ArrayList<Integer> arr = new ArrayList<>(set);
        Collections.sort(arr);
        System.out.println(arr);
    }
}

 */







/* PRIORITY QUESTION ---
1. Create and Print PriorityQueue
Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue.


public class CollectionFQ {
    public static void main(String[] args) {

        Queue<String> colours = new PriorityQueue<>();

        colours.add("Yellow");
        colours.add("Orange");
        colours.add("Red");
        colours.add("Purple");
        colours.add("Indigo");

        System.out.println(colours);
    }
}



2. Iterate PriorityQueue Elements

Write a Java program to iterate through all elements in the priority queue.

public class CollectionFQ {
    public static void main(String[] args) {

        Queue<String> colours = new PriorityQueue<>();

        colours.add("Yellow");
        colours.add("Orange");
        colours.add("Red");
        colours.add("Purple");
        colours.add("Indigo");

        System.out.println("Queue of Elements : ");
        for (String s : colours){
            System.out.println(s);
        }

    }
}



3. Add All Elements to Another PriorityQueue

Write a Java program to add all the elements of a priority queue to another priority queue.


public class CollectionFQ {
    public static void main(String[] args) {

        Queue<String> colours = new PriorityQueue<>();


        colours.add("Orange");
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Indigo");

        PriorityQueue<String> sub = new PriorityQueue<>();

        System.out.println(colours);
        sub.add("Violet");
        sub.add("Blue");
        sub.add("Green");
        sub.addAll(colours);
        System.out.println(sub);
    }
}



4. Insert Element into PriorityQueue

Write a Java program to insert a given element into a priority queue

public class CollectionFQ {
    public static void main(String[] args) {

        Queue<String> colours = new ArrayBlockingQueue<>(2);


        colours.offer("Orange");
        colours.offer("Red");
        colours.offer("Yellow");
        colours.offer("Indigo");

        System.out.println(colours);

    }
}


5. Clear PriorityQueue

Write a Java program to remove all elements from a priority queue.

public class CollectionFQ {
    public static void main(String[] args) {

        Queue<String> colours = new ArrayBlockingQueue<>(2);


        colours.offer("Orange");
        colours.offer("Red");
        colours.offer("Yellow");
        colours.offer("Indigo");

        System.out.println(colours);
        colours.clear();
        System.out.println(colours);

    }
}


6. Count PriorityQueue Elements

Write a Java program to count the number of elements in a priority queue.

public class CollectionFQ {
    public static void main(String[] args) {

        Queue<String> colours = new ArrayBlockingQueue<>(2);


        colours.offer("Orange");
        colours.offer("Red");
        colours.offer("Yellow");
        colours.offer("Indigo");

        System.out.println("Number of Elements : " + colours.size());
    }
}


7. Compare PriorityQueues

Write a Java program to compare two priority queues.
Click me to see the solution
 
public class CollectionFQ {
    public static void main(String[] args) {

        PriorityQueue<String> colours = new PriorityQueue<String>();


        colours.offer("Orange");
        colours.offer("Red");
        colours.offer("Yellow");
        colours.offer("Indigo");

        System.out.println(colours);
        PriorityQueue<String> colour = new PriorityQueue<String>();

        colour.offer("Orange");
        colour.offer("Red");
        colour.offer("Blue");
        colour.offer("Indigo");

        System.out.println(colour);
        for (String s : colour){
            System.out.println(colours.contains(s) ? "Yes" : "No");

        }


    }
}





Interface and Abstract based Coding solution  -- 

/*
1.Default + Static Method Usage
Create an interface Payment with:

default method logTransaction()

static method getSupportedCurrencies()
Implement it in UPIPayment and show usage of both methods.


import java.util.List;

interface Payment{
     void logTransaction(double amount);

    static List<String> getSupportedCurrencies() {
        return List.of("USD","INR","EUR","YUAN");
    }
}
class UPIPayment implements Payment{

    public void logTransaction(double amount){
        System.out.println("UPI Transaction of " + amount + " successfully.");
    }
}

public class CollectionQ {
    public static void main(String[] args){

        UPIPayment payment = new UPIPayment();

        payment.logTransaction(1000.0);

        System.out.println("Supported currencies :" + Payment.getSupportedCurrencies());
    }
}



2.Multiple Interface Inheritance
Create interfaces:
Walkable → walk()
Swimmable → swim()
Create class Amphibian implementing both and call both methods.

interface Walkable{
    void walk();
}
interface  Swimmable{
    void swim();
}
class Amphibian implements Walkable,Swimmable{

    public void walk(){
        System.out.println("Amphibian can walk.");
    }
    public void swim(){
        System.out.println("Amphibian can swim.");
    }
}
public class CollectionQ {
    public static void main(String[] args){
        Amphibian turtle = new Amphibian();

        turtle.walk();
        turtle.swim();
    }
}





3.Interface With Constant Fields
Create interface HttpStatus with constants (e.g., SUCCESS = 200).
Write a method that checks if a given code matches one of the constants.

interface HttpStatus{
    int success = 400;
}

class HttpStatusChecker implements HttpStatus{

    public void checkStatus(int code){
        if (code == success){
            System.out.println("Status " + code + " : Success");
        }else {
            System.out.println("Status " + code + " : Not found");
        }
    }
}

public class CollectionQ {
    public static void main(String[] args){

        HttpStatusChecker status = new HttpStatusChecker();

        status.checkStatus(400);
        status.checkStatus(300);
    }
}





4.Interface Method Conflict Resolution
Create interfaces:
A → default greet()
B → default greet()
Create class C implementing both and resolve the conflict by overriding greet().

interface A{
    default void greet(){
        System.out.println("This message from A interface method.");
    }
}
interface B{
    default void greet(){
        System.out.println("This message from B interface B method.");
    }
}

class C implements A,B{

    public void greet(){

    // Using super to call parent interface to resolve the conflict by overriding.

        A.super.greet();
        B.super.greet();

        System.out.println("This message from C which implement greet() method from A interface because C class implement A interface method first.");
    }

}
public class CollectionQ {
    public static void main(String[] args){
        C c = new C();
        c.greet();

    }
}



5.Functional Interface + Lambda
Create a functional interface Calculator with int compute(int a, int b).
Use lambdas for:

addition

multiplication
Pass them to a method performOperation()

interface Calculator{
    int compute(int a,int b);

}
class Operation{

    public void performOperation(int a,int b, Calculator calc){
        int result = calc.compute(a,b);
        System.out.println("Result : " + result);
    }

}

public class CollectionQ {
    public static void main(String[] args){

        Operation operation = new Operation();

        Calculator addition = (a, b) -> a + b ;

        Calculator multiplication = (a,b) -> a * b ;

        operation.performOperation(12,10,addition);
        operation.performOperation(12,10,multiplication);

    }
}




ABSTRACT CLASS -- 

1.Partially Implemented Template
Create an abstract class FileProcessor with:
concrete readFile()
abstract processContent()
Extend to LogFileProcessor and run the full flow.


abstract class FileProcessor{

    void readFile(String fileName){
        System.out.println("File reading..." + fileName);
    }
    abstract void processContent();
}
class LogFileProcessor extends FileProcessor{

    public void processContent(){
        System.out.println("File Content processing...");
    }
}

public class CollectionQ {
    public static void main(String[] args){

        LogFileProcessor fp = new LogFileProcessor();

        fp.readFile("Name.txt");
        fp.processContent();

    }
}




2.Constructor in Abstract Class
Create abstract class Vehicle with constructor setting model and year.
Extend Car and print values to verify constructor chaining.


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

public class CollectionQ {
    public static void main(String[] args){

        Car car = new Car("SUV",2020);

        car.printDetails();
    }
}




3.Abstract + Concrete Fields
Create abstract class Shape with:
concrete field: type = "Shape"
abstract method: area()
Implement Circle and Rectangle, then compute areas in a list.


abstract class Shape{

    String type = "shape";

    abstract double area();
}
class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.type = "Circle";
    }

    public double area(){
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        this.type = "Rectangle";
    }

    public double area(){
        return length * breadth ;
    }
}

public class CollectionQ {
    public static void main(String[] args){

        List<Shape> shape = new ArrayList<>();

        shape.add(new Circle(12));
        shape.add(new Rectangle(12,10));

        for (Shape s : shape){
            System.out.println(s.type + " Area :" + s.area());
        }
    }
}



4.Abstract Class With Final Method
Create abstract class Document with:

final printHeader()

abstract generateContent()
Extend PDFDocument and show that printHeader() cannot be overridden.



abstract class Document{
    final void printHeader() {
        System.out.println("Unknown Document");
    }
    abstract void generateContent();
}

class PDFDocument extends Document{


//   ( printHeader is not override because it declared as a final method in the above abstract class.)
//    public void printHeader(){
//    }


    public void generateContent(){
        System.out.println("Generating Document Contents...");
    }


}

public class CollectionQ {
    public static void main(String[] args){

        PDFDocument d = new PDFDocument();

        d.printHeader();
        d.generateContent();

    }
}



5.Abstract Class + Interface Together
Create:

interface Drivable → drive()

abstract class Machine → start() + abstract run()
Create Car that extends Machine and implements Drivable.
Call start(), run(), and drive().


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

public class CollectionQ {
    public static void main(String[] args){

        Car car = new Car();

        car.start();
        car.drive();
        car.run();
    }
}

 */

*/



