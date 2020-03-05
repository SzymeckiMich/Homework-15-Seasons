import java.util.Arrays;
import java.util.Scanner;

public class SeasonUtils {

    public static Seasons enterAndFindSeason() {
        Scanner scanner = new Scanner(System.in);
        Seasons[] seasons = Seasons.values();
        Seasons searchedSeason = null;
        System.out.println("Podaj porę roku");
        String season = scanner.nextLine();
        Seasons.valueOf(season);
        for (int i = 0; i < seasons.length; i++) {
            if (season.equals(seasons[i].getDescription())) {
                searchedSeason = seasons[i];
            }
        }
        return searchedSeason;
    }

    public static void showInfo(Seasons season) {
        if (season != null) {
            System.out.println(season.toString() + " " + Arrays.toString(season.getMonths()));
        } else {
            System.out.println("Nie ma takiej pory roku");
        }
    }
}
