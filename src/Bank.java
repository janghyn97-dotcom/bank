public class Bank {
    public static void main(String[] args) {
        Account a = new Account("홍길동", 50000);
        Account b = a;
        Account c = new Account(a.getOwner(), a.getBalance());

        b.deposit(10000);
        System.out.println(a.getBalance());
        System.out.println(b.getBalance());
        System.out.println(a == b);
        System.out.println(a == c);
    }
}
