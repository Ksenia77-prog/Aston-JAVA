package homework;

public class Main {
    public static void main(String[] args) {

        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        String[][] wrongDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "ОШИБКА", "11", "12"},
                {"13", "14", "15", "16"}
        };

        System.out.println("--- Тест 1: Корректный массив ---");
        try {
            int result = ArrayProcessor.processArray(correctArray);
            System.out.println("Расчет успешно завершен! Сумма элементов: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\n--- Тест 2: Ошибка размера массива ---");
        try {
            int result = ArrayProcessor.processArray(wrongSizeArray);
            System.out.println("Сумма: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }

        System.out.println("\n--- Тест 3: Ошибка данных в ячейке ---");
        try {
            int result = ArrayProcessor.processArray(wrongDataArray);
            System.out.println("Сумма: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }

        System.out.println();
        ExceptionDemo.generateAndCatchException();
    }
}
