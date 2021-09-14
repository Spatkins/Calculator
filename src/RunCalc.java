import java.util.Scanner;

public class RunCalc {
    public static void main(String[] args) {
        Convert convert = new Convert();
        Scanner scanner = new Scanner(System.in);
        convert.selector(scanner.next(), scanner.next().charAt(0), scanner.next());
    }
}