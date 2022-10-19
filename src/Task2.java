
/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
 каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов
 не равны, необходимо как-то оповестить пользователя. */

public class Task2 {
    public static void main(String[] args) {
        int[] firstArray = {2, 3, 4, 5, 6, 7};
        int[] secondArray = {1, 2, 3, 4, 5, 6};
        System.out.print("[ ");
        for (int item : getArrayDifferenceOfTwo(firstArray, secondArray)) {
            System.out.print(item + " ");
        }
        System.out.print("]");

    }

    static int[] getArrayDifferenceOfTwo(int[] firstArray, int[] secondArray) {
        if(firstArray.length != secondArray.length) {
            throw new RuntimeException("Данный метод принимает на вход массивы только равной длины!");
        }
        int[] resultArray = new int[firstArray.length];
        for (int i = 0; i <firstArray.length; i++) {
            resultArray[i] = firstArray[i] - secondArray[i];
        }
        return resultArray;
    }
}
