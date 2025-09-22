import java.util.ArrayList;

public class AddressBook {
    //test
    private ArrayList <BuddyInfo> buddies;
    public AddressBook (){
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if (buddy!= null) buddies.add(buddy);
    }
    public void removeBuddy(int i){
        if (i>=0 && i<buddies.size()) buddies.remove(i);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
