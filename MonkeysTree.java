import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, k, j, m, p;

        // Input
        n = sc.nextInt();
        k = sc.nextInt();
        j = sc.nextInt();
        m = sc.nextInt();
        p = sc.nextInt();

        // Monkeys eating bananas
        int bananaMonkeys = m / k;

        if (m % k != 0)
            bananaMonkeys++;

        // Monkeys eating peanuts
        int peanutMonkeys = p / j;

        if (p % j != 0)
            peanutMonkeys++;

        // Total monkeys that came down
        int total = bananaMonkeys + peanutMonkeys;

        // Monkeys left on tree
        int left = n - total;

        System.out.println("Number of Monkeys left on the tree:" + left);
    }
}
