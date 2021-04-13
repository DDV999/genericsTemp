public class gTemp37 {
    public static void main(String[] args) {
        Box7<Integer> integerBox = new Box7<Integer>();
        Box7<Double> doubleBox = new Box7<Double>();

        integerBox.add(new Integer(10));
        doubleBox.add(new Double(10.0));

        System.out.printf("Integer Value :%d\n", integerBox.get());
        System.out.printf("Double Value :%s\n", doubleBox.get());
    }
}

class Box7<T extends Number> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
