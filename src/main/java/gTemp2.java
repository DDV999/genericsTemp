public class gTemp2 {
    interface Accountable<T>{
        T getId();
        int getSum();
        void setSum(int sum);
    }

     static class Account implements Accountable<String>{
        private String id;
        private int sum;

        public Account(String id, int sum) {
            this.id = id;
            this.sum = sum;
        }

        @Override
        public String getId() {
            return id;
        }

        @Override
        public int getSum() {
            return sum;
        }

        @Override
        public void setSum(int sum) {
            this.sum = sum;
        }
    }
    public static void main(String[] args) {
        Accountable<String> acc1 = new Account("1235rwr", 5000);
        Account acc2 = new Account("2373", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}
