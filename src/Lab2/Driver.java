package Lab2;

import java.sql.SQLOutput;

public class Driver {
    private Province[] provinces;
    static Canada canada = new Canada(null);
    canada.displayAllProvinces();

    public static void main(String[] args) {
        System.out.println(canada.getNumberProvincesBetween(1,15));
    }

}
