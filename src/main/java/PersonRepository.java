import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
    List<Person> persons = new ArrayList<>();

    public Optional<Person> getPersonById(int id) {
        for (Person person : persons) {
            if (person.id() == id) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
}
