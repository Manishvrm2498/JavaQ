

/*
1.Default + Static Method Usage
Create an interface Payment with:

default method logTransaction()

static method getSupportedCurrencies()
Implement it in UPIPayment and show usage of both methods.

 */



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

public class InterfaceQ1 {
    public static void main(String[] args){

        UPIPayment payment = new UPIPayment();

        payment.logTransaction(1000.0);

        System.out.println("Supported currencies :" + Payment.getSupportedCurrencies());
    }
}