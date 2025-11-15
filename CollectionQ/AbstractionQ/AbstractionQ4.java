/*
4.Abstract Class With Final Method
Create abstract class Document with:
final printHeader()
abstract generateContent()
Extend PDFDocument and show that printHeader() cannot be overridden.
 */



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

public class AbstractionQ4 {
    public static void main(String[] args){

        PDFDocument d = new PDFDocument();

        d.printHeader();
        d.generateContent();

    }
}
