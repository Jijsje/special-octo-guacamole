package L7.Person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

class PersonTest {

    // goed bezig

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
    void testOverrides() {
        Person p = new Person("Jan", 45);
        Person a = new Person("Bob", 45);
        Person f = new Person("Bob", 45);

        System.out.println(p); // automatische toString aanroep
        System.out.println(p.toString());
        System.out.println(p.equals(a)); // geeft false
        System.out.println(a.equals(f)); // geeft true
        System.out.println("HashCode Jan = " + p.hashCode());
        System.out.println("HashCode Bob1 = " + a.hashCode());
        System.out.println("HashCode Bob2 = " + f.hashCode());
        Assertions.assertNotEquals(p, a);
        Assertions.assertEquals(a, f);
    }

    @Test
    void testUniversalRights() {
        Assertions.assertEquals("All humans are created equal.", Person.universalRights);
    }

    @Test
    public void reflectionPlaytime() {
        Object person = new Person("Ash Ketchum", 10);
        Field[] fields = person.getClass().getFields();
        Method[] methods = person.getClass().getMethods();
        int modifiers = person.getClass().getModifiers();
        System.out.println(Arrays.toString(fields));
        for (Method method:methods) {
            System.out.println(method);
            System.out.println("Modifier: " + method.getModifiers());
        }
    }
}
