import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
    List<Person> persons = new ArrayList<>();

    public void addPerson(Person person) {
        persons.add(person);
    }

    @Override
    public String toString() {
        return "PersonRepository{" +
                "persons=" + persons +
                '}';
    }

    public Optional<Person> getPersonById(int id) {
        for (Person person : persons) {
            if (person.id() == id) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public int countGender(Gender gender) {
        int count = 0;
        for (Person person : persons) {
            if (person.gender().equals(gender)) {
                count ++;
            }
        }
        return count;
    }
}
