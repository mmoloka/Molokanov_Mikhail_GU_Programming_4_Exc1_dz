
/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый
массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины
массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное
исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше */

public class Task3 {
    public static void main(String[] args) {
        int[] firstArray = {4, 6, 8, 10, 12, 14};
        int[] secondArray = {2, 3, 4, 5, 6, 7};
        System.out.print("[ ");
        for (int item : getArrayQuotientOfTwo(firstArray, secondArray)) {
            System.out.print(item + " ");
        }
        System.out.print("]");

    }



    static int[] getArrayQuotientOfTwo(int[] firstArray, int[] secondArray) {
        if(firstArray.length != secondArray.length) {
            throw new RuntimeException("Данный метод принимает на вход массивы только равной длины!");
        }
        int[] resultArray = new int[firstArray.length];
        for (int i = 0; i <firstArray.length; i++) {
            if(secondArray[i] !=0) resultArray[i] = firstArray[i] / secondArray[i];
            else resultArray = new int[0];
        }
        return resultArray;
    }
}
