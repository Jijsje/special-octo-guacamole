package L14;

import java.util.ArrayList;
import java.util.Objects;

public class Person extends Human{

    private String name;
    private int age;
    private Gender gender = Gender.UNKNOWN;
    public static String universalRights = "All humans are created equal.";
    private static int maximumAge = 130;
    ArrayList<HistoryRecord> history = new ArrayList<>();

    public Person(String name, int age) {
        this(name, age, Gender.UNKNOWN);
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void haveBirthday() {
        try {
            this.age++;
            if (this.age >= maximumAge) {
                throw new PersonDiedException();
            }
        } catch (PersonDiedException e) {
            System.out.println("Persons cannot get older than " + maximumAge + " years old");
        }
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) is %s", name, age, gender);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return age * Objects.hash(name) * Objects.hash(gender);
    }

    @Override
    public String greet() {
        return "Hello, my name is " + name + ". Nice to meet you!";
    }

    public void addHistory(String descr){
        history.add(new HistoryRecord(descr));
        System.out.println("History voor \"" + name + "\" heeft nu " + history.size() + " item(s).");
    }

    public void printHistory(){
        history.forEach(System.out::println);
    }

    public static Human subHuman(){
        return new Human() {
            @Override
            public String greet() {
                return "Sub is the best.";
            }
        };
    }

    private static class PersonDiedException extends Throwable {
    }

    class HistoryRecord{
        String description;

        public HistoryRecord(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

}
