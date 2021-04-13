public class gtemp1 {
    public static void main(String[] args) {
        Account acc1 = new Account(2334, 5000); // id - число
        int acc1Id = (int)acc1.getId();
        System.out.println(acc1Id);

        Account acc2 = new Account("sid5523", 5000);    // id - строка
        System.out.println(acc2.getId());

//        int acc9Id = (int)acc2.getId(); // java.lang.ClassCastException
//        System.out.println(acc9Id);

        Account2<Integer> ac1 = new Account2<Integer>(2323, 5000);
        Integer ac1get = ac1.getId();
        System.out.println(ac1get);

        Account2<String> ac2 = new Account2<String>("2322",5111);
        String ac2get = ac2.getId();
        System.out.println(ac2get);
    }
    static class Account{

        private Object id;
        private int sum;

        Account(Object id, int sum){
            this.id = id;
            this.sum = sum;
        }

        public Object getId() { return id; }
        public int getSum() { return sum; }
        public void setSum(int sum) { this.sum = sum; }
    }

    static class Account2<T>{
        private T id;
        private int sum;

        public T getId() {
            return id;
        }

        public int getSum() {
            return sum;
        }

        public Account2(T id, int sum) {
            this.id = id;
            this.sum = sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }
    }
}
