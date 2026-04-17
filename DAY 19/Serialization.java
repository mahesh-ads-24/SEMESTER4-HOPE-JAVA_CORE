/*Serializable:
    obj -> byte streams -> files
*/
import java.io.*;
class Stud implements Serializable {
    int mark;
    String name;

    Stud(int mark, String name) {
        this.mark = mark;
        this.name = name;
    }
}
class CustomObjOutputstream extends ObjectOutputStream{
    CustomObjOutputstream(ObjectOutputStream objstream) throws IOException {
        super(objstream);
    }
    @Override
    protected void writeStreamHeader(){}
}

public class Serialization {
    public static void main(String[] args) throws IOException {
        Stud s1 = new Stud(90, "Alice");
        FileOutputStream file=new FileOutputStream("testing.txt");//open file
        ObjectOutputStream out=new ObjectOutputStream(file); //oj to byte stream
        out.writeObject(s1);//writing on file
        out.close();
    }
}