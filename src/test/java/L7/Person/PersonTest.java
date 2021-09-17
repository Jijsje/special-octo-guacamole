package L7.Person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testPersonGender() {
        Person p = new Person("Jan", 45);
        Assertions.assertEquals(Gender.UNKNOWN, p.getGender());
        p.setGender(Gender.MALE);
        Assertions.assertEquals(Gender.MALE, p.getGender());
    }

    @Test
    void testPersonBirthday() {
        Person p = new Person("Jan", 45);
        p.haveBirthday(); // person gets one year older
        Assertions.assertEquals(46, p.getAge());
    }

    @Test
    void testUniversalRights() {
        Assertions.assertEquals("All humans are created equal.", Person.universalRights);
    }
}