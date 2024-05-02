public enum DayOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");

    private final String weekend;

    DayOfWeek(String weekend) {
        this.weekend = weekend;
    }

    String checkWeekend() {
       return weekend;
    }
}
