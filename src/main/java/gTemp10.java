import java.util.Arrays;
import java.util.List;

public class gTemp10 {
    public static class Util{
        public static <T> T getValue(Object obj){
            return (T) obj;
        }
    }
    public static void main(String[] args) {
        List list = Arrays.asList(2,3);
        for (Object element:list){
            System.out.println(Util.<Integer>getValue(element)+1);
            //System.out.println(Util.getValue(element)+1); bad operand types for binary operator!!
        }
    }
}
