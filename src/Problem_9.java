public class Problem_9 {
    public static void main(String[] args) {
        /* Conditions: a < b < c
            a + b + c = 1000
            a^2 + b^2 = c^2

            find a*b*c
        * */

        //Try one, brute force
        for(int c = 1; c <= 1000; c++) {
            for(int b = 1; b <= 1000; b++) {
                for(int a = 1; a <= 1000; a++) {
                    if(a < b && b < c) {
                        //System.out.println("a: " + a +"\tb: "+b+"\tc: "+c);
                        if((a*a) + (b*b) == (c*c)){
                            //System.out.println("a: " + a +"\tb: "+b+"\tc: "+c);
                            if(a + b + c == 1000) {
                                System.out.println("a: " + a +"\tb: "+b+"\tc: "+c);
                                System.out.println(a*b*c);
                            }
                        }
                    }
                }
            }
        }

    }
}
