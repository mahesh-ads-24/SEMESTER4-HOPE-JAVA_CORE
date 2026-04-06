

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class ManualException {
    static void checkage(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be at least 18");
        }
        else{
            System.out.println("ready to vote");
        }
    }
    public static void main(String[] args) {
        try{
            checkage(19);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}