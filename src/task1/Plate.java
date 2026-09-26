package task1;

public class Plate {
    private int food;

    public Plate(int food) {
        if (food < 0) {
            this.food = 0;
        } else {
            this.food = food;
        }
    }

    public boolean decreaseFood(int amount) {
        if (amount <= food) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("В миску добавлено " + amount + " еды. Всего еды: " + food);
        }
    }

    public void info() {
        System.out.println("В миске осталось еды: " + food);
    }
}
