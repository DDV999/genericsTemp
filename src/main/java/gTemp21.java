public class gTemp21 {
    public static void main(String[] args) {
        Box1<Integer> integerBox = new Box1<Integer>();
        Box1<String> stringBox = new Box1<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
}

class Box1<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
