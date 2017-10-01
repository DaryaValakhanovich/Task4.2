public class RomanNumbers {
    public static void main(String[] args) {
        String number1 = "MDCXLIV";
        System.out.println(number2(arrayOfNumbers(number1)));
    }

    private static int[] arrayOfNumbers(String number) {
        int[] array = new int[number.toCharArray().length];
        for (int i = 0; i < array.length; i++) {
            switch (number.toCharArray()[i]) {
                case 'M':
                    array[i] = 1000;
                    break;
                case 'D':
                    array[i] = 500;
                    break;
                case 'C':
                    array[i] = 100;
                    break;
                case 'L':
                    array[i] = 50;
                    break;
                case 'X':
                    array[i] = 10;
                    break;
                case 'V':
                    array[i] = 5;
                    break;
                case 'I':
                    array[i] = 1;
                    break;
            }
        }
        return array;
    }

    private static int number2(int[] array){
        int result = 0;
        for ( int i = 0; i < array.length - 1; i++){
            if (i != array.length - 1){
                if (array[i] < array[i + 1]){
                    result -= array[i];
                } else {
                    result += array[i];
                }
            }
        }
        return result + array[array.length - 1];
    }
}
