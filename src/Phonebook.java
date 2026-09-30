import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

    private final Map<String, List<String>> recordMap;

    public Phonebook() {
        this.recordMap = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        recordMap.putIfAbsent(surname, new ArrayList<>());
        recordMap.get(surname).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return recordMap.getOrDefault(surname, Collections.emptyList());
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Иванов", "+7 (999) 111-22-33");
        phonebook.add("Петров", "+7 (999) 444-55-66");
        phonebook.add("Иванов", "+7 (999) 777-88-99");
        phonebook.add("Сидоров", "+7 (999) 000-00-00");

        String searchSurname1 = "Иванов";
        System.out.println("Номера телефонов для фамилии \"" + searchSurname1 + "\":");
        System.out.println(phonebook.get(searchSurname1));

        String searchSurname2 = "Петров";
        System.out.println("\nНомера телефонов для фамилии \"" + searchSurname2 + "\":");
        System.out.println(phonebook.get(searchSurname2));

        String searchSurname3 = "Смирнов";
        System.out.println("\nНомера телефонов для фамилии \"" + searchSurname3 + "\":");
        System.out.println(phonebook.get(searchSurname3));
    }
}