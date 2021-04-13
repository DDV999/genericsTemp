import java.util.ArrayList;
import java.util.List;

public class Temp13 {
    public static void print(List<? super String> list){
        list.add("Hello World!");
        System.out.println(list.get(0));
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Temp13.print(list);
    }
}
