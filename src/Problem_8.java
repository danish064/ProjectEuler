public class Problem_8 {
    public static void main(String[] args) {
        String num = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
        int maxProduct = 0;

        /*int n1;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;*/
        int [] n = new int[13];

        int[] f = new int[13];

        for (int i = 0; i < num.length() - 13; i++) {
            /*n[0] = Integer.parseInt(String.valueOf(num.charAt(i)));
            n[1] = Integer.parseInt(String.valueOf(num.charAt(i + 1)));
            n[2] = Integer.parseInt(String.valueOf(num.charAt(i + 2)));
            n[3] = Integer.parseInt(String.valueOf(num.charAt(i + 3)));
            n[4] = Integer.parseInt(String.valueOf(num.charAt(i + 4)));
            n[5] = Integer.parseInt(String.valueOf(num.charAt(i + 5)));
            n[6] = Integer.parseInt(String.valueOf(num.charAt(i + 6)));
            n[7] = Integer.parseInt(String.valueOf(num.charAt(i + 7)));
            n[8] = Integer.parseInt(String.valueOf(num.charAt(i + 8)));
            n[9] = Integer.parseInt(String.valueOf(num.charAt(i + 9)));
            n[10] = Integer.parseInt(String.valueOf(num.charAt(i + 10)));
            n[11] = Integer.parseInt(String.valueOf(num.charAt(i + 11)));
            n[12] = Integer.parseInt(String.valueOf(num.charAt(i + 12)));*/

            for (int j = 0; j < 13; j++) {
                n[j] = Integer.parseInt(String.valueOf(num.charAt(i + j)));
            }

            //int product = n1*n2*n3*n4*n5*n6*n7*n8*n9*n10*n11*n12*n13;
            int product = 1;
            for (int j = 0; j < 13; j++) {
                product = product * n[j];
            }

            if(product > maxProduct) {
                maxProduct = product;
                for (int j = 0; j < 13; j++) {
                    f[j] = n[j];
                }
            }
        }
        for (int i = 0; i < 12; i++) {
            System.out.print(f[i] + " x ");
        }
        System.out.print(f[12] + " = " + maxProduct);
    }
    //9*7*8*1*7*9*7*7*8*4*6*1*7=2091059712
}
