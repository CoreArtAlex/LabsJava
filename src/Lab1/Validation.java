package Lab1;

public class Validation {
    public static void checkName(String name){
        if (name.length() < 3 || name.length() >20){
            throw new IllegalArgumentException("Name should be between 3 & 20 Characters");
        }
    }
    public static void checkLastName(String lastName){
        if (lastName.length() < 3 || lastName.length() >20){
            throw new IllegalArgumentException("Last Name should be between 3 & 20 Characters");
        }
    }
    public static void checkHeight(int height){
        if (height < 24 || height > 48){
            throw new IllegalArgumentException("Height should be between 24 & 40 Inches");
        }
    }
    public static void checkWeight(double weight){
        if (weight < 80 || weight > 280){
            throw new IllegalArgumentException("Weight should be between 80 & 280 Pounds");
        }
    }
    public static void checkCanTravel(boolean canTravel){
        String travel = (canTravel) ? "Does Travel" : "Does not Travel";
    }
    public static void checkSmokes(boolean smokes){
        String smoke = (smokes) ? "Does Smoke" : "Does not Smoke";
    }

}
