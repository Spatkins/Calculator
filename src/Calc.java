public class Calc {
    public int arifmetics(int a, char operation, int b) {

        int result = 0;
        String error = "Wrong number";
        boolean isTrue = a > 0 && a < 11 && b > 0 && b < 11;

        if (isTrue) {

            if (operation == '-') {
                result = a - b;
            }
            if (operation == '+') {
                result = a + b;
            }
            if (operation == '/') {
                result = a / b;
            }
            if (operation == '*') {
                result = a * b;
            }
        } else {
            throw new WrongNumberException(error);
        }
        return result;
    }
}