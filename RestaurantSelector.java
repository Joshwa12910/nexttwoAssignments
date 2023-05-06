import java.util.Scanner;
//**************************************************************
//                   Assignment #5
//                    Name: Joshua Williams
//                    Data Structures Date: Date of Submission (2/1/2023)
//***************************************************************
// The task of the class RestaurantSelector is to ask the user about dietary restrictions such as
// (vegetarian, vegan, gluten-free) of the members of the party, and then display only the restaurants
// from the list restaurants that meet the specified dietary restrictions.
//*****************************************************************
// This class doesn't use any parameters
public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Is anyone in your party a vegetarian? (yes/no) ");
        String veg = input.nextLine();
        System.out.print("Is anyone in your party vegan? (yes/no) ");
        String vegan = input.nextLine();
        System.out.print("Is anyone in your party gluten-free? (yes/no) ");
        String gluten = input.nextLine();

        System.out.println("\nHere are your restaurant choices:");

        if (veg.equalsIgnoreCase("yes") || vegan.equalsIgnoreCase("yes")) {
            if (vegan.equalsIgnoreCase("yes")) {
                if (gluten.equalsIgnoreCase("yes")) {
                    System.out.println("The Chef's Kitchen");
                    System.out.println("Corner Café");
                } else {
                    System.out.println("The Chef's Kitchen");
                    System.out.println("Corner Café");
                    System.out.println("Main Street Pizza Company");
                }
            } else {
                if (gluten.equalsIgnoreCase("yes")) {
                    System.out.println("The Chef's Kitchen");
                    System.out.println("Corner Café");
                    System.out.println("Main Street Pizza Company");
                    System.out.println("Mama's Fine Italian");
                } else {
                    System.out.println("The Chef's Kitchen");
                    System.out.println("Corner Café");
                    System.out.println("Main Street Pizza Company");
                    System.out.println("Mama's Fine Italian");
                }
            }
        } else {
            if (gluten.equalsIgnoreCase("yes")) {
                System.out.println("Main Street Pizza Company");
                System.out.println("Corner Café");
            } else {
                System.out.println("Joe's Gourmet Burgers");
                System.out.println("Main Street Pizza Company");
                System.out.println("Corner Café");
                System.out.println("Mama's Fine Italian");
            }
        }
        input.close();
    }
}