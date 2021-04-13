public class gTemp3 {
    interface Accountable<T> {
        T getId();

        int getSum();

        void setSum(int sum);
    }

    static class Account<T> implements Accountable<T> {
        private T id;
        private int sum;

        public Account(T id, int sum) {
            this.id = id;
            this.sum = sum;
        }

        @Override
        public T getId() {
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

        public static void main(String[] args) {
            Account<String> acc1 = new Account<String>("1235rwr", 5000);
            Account<String> acc2 = new Account<String>("2373", 4300);
            System.out.println(acc1.getId());
            System.out.println(acc2.getId());
        }
    }
}
