public class StringAndValueEntry<V> extends gTemp18<String, V> {
    public StringAndValueEntry(String key, V value) {
        super(key, value);
    }

    public static void main(String[] args) {
        StringAndValueEntry<String> entry = new StringAndValueEntry<>("E101", "Tom");
        String empName = entry.getValue();
        String empNumber = entry.getKey();
        System.out.println("Emp Number = " + empNumber + ", Emp Name = " + empName);
    }
}