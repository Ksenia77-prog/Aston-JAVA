package homework;

public class ArrayProcessor {

    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // 1. Проверяем количество строк
        if (array == null || array.length != 4) {
            int currentLength = (array == null) ? 0 : array.length;
            throw new MyArraySizeException("Ошибка размера: количество строк должно быть 4, получено: " + currentLength);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null || array[i].length != 4) {
                int currentLength = (array[i] == null) ? 0 : array[i].length;
                throw new MyArraySizeException("Ошибка размера: в строке " + i + " должно быть 4 столбца, получено: " + currentLength);
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {

                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }

        return sum;
    }
}