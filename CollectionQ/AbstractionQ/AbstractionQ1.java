/*
1.Partially Implemented Template
Create an abstract class FileProcessor with:
concrete readFile()
abstract processContent()
Extend to LogFileProcessor and run the full flow.
 */


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

public class AbstractionQ1 {
    public static void main(String[] args){

        LogFileProcessor fp = new LogFileProcessor();

        fp.readFile("Name.txt");
        fp.processContent();

    }
}
