import java.io.*;
public class FileWriterImplementation {
    public static void main(String[] args) {
        try{
        FileWriter Writer = new FileWriter("sample.txt");
        Writer.write("Hi I am a file named sample \nI'm just for a sample\n");
        Writer.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
