public enum Seasons {
    SPRING(new String[]{"Marzec", "Kwiecień", "Maj"}, "wiosna"),
    SUMMER(new String[]{"Czerwiec", "Lipiec", "Sierpień"}, "lato"),
    AUTUMN(new String[]{"Wrzesień", "Październik", "Listopad"}, "jesień"),
    WINTER(new String[]{"Grudzień", "Styczeń", "Luty"}, "zima");

    private final String[] months;
    private final String description;

    Seasons(String[] months, String description) {
        this.months = months;
        this.description = description;
    }

    public String[] getMonths() {
        return months;
    }

    public String getDescription() {
        return description;
    }
}