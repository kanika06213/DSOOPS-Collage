import java.util.Scanner;

class Main{
    static int sumofdigits(int n){
        if(n<0){
            return -sumofdigits(-n);
        }
        if(n == 0){
            return 0;
        }
        return(n%10) + sumofdigits(n/10);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int i =0; i<m; i++){
            int n = sc.nextInt();
            System.out.println(sumofdigits(n));
        }
    }
}
