public class gTemp7<T> {
    T ob;//объявление объекта типа T

    public gTemp7(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type T: " + ob.getClass().getName());
    }

    public static void main(String[] args) {
        gTemp7<Integer> iOb;
        iOb = new gTemp7<Integer>(77);
        iOb.showType();
        int value = iOb.getOb();
        System.out.println("Value: " + value);
        gTemp7<String> strOb = new gTemp7<String>("Обобщённый текст");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("str: "+str);
    }
}
