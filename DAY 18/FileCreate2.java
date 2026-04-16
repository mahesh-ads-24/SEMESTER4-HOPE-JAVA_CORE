import java.io.File;
import java.io.IOException;
public class FileCreate2 {
   public static void main(String[] args) throws IOException{
       File newfile=new File("test1.txt");
       if(newfile.createNewFile()){
            System.out.println("file created: "+newfile.getName());
       }else{
            System.out.print("not able to create file");
       }
       if(newfile.delete()){
        System.out.print("file deleted");
       }else{
        System.out.print("not deleted");
       }
       
   } 
}