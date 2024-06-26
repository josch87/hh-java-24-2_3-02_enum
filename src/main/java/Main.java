import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        System.out.println(DayOfWeek.MONDAY.checkWeekend());
        System.out.println(DayOfWeek.SATURDAY.checkWeekend());

        Person aljoscha = new Person(1, Gender.MALE, "Aljoscha", DayOfWeek.MONDAY);
        Person benjamin = new Person(2, Gender.MALE,"Benjamin",DayOfWeek.SATURDAY);
        Person horst = new Person(3, Gender.FEMALE, "Horst",DayOfWeek.FRIDAY);
        Person peter = new Person(4, Gender.DIVERSE,"Peter",DayOfWeek.SUNDAY);
        Person susanne = new Person(5, Gender.FEMALE,"Susanne",DayOfWeek.SUNDAY);

        PersonRepository aljoschasContacts = new PersonRepository();
        aljoschasContacts.addPerson(aljoscha);
        aljoschasContacts.addPerson(horst);
        aljoschasContacts.addPerson(peter);
        aljoschasContacts.addPerson(susanne);

        System.out.println(aljoschasContacts);
        System.out.println(aljoschasContacts.getPersonById(1));
        System.out.println(aljoschasContacts.getPersonById(2));

        Optional<Person> p = aljoschasContacts.getPersonById(4);
        if (p.isPresent()) {
            System.out.println(p.get().name() + "s favorite day of the week is " + p.get().favoriteDay());
        } else {
            System.out.println("Person does not exist");
        }

        for (Gender gender : Gender.values()) {
            System.out.println(gender + ": " + aljoschasContacts.countGender(gender));
        }

        String searchTerm = "susanne";
        Optional<Person> s = aljoschasContacts.getPersonByName(searchTerm);
        if (s.isEmpty()) {
            System.out.println("Was not able to find a contact with the name \"" + searchTerm + "\"");
        } else {
            Person sus = s.get();
            System.out.println(sus.name() + "s gender is " + sus.gender());
        }

        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day + ": " + aljoschasContacts.getPersonsByFavoriteWeekday(day));
        }
    }
}
