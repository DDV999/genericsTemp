public class gTemp23 {
    public static void main(String[] args) {
        //type inference
        Box3<Integer> integerBox = new Box3<>();
        //unchecked conversion warning
        Box3<String> stringBox = new Box3<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
}

class Box3<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}