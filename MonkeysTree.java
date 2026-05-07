import java.util.Scanner;

public class MonkeysTree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total monkeys: ");
        int n = sc.nextInt();

        System.out.print("Enter total bananas: ");
        int m = sc.nextInt();

        System.out.print("Enter total peanuts: ");
        int p = sc.nextInt();

        System.out.print("Enter bananas eaten by one monkey: ");
        int k = sc.nextInt();

        System.out.print("Enter peanuts eaten by one monkey: ");
        int j = sc.nextInt();

        int monkeysEatingBanana = m / k;
        if (m % k != 0) {
            monkeysEatingBanana++;
        }

        int monkeysEatingPeanut = p / j;
        if (p % j != 0) {
            monkeysEatingPeanut++;
        }

        int totalMonkeysDown = monkeysEatingBanana + monkeysEatingPeanut;

        int monkeysLeft = n - totalMonkeysDown;

        if (monkeysLeft < 0) {
            monkeysLeft = 0;
        }

        System.out.println("Monkeys left on the tree = " + monkeysLeft);
    }
}
