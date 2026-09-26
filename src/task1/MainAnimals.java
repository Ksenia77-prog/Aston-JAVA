package task1;

public class MainAnimals {
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Барсик");
        Dog dogBobik = new Dog("Бобик");

        System.out.println("--- Тестирование бега и плавания ---");
        catBarsik.run(150);
        catBarsik.run(250);
        catBarsik.swim(5);

        dogBobik.run(400);
        dogBobik.swim(8);
        dogBobik.swim(15);
        System.out.println();

        System.out.println("--- Тестирование кормления котов ---");
        Cat[] cats = {
                new Cat("Мурзик"),
                new Cat("Пушок"),
                new Cat("Рыжик"),
                new Cat("Снежок")
        };

        Plate plate = new Plate(30);
        plate.info();

        int[] hungerLevels = {10, 15, 15, 5};
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate, hungerLevels[i]);
        }

        System.out.println("\n--- Информация о сытости котов ---");
        for (Cat cat : cats) {
            System.out.println("Кот " + cat.name + " сыт? -> " + (cat.isSatiated() ? "Да" : "Нет"));
        }

        plate.info();

        System.out.println("\n--- Добавление еды ---");
        plate.addFood(20);

        System.out.println("Повторно кормим оставшихся голодных котов:");
        for (int i = 0; i < cats.length; i++) {
            if (!cats[i].isSatiated()) {
                cats[i].eat(plate, hungerLevels[i]);
            }
        }

        System.out.println("\n--- Статистика созданных животных ---");
        System.out.println("Всего животных создано: " + Animal.getAnimalCount());
        System.out.println("Из них котов: " + Cat.getCatCount());
        System.out.println("Из них собак: " + Dog.getDogCount());
    }
}
