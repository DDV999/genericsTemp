public class gTemp40 {
    public static void main(String[] args) {
        Box10<Integer> integerBox = new Box10<Integer>();

        //compiler error
        //ReferenceType
        //- Syntax error, insert "Dimensions" to complete ReferenceType
        //Box<int> stringBox = new Box<int>();

        integerBox.add(new Integer(10));
        printBox(integerBox);
    }

    private static void printBox(Box10 box) {
        System.out.println("Value: " + box.get());
    }
}

class Box10<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
