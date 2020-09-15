/**
* A program to says hi to a user and calculate their age approximately
* @author Andrew kamal
*/
public class Main {

 /**
  * The code runs when you hit the run button.
  * @param args The command-line arguments
  */
 public static void main(String[] args) {
   // declare a variable that will rememeber a name
   String name;
   // initialize the name variable with Sam
   name = "Sam";
  
   // declare and initialize a constant to store the current year
   final int CURRENT_YEAR= 2020;

   // declare and initialize a variable to store the year they were born
   int birthYear = 2004;

   // declare and calculate their age
   int age = CURRENT_YEAR - birthYear;

 }
}
