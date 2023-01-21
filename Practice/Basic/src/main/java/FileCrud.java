import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileCrud {
    public static void main(String[] args)
    {
//        FileCrud.createFile();
//        FileCrud.getFileInformation();
//        FileCrud.writeFile();
        FileCrud.readFile();
    }
    
    public static void createFile()
    {
        try {
            File file = new File("test.txt");

            if(file.createNewFile()) {
                System.out.println("File created " + file.getName());
            } else {
                System.out.println("File already created!");
            }
        } catch(Exception e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
    
    public static void getFileInformation()
    {  
        File file = new File("test.txt");
        if (file.exists()) {
            System.out.println("File name: " + file.getName()); 
            System.out.println("Absolute path: " + file.getAbsolutePath()); 
            System.out.println("Writeable: " + file.canWrite()); 
            System.out.println("Readable " + file.canRead()); 
            System.out.println("File size in bytes " + file.length());
        } else {
          System.out.println("The file does not exist.");
        }
    }
    
    public static void writeFile()
    {  
        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write("Files in Java might be tricky, but it is fun enough!");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
    
    public static void readFile()
    {  
        try {
            File file = new File("test.txt");
            Scanner scanner = new Scanner(file);
        
            while(scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }

}