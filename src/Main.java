//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

        int[][] consoleSales = { //order: PS5 - Xbox - Switch
                {1000, 2000, 3000}, // Cape Town sales
                {2000, 3000, 4000}, // PE Sales
                {1500, 1100, 1200} // Pretoria sales
        };

        // Adds up sales from sales array to calculate totals for each city
        int[] totals = {(consoleSales[0][0]+consoleSales[0][1]+consoleSales[0][2]), (consoleSales[1][0]+consoleSales[1][1]+consoleSales[1][2]), (consoleSales[2][0]+consoleSales[2][1]+consoleSales[2][2]) };


        //Holds the totals for each city for easy retrieval
        int totalCapeTown = totals[0];
        int totalPortElizabeth = totals[1];
        int totalPretoria = totals[2];


        //Prints Report
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("PS5 XBOX SWITCH");
        System.out.println("CAPE TOWN" +" "+ consoleSales[0][0] +" "+ consoleSales[0][1] +" "+ consoleSales[0][2]);
        System.out.println("Port Elizabeth" +" "+ consoleSales[1][0] +" "+ consoleSales[1][1]  +" "+ consoleSales[1][2]);
        System.out.println("Pretoria" +" "+ consoleSales[2][0] +" "+ consoleSales[2][1] +" "+ consoleSales[2][2]);

        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("CAPE TOWN " + totalCapeTown);
        System.out.println("PORT ELIZABETH " + totalPortElizabeth);
        System.out.println("PRETORIA " + totalPretoria);

        String mostSales = cities[0];


        //Checks for which city has the highest total sales and prints only it. Default is Cape Town
        if (totalPortElizabeth > totalCapeTown) {
            mostSales = cities[1];
        }

        if (totalPretoria > totalCapeTown) {
            mostSales = cities[2];
        }

        System.out.println("CITY WITH THE MOST SALES: " + mostSales);

        System.out.println("-----------------------------------------------------------------------------------------------------------");



    }
}

