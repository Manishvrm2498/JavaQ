/*
5.Functional Interface + Lambda
Create a functional interface Calculator with int compute(int a, int b).
Use lambdas for:
addition
multiplication
Pass them to a method performOperation()
 */

interface Calculator{
    int compute(int a,int b);

}
class Operation{

    public void performOperation(int a,int b, Calculator calc){
        int result = calc.compute(a,b);
        System.out.println("Result : " + result);
    }

}

public class InterfaceQ5 {
    public static void main(String[] args){

        Operation operation = new Operation();

        Calculator addition = (a, b) -> a + b ;

        Calculator multiplication = (a,b) -> a * b ;

        operation.performOperation(12,10,addition);
        operation.performOperation(12,10,multiplication);

    }
}