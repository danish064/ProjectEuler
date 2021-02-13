public class Problem_10 {
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    // A very resource intensive task
    public static void main(String[] args) {
        int limit = 2000000;
        //int n = 2000000;
        //System.out.println(n);
        String sum = "0";
        for (int i = 2; i < limit; i++) {
            if(isPrime(i)){
                //sum += i;

                sum = String.valueOf(Long.valueOf(sum) + i);
                if(Long.valueOf(sum) < 0) {
                    System.out.println("Went negative at " + sum);
                    break;
                }
                //System.out.println("i: "+i+"\tsum: " +sum);
            }
        }
        System.out.println(sum);
    }
}
