public class BuddyInfo {
    private String name;
    public BuddyInfo(String name) {
        this.name = "homer";
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo bud = new BuddyInfo("homer");
        System.out.println("Hello "+ bud.getName());

    }
}