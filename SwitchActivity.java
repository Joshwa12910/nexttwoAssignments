import java.util.Scanner;
//**************************************************************
//                   Assignment #4
//                    Name: Joshua Williams
//                    Data Structures Date: Date of Submission (2/1/2023)
//***************************************************************
// I was kinda really confused by this assignment, but I tried
// This task, named "SwitchActivity", uses a switch statement.
// The program will prompt the user to enter one item then print four items,
// then use the switch statement to print out four properties of the planet.
// The properties to be printed are the order, distance from the sun, their namesake, and color.
//*****************************************************************
// This class does not use any parameters
public class SwitchActivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of a planet: ");
        String planet = input.nextLine();

        switch(planet.toLowerCase()) {
            case "mercury":
                System.out.println("Size: First planet in the Solar System");
                System.out.println("Distance from the sun: 57.91 million km");
                System.out.println("Named after the Roman messenger god.");
                System.out.println("Mercury is Gray");
                break;
            case "venus":
                System.out.println("Size: Second planet in the Solar System");
                System.out.println("Distance from the sun: 108.2 million km");
                System.out.println("Named after the Roman goddess of love and beauty.");
                System.out.println("Venus is orange");
                break;
            case "earth":
                System.out.println("Size: Third planet in the Solar System");
                System.out.println("Distance from the sun: 149.6 million km");
                System.out.println("Named after the Anglo-Saxon word for the planet, 'ertha'.");
                System.out.println("Earth is mostly blue");
                break;
            case "mars":
                System.out.println("Size: Fourth planet in the Solar System");
                System.out.println("Distance from the sun: 227.9 million km");
                System.out.println("Named after the Roman god of war.");
                System.out.println("Mars is gray, but due to rust, it now appears red.");
                break;
            default:
                System.out.println("Invalid planet name");
                break;
        }
    }
}