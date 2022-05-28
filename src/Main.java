
//  # NAME - LOVEPREET KAUR
//  # STUDENT ID - A00238391
//  # PROGRAM NAME - MAPD ( MOBILE APPLICATION DEVELOPMENT)



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // a scanner with the name of input to get input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numerical value to convert :");
        int enteredNumber = input.nextInt();
        System.out.println("what would u like to like to covert \n Enter 'M' for mass \n Enter 'D' for distance \n Enter 'T' for temperature");
        String measurments = input.next();
        //  used a main if-else statement to give choice to the user to select one of the measurments (mass, distance, and temperature
        if (measurments.equals("M")) {
            System.out.println("specified the units(oz,g,kg,lb) of entered number (required):");
            // stored the specified unit into a string variable with the name of unit
            String unit = input.next();
            // just print an extra line to make the input clear to the user
            System.out.println("your entered number is :" + enteredNumber + unit);
            // a nested if is used to give a choice to choose among the units of mass (kg, lb, g, and oz)
            if (unit.equals("kg")) {
                System.out.println(" choose the units(oz,g,lb) in which would u like to convert entered number (required):");
                 String covUnit = input.next();
                // add extra a nested if to give a choice to choose the unit to convert

                if (covUnit.equals("lb")) {
                    System.out.println(enteredNumber + " kilograms are equal to " + (enteredNumber * 2.2) + " lb (pounds)");
                }
                    else if (covUnit.equals("g")) {
                    System.out.println(enteredNumber + " kilograms are equal to " + (enteredNumber * 1000) + " g (gram)");
                } else if (covUnit.equals("oz")) {
                    System.out.println(enteredNumber + " kilograms are equal to " + (enteredNumber * 35.274) + " oz (ounce)");
                    } else {
                    System.out.println(" oops !! choose the correct unit ");
                }

                }
            else if (unit.equals("lb")) {
                System.out.println(" choose the units(oz,g,kg) in which would u like to convert entered number (required):");
                String covUnit = input.next();
                // an extra nested if again
                if (covUnit.equals("kg")) {
                    System.out.println(enteredNumber + " pounds are equal to " + (enteredNumber * 0.45) + " kg (kilograms)");
                } else if (covUnit.equals("g")) {
                    System.out.println(enteredNumber + " pounds are equal to " + (enteredNumber * 453.592) + " g (grams)");
                } else if (covUnit.equals("oz")) {
                    System.out.println(enteredNumber + " pounds are equal to " + (enteredNumber * 16) + " oz (ounce)");
                } else {
                    System.out.println(" oops !! choose the correct unit ");
                }
            }else if (unit.equals("g")) {
                System.out.println(" choose the units(oz,lb,kg) in which would u like to convert entered number (required):");
                String covUnit = input.next();
                // an extra nested if again
                if (covUnit.equals("kg")) {
                    System.out.println(enteredNumber + " grams are equal to " + (enteredNumber * 0.001) + " kg (kilograms)");

                } else if (covUnit.equals("lb")) {
                    System.out.println(enteredNumber + " grams are equal to " + (enteredNumber * 0.0022) + " lb (pounds)");

                } else if (covUnit.equals("oz")) {
                    System.out.println(enteredNumber + " grams are equal to " + (enteredNumber * 0.04) + " oz (ounce)");

                } else {
                    System.out.println(" oops !! choose the correct unit ");
                }
            } else if (unit.equals("oz")) {
                System.out.println(" choose the units(g,lb,kg) in which would u like to convert entered number (required):");
                String covUnit = input.next();
                // an extra nested if again
                if (covUnit.equals("kg")) {
                    System.out.println(enteredNumber + " ounce are equal to " + (enteredNumber * 0.02835) + " kg (kilograms)");

                } else if (covUnit.equals("g")) {
                    System.out.println(enteredNumber + " ounce are equal to " + (enteredNumber * 28.35) + " g (grams)");
                } else if (covUnit.equals("lb")) {
                    System.out.println(enteredNumber + " ounce are equal to " + (enteredNumber * 0.0625) + " lb (pounds)");
                } else {
                    System.out.println(" oops !! choose the correct unit ");
                }
            } else {
                System.out.println("you entered a wrong unit");
            }
        }// first nested if for mass units is ended

            // else-if for the choice distance measurments
         else if (measurments.equals("D")) {
            System.out.println("specified the units(km,mi,cm,in) of entered number (required):");
            String unit = input.next();
            System.out.println("your entered number is :" + enteredNumber + unit);
            // a new nested 'if' to choose one unit among the units of distance
            // just trying code with only one nested if
            if (unit.equals("km")) {
                System.out.println(enteredNumber + " kilometers are equal to " + (enteredNumber * 0.62) + " mi (miles)");
                System.out.println(enteredNumber + " kilometers are equal to " + (enteredNumber * 100000) + " cm (centimeters)");
                System.out.println(enteredNumber + " kilometers are equal to " + (enteredNumber * 39370.1) + " in (inches)");

            } else if (unit.equals("mi")) {
                System.out.println(enteredNumber + " miles are equal to " + (enteredNumber * 1.61) + " km (kilometer)");
                System.out.println(enteredNumber + " miles are equal to " + (enteredNumber * 160934) + " cm (centimeter)");
                System.out.println(enteredNumber + " miles are equal to " + (enteredNumber * 63360) + " in (inches)");

            } else if (unit.equals("cm")) {
                System.out.println(enteredNumber + " centimeter are equal to " + (enteredNumber * 0.39) + " in (inches)");
                System.out.println(enteredNumber + " centimeter are equal to " + (enteredNumber * 0.000001) + " km (kilometers)");
                System.out.println(enteredNumber + " centimeter are equal to " + (enteredNumber * 0.00000621) + " mi (miles)");

            } else if (unit.equals("in")) {
                System.out.println(enteredNumber + " inches are equal to " + (enteredNumber * 2.54) + " cm (centimeters)");
                System.out.println(enteredNumber + " inches are equal to " + (enteredNumber * 0.0000254) + " km (kilometers)");
                System.out.println(enteredNumber + " inches are equal to " + (enteredNumber * 0.00001578) + " mi (miles)");

            } else {
                System.out.println("you entered a wrong unit");
            }
        }
         // the executable code for the temperature
         else if (measurments.equals("T")){
            System.out.println("specified the units(C, F) of entered number (required):");
            String unit = input.next();
            System.out.println("your entered number is :" + enteredNumber + unit);
            // giving a choice to choose between celsius and fahrenheit
            if (unit.equals("C")) {
                // trying a different style of input to check concatenation
                System.out.println(enteredNumber + " degree celsius is equal to " + ((enteredNumber * 9/5)+ 32) + " F (fahrenheit)"+ (enteredNumber + 273.15)+ " K (kelvin)");

            } else if (unit.equals("F")) {
                System.out.println(enteredNumber + " degree fahrenheit is equal to " + ((enteredNumber-32)*5/9) + " C (celsius)" + (((enteredNumber-32)*5/9+273.15)) + " K (Kelvin)");
            }else {
                System.out.println("you entered a wrong unit");

            }
        }
        else {
            System.out.println("oops! you choose the wrong measurments");
        }

    }
}



