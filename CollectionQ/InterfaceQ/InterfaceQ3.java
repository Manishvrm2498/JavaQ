/*
3.Interface With Constant Fields
Create interface HttpStatus with constants (e.g., SUCCESS = 200).
Write a method that checks if a given code matches one of the constants.
 */

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

public class InterfaceQ3 {
    public static void main(String[] args){

        HttpStatusChecker status = new HttpStatusChecker();

        status.checkStatus(400);
        status.checkStatus(300);
    }
}
