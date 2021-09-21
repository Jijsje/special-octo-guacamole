package L7.Person;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private Gender gender = Gender.UNKNOWN;
    public static String universalRights = "All humans are created equal.";
    private static int maximumAge = 130;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    private static class PersonDiedException extends Throwable {

    }
}
