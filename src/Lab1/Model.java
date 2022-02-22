package Lab1;

import sun.font.TrueTypeFont;

/**
 * @AlejandroGuerra
 */
public class Model {
    private String name;
    private String lastName;
    private int height;
    private int inches;
    private int feet;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    // Constructor 1

    /**
     *
     */
    public Model(){

    }

    // Constructor 2

    /**
     *
     * @param name
     * @param lastName
     * @param height
     * @param weight
     * @param canTravel
     * @param smokes
     */
    public Model(String name, String lastName, int height, double weight,
                  boolean canTravel, boolean smokes){
        Validation.checkName(name);
        Validation.checkLastName(lastName);
        Validation.checkHeight(height);
        Validation.checkWeight(weight);
        Validation.checkCanTravel(canTravel);
        Validation.checkSmokes(smokes);
        setName(name);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(canTravel);
        setSmokes(smokes);
    }

    // Constructor 3

    /**
     *
     * @param name
     * @param lastName
     * @param height
     * @param weight
     */
    public Model(String name, String lastName, int height, double weight){
        Validation.checkName(name);
        Validation.checkLastName(lastName);
        Validation.checkHeight(height);
        Validation.checkWeight(weight);
        setName(name);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        this.canTravel = true;
        this.smokes = false;
    }

    public String getHeightInFeetAndInches(){
        return String.format("%1d Feet %2d inches",feet,inches);

    }

    public long getWeightKg(){
        return Math.round(weight);
    }

    public void printDetails(){
        String.format("Name: %s %s\n" +
                "Height: %2d\n" +
                "Weight: %3f\n" +
                "%s\n" +
                "%s\n",
                name, lastName, height, weight, canTravel, smokes);
    }

    // getter & setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Validation.checkName(name);
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        Validation.checkLastName(lastName);
        this.lastName = lastName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        Validation.checkWeight(weight);
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        Validation.checkHeight(height);
        this.height = height;
    }

    public void setCanTravel(boolean canTravel) {
        Validation.checkCanTravel(canTravel);
        this.canTravel = canTravel;
    }

    public void setSmokes(boolean smokes) {
        Validation.checkSmokes(smokes);
        this.smokes = smokes;
    }
}
