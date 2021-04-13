public class gTemp15<T> {
    private T value;

    public gTemp15(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public String toString() {
        return "{" + value + "}";
    }

    public static void main(String[] args) {
        gTemp15<Integer> value1;
        value1 = new gTemp15<Integer>(new Integer(11));
        System.out.println(value1);
        Integer intValue1 = value1.getValue();
        //ошибки нет

        gTemp15<String> value2;
        value2 = new gTemp15<String>("Hello World!");
        System.out.println(value2);

        // Здесь возникает ошибка несоответствия типа
//        Integer intValue2 = value2.getValue();
    }
}
