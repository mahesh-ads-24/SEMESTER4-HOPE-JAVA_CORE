 /*
Evolution :
  Java 1 - wora
  Java 5 - foreach loop,generics
  Java 7 - Exception handling
  Java 8 - lambda expression (interface with single abstract method)
*/
@FunctionalInterface
interface Math{
  int add(int a,int b);
}
@FunctionalInterface
interface Exercise{
  void sayhello();
}
public class LambdaEG {
  public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
      /*Math m=new Math() {
        @Override
        public int add(int a, int b) {
            return a+b;
        }
      };*/
      Math m=(a,b)->a+b;
      Exercise e=()->System.out.println("Hello");
      e.sayhello();
      System.out.println(m.add(10,20));
    }
}
