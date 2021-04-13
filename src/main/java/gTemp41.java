public class gTemp41 {
    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException {
        Box11<String> stringBox = new Box11<String>();
        add(stringBox, String.class);
    }

    public static <T> void add(Box11<T> box) {
        //compiler error
        //Cannot instantiate the type T
        //T item = new T();
        //box.add(item);
    }

    public static <T> void add(Box11<T> box, Class<T> clazz)
            throws InstantiationException, IllegalAccessException{
        T item = clazz.newInstance();   // OK
        box.add(item);
        System.out.println("Item added.");
    }
}

class Box11<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
