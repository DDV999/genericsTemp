public class KeyValueInfo<K, V, I> extends gTemp18<K, V> {
    private I info;

    public KeyValueInfo(K key, V value) {
        super(key, value);
    }

    public KeyValueInfo(K key, V value, I info) {
        super(key, value);
        this.info = info;
    }

    public I getInfo() {
        return info;
    }

    public void setInfo(I info) {
        this.info = info;
    }

    public static void main(String[] args) {
        //gTemp18<String, Integer> entry = new gTemp18<>("Freeman",222222);
        KeyValueInfo<String, Integer, String> entry2 = new KeyValueInfo<>("Freeman2", 3333, "Hey");
        String key1 = entry2.getKey();
        Integer value1 = entry2.getValue();
        String info = entry2.getInfo();
        System.out.println("key: " + key1 + " value: " + value1 + " info: " + info);
    }
}
