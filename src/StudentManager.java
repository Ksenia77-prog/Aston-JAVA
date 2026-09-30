import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Student {

    private final String name;
    private final String group;
    private int course;
    private final List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void promoteToNextCourse() {
        this.course++;
    }

    public double getAverageGrade() {
        if (grades == null || grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return name + " (Курс: " + course + ", Ср. балл: " + String.format("%.2f", getAverageGrade()) + ")";
    }
}

public class StudentManager {

    public static void processStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                iterator.remove();
            } else {
                student.promoteToNextCourse();
            }
        }
    }

    public static void printStudents(Collection<Student> students, int course) {
        System.out.println("Студенты на " + course + " курсе:");
        boolean found = false;

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("- " + student.getName());
                found = true;
            }
        }

        if (!found) {
            System.out.println("(нет студентов на данном курсе)");
        }
    }

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student("Иван Иванов", "БПИ-21", 1, Arrays.asList(4, 5, 3, 4)));
        students.add(new Student("Петр Петров", "БПИ-21", 1, Arrays.asList(2, 3, 2, 2)));
        students.add(new Student("Анна Сидорова", "БПИ-22", 2, Arrays.asList(5, 5, 5, 4)));
        students.add(new Student("Елена Кузнецова", "БПИ-23", 3, Arrays.asList(3, 3, 3, 4)));

        System.out.println("--- Исходный список студентов ---");
        students.forEach(System.out::println);

        processStudents(students);

        System.out.println("\n--- Список студентов после обработки ---");
        students.forEach(System.out::println);

        System.out.println();
        printStudents(students, 2);
    }
}