package L13;

import L7.Person.Android;
import L7.Person.Human;
import L7.Person.Person;
import L7.Person.Teacher;

public class House <H extends Human>{

    public static void main(String[] args) {
        House huisje1 = new House(new Person("Felix", 34));
        House huisje2 = new House(new Android());
        House huisje3 = new House(new Teacher("Ferdinand", 70));
        System.out.println(huisje1.toString());
        System.out.println(huisje2);
        System.out.println(huisje3);
    }

    H human;

    public House(H human){
        this.human = human;
    }

    @Override
    public String toString() {
        return "This house is owned by [" + human.toString() + "] and it says [" + human.greet() + "].";
    }
}
