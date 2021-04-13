import java.util.ArrayList;

public class gTemp14 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add("abc2");
        list.add(3);

        for (Object obj:list) {
            String s = (String) obj;//тут будет исключение, когда дойдем до элемента-числа
        }
    }
}
