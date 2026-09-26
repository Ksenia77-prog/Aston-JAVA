package task1;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isSatiated;

    public Cat(String name) {
        super(name);
        this.maxRunLength = 200;
        this.maxSwimLength = 0;
        this.isSatiated = false;
        catCount++;
    }

    public void eat(Plate plate, int amount) {
        if (isSatiated) {
            System.out.println("Кот " + name + " уже сыт и отказывается от еды.");
            return;
        }
        if (plate.decreaseFood(amount)) {
            this.isSatiated = true;
            System.out.println("Кот " + name + " съел " + amount + " еды и теперь сыт.");
        } else {
            System.out.println("Коту " + name + " не хватило еды в миске (нужно " + amount + "), он остался голодным.");
        }
    }

    public boolean isSatiated() {
        return isSatiated;
    }

    public static int getCatCount() {
        return catCount;
    }
}
