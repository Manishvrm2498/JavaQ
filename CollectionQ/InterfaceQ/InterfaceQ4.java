/*
4.Interface Method Conflict Resolution
Create interfaces:
A → default greet()
B → default greet()
Create class C implementing both and resolve the conflict by overriding greet().

 */

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
public class InterfaceQ4 {
    public static void main(String[] args){
        C c = new C();
        c.greet();

    }
}
