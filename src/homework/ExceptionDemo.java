package homework;

public class ExceptionDemo {

    public static void generateAndCatchException() {
        int[] smallArray = {1, 2, 3};

        System.out.println("--- Демонстрация ArrayIndexOutOfBoundsException ---");
        try {
            // Массив имеет индексы 0, 1, 2. Индекс 5 гарантированно вызовет ошибку.
            int forbiddenValue = smallArray[5];
            System.out.println("Этот текст никогда не напечатается: " + forbiddenValue);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Успешно перехвачено стандартное исключение!");
            System.out.println("Сообщение об ошибке: " + e.toString());
        }
    }
}