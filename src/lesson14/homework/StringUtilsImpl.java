package lesson14.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class StringUtilsImpl implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == null || number2 == null");
        }
        double num2;
        double num1;

        try {
            num1 = Double.parseDouble(number1);
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Одно из чисел не число");
        }

        if (num2 == 0) {
            throw new ArithmeticException("Второй параметр равен 0");
        }

        return num1 / num2;

    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        ArrayList<Integer> listIndexWords = new ArrayList<>();

        if (text == null || word == null) {
            throw new NullPointerException("number1 == null || number2 == null");
        }
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(text.split(" ")));

        System.out.println(text.indexOf(word));
        int[] arrResult = listIndexWords.stream().mapToInt(i -> i).toArray();


        return arrResult;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        ArrayList<Double> list = new ArrayList<>();
        double[] result = new double[text.length()];
        char[] arrChars = text.toCharArray();
        int countDigits = 0;
        for (char ch : arrChars) {
            if (Character.isDigit(ch)) {
                countDigits++;
                list.add((double) Character.getNumericValue(ch));
            }
        }
        if (countDigits == 0) {
            throw new CustomException("Not found");
        }
        result = list.stream().mapToDouble(i -> i).toArray();
        return result;
    }
}
