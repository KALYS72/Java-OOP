public class Main {
    public static void main(String[] args) {
        MathUtil util = new MathUtil();
        System.out.println(util.nextPrimeNumber(10));
        System.out.println(util.isArmstrongNumber(153));
        System.out.println(util.isPerfectNumber(28));
        System.out.println(util.sumOfDigits(987));
        System.out.println(util.reverseNumber(1234));
        System.out.println(MathUtil.isPrime(29));
        System.out.println(MathUtil.gcd(48, 18));
        System.out.println(MathUtil.lcm(4, 5));
        System.out.println(MathUtil.fibonacci(10));
        System.out.println(MathUtil.factorial(5));
    }
}