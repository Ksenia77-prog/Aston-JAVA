package task1;

public abstract class Animal {
    protected String name;
    protected int maxRunLength;
    protected int maxSwimLength;
    private static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int length) {
        if (length <= maxRunLength) {
            System.out.println(name + " пробежал(а) " + length + " м.");
        } else {
            System.out.println(name + " не может пробежать " + length + " м. (Максимум: " + maxRunLength + " м.)");
        }
    }

    public void swim(int length) {
        if (maxSwimLength == 0) {
            System.out.println(name + " не умеет плавать!");
        } else if (length <= maxSwimLength) {
            System.out.println(name + " проплыл(а) " + length + " м.");
        } else {
            System.out.println(name + " не может проплыть " + length + " м. (Максимум: " + maxSwimLength + " м.)");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
