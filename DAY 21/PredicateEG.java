
import java.util.function.Predicate;
class Stud{
    int marks;
    public Stud(int marks){
        this.marks=marks;
    }
}
public class PredicateEG {
    public static void main(String[] args) {
        Predicate<Integer> iseven=n->n%2==0;
        Predicate<Integer> isodd=iseven.negate();
        Predicate<Stud> ispass=s->s.marks>=35;
        System.out.println(iseven.test(1));
        System.out.println(isodd.test(5));
        System.out.println(ispass.test(new Stud(40)));
    }
}