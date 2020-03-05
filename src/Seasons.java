public enum Seasons {
    SPRING(new String[]{"Marzec", "Kwiecień", "Maj"}, "wiosna"),
    SUMMER(new String[]{"Czerwiec", "Lipiec", "Sierpień"} , "lato"),
    AUTUMN(new String[]{"Wrzesień", "Październik", "Listopad"} , "jesień"),
    WINTER(new String[]{"Grudzień", "Styczeń", "Luty"}, "zima");

    private final String[] months;
    private final String description;

//    private String[] springMonths = {"Marzec", "Kwiecień", "Maj"};
//    private String[] summerMonths = {"Czerwiec", "Lipiec", "Sierpień"};
//    private String[] autumnMonths = {"Wrzesień", "Październik", "Listopad"};
//    private String[] winterMonths = {"Grudzień", "Styczeń", "Luty"};

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