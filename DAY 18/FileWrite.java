//file writer -multiple change(single single write direct to file change)
//buffer writ- only one time change in file (all change store in RAM then last close fuction write --add to file (single time))
import java.io.BufferedWriter;
import java.io.FileWriter;
public class FileWrite{
    public static void main(String[] args) {
        try {
           // FileWriter writer=new FileWriter("test.txt");
           BufferedWriter writer=new BufferedWriter(new FileWriter("test.txt"));
            writer.write("write using filewrite");
            writer.newLine();
            writer.write("write using filewrite");
            writer.write("write using filewrite");
            writer.close();
        } catch (Exception e) {
            System.out.println("e");
        }
    }
}