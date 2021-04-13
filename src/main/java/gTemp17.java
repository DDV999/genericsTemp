import java.util.ArrayList;

public class gTemp17 {
    public static void main(String[] args) {
        ArrayList<String> userNames = new ArrayList<>();
        userNames.add("tom");
        userNames.add("jerry");
        //userNames.add(new Integer(12));// Compile Error!

        String userName1 = userNames.get(0);
        System.out.println("User name: " + userName1);
    }
}
