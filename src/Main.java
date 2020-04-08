public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int incoming = 124; // здесь вводить сумму
        int bonus;
        if (incoming > 1000) {
            bonus = incoming / 100;
        } else {
            bonus = 0;
        }
        balance += incoming + bonus;
        //System.out.printf("Bonus = " + bonus); // для тестирования
        System.out.printf("Total balance = " + balance);
    }
}
