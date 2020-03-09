import java.util.Arrays;
import java.util.Scanner;

public class SeasonUtils {

    public static Season enterAndFindSeason() {
        Season[] seasons = Season.values();
        System.out.println("Podaj porę roku");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        return getSeason(seasons, season);
    }

    private static Season getSeason(Season[] seasons, String season) {
        Season searchedSeason = null;
        for (Season value : seasons) {
            if (season.equalsIgnoreCase(value.getDescription())) {
                searchedSeason = value;
            }
        }
        return searchedSeason;
    }

    public static void showInfo(Season season) {
        if (season != null) {
            System.out.println(season.toString() + " " + Arrays.toString(season.getMonths()));
        } else {
            System.out.println("Nie ma takiej pory roku");
        }
    }
}
