import java.io.*;
public class DeleteFile {
    public static void main(String[] args) {
        File file=new File("sample.txt");
        try{
            if(file.delete()){
                System.out.println("File deleted successfully");
            }
            else{
                System.out.println("failed to delete the fail");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
