public class GreatestCommonDivisor {
    //gcd - Greatest common divisor
    public static int findGcd(int a, int b){

        if (a == 0){
            return b;
        }
        if (b == 0){
            return a;
        }

        return findGcd(b % a, a);
    }
}
