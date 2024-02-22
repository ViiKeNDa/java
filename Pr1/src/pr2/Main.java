package pr2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;
    private int weight;

    public Person(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25, 60));
        people.add(new Person("Bob", 30, 75));
        people.add(new Person("Charlie", 20, 80));
        people.add(new Person("David", 35, 65));
        people.add(new Person("Emily", 22, 70));

        List<String> result = people.stream()
                .filter(person -> person.getWeight() % 5 == 0)
                .sorted(Comparator.comparingInt(person -> person.getWeight() + person.getAge()))
                .limit(4)
                .map(Person::getName)
                .collect(Collectors.toList());

        String output = String.join(" ", result);
        System.out.println(output);
    }
}