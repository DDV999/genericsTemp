public class PhoneNameEntry extends gTemp18<Integer, String> {
    public PhoneNameEntry(Integer key, String value) {
        super(key, value);
    }

    public static void main(String[] args) {
        PhoneNameEntry entry = new PhoneNameEntry(12121121, "Tomy");
        Integer phone = entry.getKey();
        String name = entry.getValue();
        System.out.println("Name: " + name + ", Phone: " + phone);
    }
}