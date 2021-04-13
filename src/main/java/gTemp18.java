public class gTemp18<K, V> {
    private K key;
    private V value;

    public gTemp18(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        gTemp18<String, Integer> entry = new gTemp18<>("Hello Mr Freeman!", 121);
        Integer phone = entry.getValue();
        String name = entry.getKey();
        System.out.println("Name: " + name + ", Phone: " + phone);
    }
}
