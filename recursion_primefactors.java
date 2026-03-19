import java.util.Scanner;

class Main{
    static void primefactors(int n, int i){
        if(n == 1){
            return;
        }
        if(n%i == 0){
            System.out.println(i);
            primefactors(n/i, i);
        }
        else{
            primefactors(n,i+1);
        }
    }
    public static void main(String[] args)
    {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primefactors(n,2);
    }
}
