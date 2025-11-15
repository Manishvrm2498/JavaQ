/*
2.Multiple Interface Inheritance
Create interfaces:

Walkable → walk()

Swimmable → swim()
Create class Amphibian implementing both and call both methods.
*/

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
public class InterfaceQ2 {
    public static void main(String[] args){
        Amphibian turtle = new Amphibian();

        turtle.walk();
        turtle.swim();
    }
}

