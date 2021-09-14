public class Convert {
    String[] romeIn = {"0","I","II","III","IV","V","VI","VII","VIII","IX","X"};
    String[] romeOut = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};


    public String romeResult(int res) {
        if (res < 0) {
            throw new ArrayIndexOutOfBoundException("т.к. в римской системе нет отрицательных чисел");
        }

      return romeOut[res];
    }

    public int arabicConvert(String str) {
        int x = 0;
        for (int i = 0; i < romeIn.length; i++) {
           if (str.equals(romeIn[i])) {
               x = i;
           }
        }
        return x;
    }

    public void selector(String a, char oper, String b) {

        Calc calc = new Calc();
        int firstNum;
        int secondNum;
        int result;
        int counter = 0;

        for (String s : romeIn) {
            if (a.toUpperCase().equals(s)) {
                a = a.toUpperCase();
                counter++;
            }
            if (b.toUpperCase().equals(s)) {
                b = b.toUpperCase();
                counter++;
            }
        }
    if (counter == 0) {
        firstNum = Integer.parseInt(a);
        secondNum = Integer.parseInt(b);
        System.out.println(calc.arifmetics(firstNum, oper, secondNum));
    } else if (counter == 1) {
        throw new ArithmeticException("Калькулятор умеет работать только с арабскими или римскими цифрами " +
                "одновременно, попробуйте ещё раз.");
    } else if (counter == 2) {
        firstNum = arabicConvert(a);
        secondNum = arabicConvert(b);
        result = calc.arifmetics(firstNum, oper, secondNum);
        System.out.println(romeResult(result));
    }
}
}