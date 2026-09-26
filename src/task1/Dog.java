package task1;

public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        this.maxRunLength = 500;
        this.maxSwimLength = 10;
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}
