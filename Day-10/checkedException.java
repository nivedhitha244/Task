import java.io.FileNotFoundException;
import java.io.FileReader;
public class checkedException {
    public static void main(String[] args) {
        try{
            FileReader file=new FileReader("hope");
            System.out.println(file);

        }catch(FileNotFoundException e){
            System.out.println(e);

        }
    }
}