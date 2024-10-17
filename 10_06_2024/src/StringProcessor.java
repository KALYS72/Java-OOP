public class StringProcessor {
    public boolean isStrongPassword(String password) {
        boolean lower = false, upper = false, digit = false, special = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                upper = true;
            } else if (Character.isLowerCase(c)) {
                lower = true;
            } else if (Character.isDigit(c)) {
                digit = true;
            } else if (!Character.isLetterOrDigit(c)) {  // Checking special characters
                special = true;
            }
        }
        return lower && upper && digit && special;
    }

    public int calculateDigits(String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public int calculateWords(String sentence) {
        int count = 1;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == ' ') {
                count++;
            }
        }
        return count;
    }

    public double calculateExpression(String expression) {
        double result = 0, currentNumber = 0;
        char currentOperation = '+';
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                currentNumber = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    currentNumber = currentNumber * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
            }
            if (c == '+' || c == '-' || c == '*' || c == '/' || i == expression.length() - 1) {
                if (currentOperation == '+') result += currentNumber;
                if (currentOperation == '-') result -= currentNumber;
                if (currentOperation == '*') result *= currentNumber;
                if (currentOperation == '/') result /= currentNumber;

                currentOperation = c;
            }
            if (c == '(') {
                int start = ++i, parentheses = 1;
                while (parentheses > 0 && i < expression.length()) {
                    if (expression.charAt(i) == '(') parentheses++;
                    if (expression.charAt(i) == ')') parentheses--;
                    i++;
                }
                currentNumber = calculateExpression(expression.substring(start, i - 1));
                i--;
            }
        }
        return result;
    }
}
