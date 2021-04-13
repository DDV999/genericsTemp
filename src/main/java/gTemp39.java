public class gTemp39 {
    public static void main(String[] args) {
        Box9<Integer> integerBox = new Box9<Integer>();
        Box9<String> stringBox = new Box9<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        printBox(integerBox);
        printBox1(stringBox);
    }

    private static <T extends Box9> void printBox(T box) {
        System.out.println("Integer Value :" + box.get());
    }

    private static <T> void printBox1(T box) {
        System.out.println("String Value :" + ((Box9)box).get());
    }
}

class Box9<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
