
/*

design locker system where user can store items securely. Each locker protect its internal data and only controlled operation
requirements:
1.Each locker has a unique id and a pin
2.Operations: storeItem(item, pin), retrieveItem(pin), lock(pin), unlock(pin)
3.Rules:
    - items cannot access directly
    - locker opens only correct password is provided
    - invalid access should be blocked

*/

import java.util.*;

class Locker {
    private int lockerId;
    private int pin;
    private String item;
    private boolean isLocked;

    public Locker(int lockerId, int pin) {
        this.lockerId = lockerId;
        this.pin = pin;
        this.item = null;
        this.isLocked = true;
    }
    public int getLockerId() {
        return lockerId;
    }
    private boolean validatePin(int pin) {
        if (this.pin == pin) {
            return true;
        } else {
            System.out.println("Invalid PIN");
            return false;
        }
    }
    public void unlock(int pin) {
        if (validatePin(pin)) {
            isLocked = false;
            System.out.println("Locker unlocked");
        }
    }
    public void lock(int pin) {
        if (validatePin(pin)) {
            isLocked = true;
            System.out.println("Locker locked");
        }
    }
    public void storeItem(String item, int pin) {
        if (!validatePin(pin)) return;

        if (isLocked) {
            System.out.println("Unlock the locker first!");
            return;
        }
        this.item = item;
        System.out.println("Item stored successfully");
    }
    public void retrieveItem(int pin) {
        if (!validatePin(pin)) return;

        if (isLocked) {
            System.out.println("Unlock the locker first!");
            return;
        }
        if (item == null) {
            System.out.println("Locker is empty");
        } else {
            System.out.println("Retrieved item: " + item);
            item = null;
        }
    }
}

public class Locker_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Locker> lockers = new ArrayList<>();
        lockers.add(new Locker(101, 1234));
        lockers.add(new Locker(102, 5678));
        lockers.add(new Locker(103, 9999));
        int choice;
        do {
            System.out.println("\n--- Locker System ---");
            System.out.println("1. Unlock Locker");
            System.out.println("2. Lock Locker");
            System.out.println("3. Store Item");
            System.out.println("4. Retrieve Item");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            System.out.print("Enter Locker ID: ");
            int id = sc.nextInt();
            Locker selected = null;
            for (Locker l : lockers) {
                if (l.getLockerId() == id) {
                    selected = l;
                    break;
                }
            }
            if (selected == null) {
                System.out.println("Locker not found!");
                continue;
            }
            int pin;
            String item;
            switch (choice) {
                case 1:
                    System.out.print("Enter PIN: ");
                    pin = sc.nextInt();
                    selected.unlock(pin);
                    break;
                case 2:
                    System.out.print("Enter PIN: ");
                    pin = sc.nextInt();
                    selected.lock(pin);
                    break;
                case 3:
                    System.out.print("Enter PIN: ");
                    pin = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter item: ");
                    item = sc.nextLine();
                    selected.storeItem(item, pin);
                    break;
                case 4:
                    System.out.print("Enter PIN: ");
                    pin = sc.nextInt();
                    selected.retrieveItem(pin);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
        sc.close();
    }
}