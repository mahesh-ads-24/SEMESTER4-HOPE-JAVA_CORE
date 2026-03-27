
/* Example of overridding:

explanation: we have a parent class character and 3 child classes warrior, archer and mage. 
each child class has its own implementation of attack method. 
when we call attack method on the object of child class, it will call the attack method of that child class instead of the parent class. 
   
*/
class Character{
    String name;
    Character(String name){
        this.name=name;
    }
    void attack(){
        System.out.println(name+" is attacking");
    }
}
class Warrior extends Character{
    Warrior(String name){
        super(name);
    }
    void attack(){
        System.out.println(name+" is attacking with a sword");
    }
}
class Archer extends Character{
    Archer(String name){
        super(name);
    }
    void attack(){
        System.out.println(name+" is attacking with a bow");
    }
}
class Mage extends Character{
    Mage(String name){
        super(name);
    }
    void attack(){
        System.out.println(name+" is attacking with magic");
    }
}

public class MiniGame {
    public static void main(String[] args) {
        Character c1=new Warrior("garcia");
        Character c2=new Archer("garcia");
        Character c3=new Mage("garcia");
        c1.attack();
        c2.attack();
        c3.attack();
    }
}