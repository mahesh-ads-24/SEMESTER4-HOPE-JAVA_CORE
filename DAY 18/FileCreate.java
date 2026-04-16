
import java.io.File;
import java.io.IOException;
public class FileCreate {
   public static void main(String[] args) throws IOException{
       File newfile=new File("test.txt");
       if(newfile.createNewFile()){
            System.out.println("file created: "+newfile.getName());
       }else{
            System.out.print("not able to create file");
       }
       
       
   } 
}