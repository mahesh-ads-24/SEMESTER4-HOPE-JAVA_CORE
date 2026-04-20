import java.util.List;
import java.util.function.Consumer;

class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}
public class ConsumerEG {
    public static void main(String[] args) {
        Consumer<Student> printstr=s->System.out.println(s);
        Consumer<Student> printname=s->System.out.println(s.name);
        printstr.accept(new Student("String"));//returns obj reference,eg:Day21.Student@15db9742
        printname.accept(new Student("Garcia"));
        List<String> names=List.of("a","b","c");
        names.forEach(System.out::println);//syntax for lambda expression
    }
}