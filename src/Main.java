import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxResOfPlayer = -1;

        ArrayList<Integer> results = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            results.add(scanner.nextInt());
        }

        int maxRes = 0;
        int indexOfMaxRes = 0;
        for (int i = 0; i < results.size(); i++) {
            if (results.get(i) > maxRes) {
                maxRes = results.get(i);
                indexOfMaxRes = i;
            }
        }

        for (int i = indexOfMaxRes + 1; i < results.size() - 1; i++) {
            if (results.get(i) % 10 == 5 && results.get(i) > results.get(i + 1) && results.get(i) > maxResOfPlayer){
                maxResOfPlayer = results.get(i);
            }
        }

        results.sort(Comparator.reverseOrder());

        int res = results.indexOf(maxResOfPlayer) + 1;

        System.out.println(res);
    }
}