import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        System.out.println(DayOfWeek.MONDAY.checkWeekend());
        System.out.println(DayOfWeek.SATURDAY.checkWeekend());

        Person aljoscha = new Person(1, "Aljoscha", DayOfWeek.MONDAY);
        Person benjamin = new Person(2,"Benjamin",DayOfWeek.SATURDAY);
        Person horst = new Person(3,"Horst",DayOfWeek.FRIDAY);
        Person peter = new Person(4,"Peter",DayOfWeek.SUNDAY);

        PersonRepository aljoschasContacts = new PersonRepository();
        aljoschasContacts.addPerson(aljoscha);
        aljoschasContacts.addPerson(horst);
        aljoschasContacts.addPerson(peter);

        System.out.println(aljoschasContacts);
        System.out.println(aljoschasContacts.getPersonById(1));
        System.out.println(aljoschasContacts.getPersonById(2));

        Optional<Person> p = aljoschasContacts.getPersonById(4);
        if (p.isPresent()) {
            System.out.println(p.get().name() + "s favorite day of the week is " + p.get().favoriteDay());
        } else {
            System.out.println("Person does not exist");
        }
    }
}
