package HW16;

public class DigitReversed {
    public static void main(String[] args) {

    }
    public  String digitsReverse(String s) {

        char[] array = s.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;

    }

}
