import java.util.ArrayList;

public class AddressBook {
    private ArrayList <BuddyInfo> buddys;
    public AddressBook (){
        buddys = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }
    public static void main(String[] args) {
        System.out.println("AddressBook");
    }
}
