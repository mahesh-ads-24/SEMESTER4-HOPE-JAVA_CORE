/*

exception handling:
 open gpay -> or scanner -> enter password -> transaction
 if network happens, can throw exception to skip the network part

java.lang.object -> throwable 1.error 2.exception

1.Error:
    .stack overflow error
    .outofmemory error
    .virtualmachine error
2.exception:
    checked

    unchecked
        .array
try -> execute the risky code
catch -> work when risky code throws exception
finally -> always execute, even if there is an exception
throw -> used to evaluate manually that an exception has occurred
throws -> used to declare that a method can throw an exception

*/


public class Exception_Handling {
    public static void main(String[] args) {
        double a=10.9;
        double b=0;
        int c=10; 
        int d=0;
        try{
            System.out.println("try1:"+a/b); 
            System.out.println("try2:"+0.0/0.0);
            System.out.println("try3:"+(-1.0/0.0));
            System.out.println("try4:"+c/d);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("this will always execute");
        }
    }
}

/*

output:
try1:Infinity
try2:NaN
try3:-Infinity
java.lang.ArithmeticException: / by zero
this will always execute

*/