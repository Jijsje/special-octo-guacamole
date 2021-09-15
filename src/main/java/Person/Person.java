
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

    private static class PersonDiedException extends Throwable {

    }
}
