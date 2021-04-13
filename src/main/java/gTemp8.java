public class gTemp8<T, V> {
    T ob1;
    V ob2;

    public gTemp8(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    void showTypes() {
        System.out.println("Type T: " + ob1.getClass().getName());
        System.out.println("Type V: " + ob2.getClass().getName());
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public static void main(String[] args) {
        gTemp8<Integer, String> twoGenObj = new gTemp8<Integer, String>(77, "Обобщённый текст");
        twoGenObj.showTypes();
        int value = twoGenObj.getOb1();
        System.out.println("Value: " + value);
        String str = twoGenObj.getOb2();
        System.out.println("str: " + str);
    }
}
