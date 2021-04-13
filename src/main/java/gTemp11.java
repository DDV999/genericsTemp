import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class gTemp11<T> {
    public <E> void test(Collection<E> collection){
        for (E element:collection){
            System.out.println(element);
        }
    }

    public void test(List<Integer> collection){
        for (Integer elemenet:collection){
            System.out.println(elemenet);
        }
    }

    public static void main(String[] args) {
        gTemp11<String> st = new gTemp11<>();
        List<String> list = Arrays.asList("test");
        st.test(list);

        gTemp11<Integer> iii = new gTemp11<>();
        List<Integer> list2 = Arrays.asList(12,1);
        iii.test(list2);

//        gTemp11 st3 = new gTemp11();
//        List<String> list1 = Arrays.asList("test2");
//        st3.test(list1);
//        class java.lang.String cannot be cast to class java.lang.Integer
    }
}
