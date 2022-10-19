import java.util.Scanner;

/* Реализуйте 3 метода, чтобы в каждом из них получить разные исключения. Посмотрите на код, и подумайте
    сколько разных типов исключений вы тут сможете получить? */

public class Task1 {
    public static void main(String[] args) {
    int[] array = new  int[5];               // {0}, null
    String index = "4";                      // "yygy"
    String value = "10";                     // "10.365"

    fillArray(array);                    // ArrayIndexOutOfBoundsException, InputMismatchException, NullPointerException
    addArrayElement(array, index, value);// NumberFormatException, ArrayIndexOutOfBoundsException, NullPointerException
    getAverageOfArray(array);            //ArithmeticException, NullPointerException
}


    static void fillArray(int[] array) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Введите индекс элемента масива для добавления :");
        int index = scanner1.nextInt();
        System.out.println("Ведите значение для добавления элемента массива с индексом " + index);
        int number = scanner2.nextInt();
        array[index] = number;
        scanner1.close();
        scanner2.close();

    }

    static void addArrayElement(int[] array, String index, String value) {
        array[Integer.parseInt(index)] = Integer.parseInt(value);
    }

    static void getAverageOfArray(int[] array) {
        int sum = 0;
        for (int item : array) sum += item;
        int average = sum / array.length;
    }
}
