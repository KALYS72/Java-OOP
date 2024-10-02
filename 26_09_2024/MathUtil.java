import java.util.LinkedList;

public class MathUtil {
    // Static methods
    public static boolean isPrime(int i) {
        if (i <= 1) {
            return false;
        }
        for (int j = 2; j <= i / 2; ++j) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, next;
        for (int i = 2; i <= n; ++i) {
            next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Non-static methods
    public int nextPrimeNumber(int i) {
        int res = i + 1;
        while (!isPrime(res)) {
            res++;
        }
        return res;
    }

    public boolean isArmstrongNumber(int i) {
        int original = i;
        int res = 0;
        LinkedList<Integer> list = new LinkedList<>();
        while (i != 0) {
            list.addFirst(i % 10);
            i /= 10;
        }
        int power = list.size();
        for (int j : list) {
            res += (int) Math.pow(j, power);
        }
        return res == original;
    }

    public boolean isPerfectNumber(int i) {
        int sum = 0;
        for (int j = 1; j < i; j++) {
            if (i % j == 0) {
                sum += j;
            }
        }
        return sum == i;
    }

    public int sumOfDigits(int i) {
        int res = 0;
        while (i != 0) {
            res += i % 10;
            i /= 10;
        }
        return res;
    }

    public int reverseNumber(int i) {
        int res = 0;
        while (i != 0) {
            res = res * 10 + i % 10;
            i /= 10;
        }
        return res;
    }
}
