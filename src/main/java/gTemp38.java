public class gTemp38 {
    public static void main(String[] args) {
        Box8<Integer> integerBox = new Box8<Integer>();
        Box8<String> stringBox = new Box8<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
}

class Box8<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
