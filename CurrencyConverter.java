public class CurrencyConverter {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("If I give you £1, how many Euro will you give me? ");
        double euroOverPoundRatio = scan.nextDouble();
        System.out.print("If I give you 1€, how many Sterling pounds will you give me? ");
        double poundOverEuroRatio = scan.nextDouble();
        System.out.println("OK, now I know enough.");
        boolean finished = false;
        while (!finished) {
            int choice = scan.nextInt();
            switch (choice) {
            case 1:
                System.out.print("How many pounds would you like to convert? ");
            default:
                System.out.println("Sorry, that is not a valid option");
                System.out.println("Added dummy line of text");
            }
        }
        System.out.println("Exiting the program");
    }
}
