//bufferReader--excantly one line read

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class FileRead {
    public static void main(String[] args) {
        //file reader
        // try {
        //     FileReader fr=new FileReader("test.txt");
        //     int ch;//read fuction only return int value
        //     while((ch=fr.read())!=-1){
                
        //         System.out.print((char)ch);//typecasting
        //     }
        // } 
        // catch (IOException e) {
        //     System.out.println(e);
        // }
        try {//buffer reader
            BufferedReader fr=new BufferedReader(new FileReader("test.txt"));
            String line;//read line
            while((line=fr.readLine())!=null){
                
                System.out.print(line);
            }
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}