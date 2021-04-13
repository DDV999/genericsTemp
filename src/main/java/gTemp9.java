import java.util.ArrayList;
import java.util.List;

public class gTemp9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Hello!");
        //list.add(123);
        for (Object str : list) {
            System.out.println((String)str);
        }
    }
}
