class Result {
    static long power(long base, long exp) {
        if (exp < 0) {
            return -1;
        }
        if (exp == 0) {
            return 1;
        }
        long half = power(base, exp / 2);
        if (exp % 2 == 0) {
            return half * half;
        } else {
            return base * half * half;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            long base = sc.nextLong();
            long exp = sc.nextLong();
            System.out.println(power(base, exp));
        }
        sc.close();
    }
}
