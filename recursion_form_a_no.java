import java.util.Scanner;
class Result{
    public static int evenDigits(int n) {
    if (n == 0) {
        return 0;
    }
    int a = n % 10;
    int result = 0;
    if (a % 2 == 0) {
        result = a + 10 * evenDigits(n / 10);
    } else {
        result = evenDigits(n / 10);
    }
    return result;
}
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine().trim());
        while (T-- > 0) {
            int no = Integer.parseInt(sc.nextLine().trim());
            System.out.println(Result.evenDigits(no));
        } 
    }
}
