public class Account {
        private static long lastNumber = 1000;
        private static int totalAccounts = 0;
        private final long number;
        private final String owner;
        private int balance;



        public Account(String owner, int balance) {
                this.number = ++lastNumber;
                this.owner = owner;
                this.balance = balance;
                totalAccounts++;
        }
        public Account(String owner) {
                this(owner, 0);          // 위 생성자를 부릅니다
        }

        public static int getTotalAccounts() { return totalAccounts; }


        public long getNumber()  { return number; }
        public String getOwner() { return owner; }
        public int getBalance()  { return balance; }

        public void deposit(int amount) {
                if (amount <= 0) {
                        System.out.println("입금액은 0원보다 커야 합니다.");
                        return;
                }
                balance += amount;
        }

        public boolean withdraw(int amount) {
                if (amount <= 0) {
                        System.out.println("출금액은 0원보다 커야 합니다.");
                        return false;
                }
                if (amount > balance) {
                        System.out.println("잔액이 부족합니다. 현재 " + balance + "원");
                        return false;
                }
                balance -= amount;
                return true;
        }

        static boolean transfer(Account from, Account to, int amount) {
                if (from == null || to == null) {
                        System.out.println("계좌를 찾을 수 없습니다.");
                        return false;
                }
                if (from == to) {
                        System.out.println("같은 계좌로는 이체할 수 없습니다.");
                        return false;
                }
                if (!from.withdraw(amount)) return false;
                to.deposit(amount);
                return true;
        }

}
