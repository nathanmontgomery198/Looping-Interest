public class Looping {

    public static void main(String[] args) {
        double balance = 10000;
        int year = 0;
        double interest = 0;

        while (balance < 20000) { //ensure no ;
            year++;
            interest = balance * 0.05;
            balance = balance + interest;

            System.out.println("Year " + year + ", Balance: " + balance);
        }

        System.out.println("Final year " + year);
    }

}
