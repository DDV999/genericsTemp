public class gTemp6 {
    static public class Account {
        private int sum;
        private String id;

        <T> Account(T id, int sum) {
            this.id = id.toString();
            this.sum = sum;
        }

        public int getSum() {
            return sum;
        }

        public String getId() {
            return id;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }
    }

    public static void main(String[] args) {
        Account acc1 = new Account("cid2373", 5000);
        Account acc2 = new Account(53757, 4000);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}
