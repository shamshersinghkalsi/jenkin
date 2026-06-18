package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101, "123-456-789");
        String fileOut = "C:\\Users\\shams\\Documents\\file.txt";
        // Try-with-resources auto-closes the file streams
        try(FileOutputStream file = new FileOutputStream(fileOut);
             ObjectOutputStream out = new ObjectOutputStream(file)){

            out.writeObject(emp);
            System.out.println("Object serialized successfully.");
        } catch (IOException i) {
            System.out.println("IOException is caught");
        }
    }
}
