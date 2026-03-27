
class User{
    String name;
    long ph_no;
    String loc;
    User(String name, long ph_no, String loc){
        this.name=name;
        this.ph_no=ph_no;
        this.loc=loc;
    }
    void Display_Info(){
        System.out.println(name+" with the phone number "+ph_no+" is in "+loc);
    }
}
class RideUser extends User{
    String vehicle_type;
    RideUser(String name, long ph_no, String loc, String vehicle_type){
        super(name, ph_no, loc);
        this.vehicle_type=vehicle_type;
    }
    void Display_ride(){
        super.Display_Info();
        System.out.println("Vehicle Type:"+vehicle_type);
    }
}
class FoodUser extends User{
    String fav_food;
    FoodUser(String name, long ph_no, String loc, String fav_food){
        super(name, ph_no, loc);
        this.fav_food=fav_food;
    }
    void Display_food(){
        super.Display_Info();
        System.out.println("Fav food:"+fav_food);
    }
}
class ParcelUser extends User{
    int weight;
    ParcelUser(String name, long ph_no, String loc, int weight){
        super(name, ph_no, loc);
        this.weight=weight;
    }
    void Display_parcel(){
        super.Display_Info();
        System.out.println("Parcel weight:"+weight);
    }
}
public class Booking_platform {
    public static void main(String[] args) {
        RideUser n1 = new RideUser("garcia", 1234567890L, "delhi", "car");
        n1.Display_ride();

        FoodUser n2 = new FoodUser("garcia", 1234567890L, "delhi", "pizza");
        n2.Display_food();

        ParcelUser n3 = new ParcelUser("garcia", 1234567890L, "delhi", 50);
        n3.Display_parcel();
    }
    
}