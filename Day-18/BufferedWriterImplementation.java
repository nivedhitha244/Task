import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterImplementation {
    public static void main(String[] args) {
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter("sample.txt",true));
            writer.write("Here we have turn the file writer with true to append the data");
            writer.newLine();
            writer.write("Finally i have closedd the appending and writing operation.Now I'm closing the writer~");
            writer.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
