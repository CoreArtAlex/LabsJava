package Lab2;

import java.util.Objects;

public class ValidationProvince {
    public static void isValidProvince(String nameProvince) {
        String[] provinces = {"Ontario", "Quebec", "British Columbia", "Alberta", "Manitoba",
                "Saskatchewan", "Nova Scotia", "New Brunswick", "Newfoundland and Labrador", "Prince Edward Island"};

        for (String province : provinces) {
            boolean result = Objects.equals(nameProvince, province);
        }
    }

    public static void isValidCapitalCity() {
        String[] capitals = {"Toronto", "Quebec City", "Victoria", "Edmonton", "Winnipeg",
                "Regina", "Halifax", "Fredericton", "St. John's", "Charlottetown"};
        for ( String capital : capitals){
            boolean result = Objects.equals(capital, capitals);
        }
    }

    public static void isValidPopulation(int population){
        Boolean result = population >= 30000 && population <= 150000;
    }

}
