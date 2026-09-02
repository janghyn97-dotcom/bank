public class Account {
        private static long lastNumber = 1000;
        private final long number;
        private final String owner;
        private int balance;

        public Account(String owner, int balance) {
                this.number = ++lastNumber;
                this.owner = owner;
                this.balance = balance;
        }
        public Account(String owner) {
                this(owner, 0);          // 위 생성자를 부릅니다
        }
}
