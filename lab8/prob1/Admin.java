package lab8.prob1;

import java.util.HashMap;
import java.util.List;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> map = new HashMap<>();

        if (students == null) {
            return map;
        }

        for (Student s : students) {
            if (s == null) continue;

            String firstName = s.getFirstName();
            String lastName = s.getLastName();

            if (firstName == null || lastName == null) continue;

            Key key = new Key(firstName, lastName);
            map.put(key, s);
        }

        return map;
    }
}
