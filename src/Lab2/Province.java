package Lab2;

/**
 * @AlejandroGuerra
 */
public class Province {
    private String nameProvince;
    private String capital;
    private long population;


    public Province(String nameProvince, String capital, long population){
        ValidationProvince.isValidProvince(nameProvince);
        ValidationProvince.isValidCapitalCity();
        ValidationProvince.isValidPopulation((int) population);
        setNameProvince(nameProvince);
        setCapital(capital);
        setPopulation(population);
    }

    public String getDetails(){
        return String.format("The Capital City of %s (population. %6d) is %s.", nameProvince, population, capital);
    }


    public String getNameProvince() {
        return nameProvince;
    }

    public void setNameProvince(String nameProvince) {
        ValidationProvince.isValidProvince(nameProvince);
        this.nameProvince = nameProvince;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        ValidationProvince.isValidCapitalCity();
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        ValidationProvince.isValidPopulation((int) population);
        this.population = population;
    }
}
