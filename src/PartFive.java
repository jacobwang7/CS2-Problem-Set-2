//This program takes user input as an array and iterates through it in a for loop
//In the for loop, word is a variable that is used to count the number of command line arguments and everytime it iterates, the variable word gets a +1 value
//first and second are variables used to compare indices to determine whether or not there are duplicates
//The for loop runs when i does not equal j because it needs to skip the index at which it first starts iterating.
//duplicates is a variable used to count the number of duplicate command lines and in the end, if the number of duplicates is greater than 0, then the progrma will note that there are duplicate command line arguments.

public class PartFive {

  public static void main(String[] args) {

    int words = 0;
    int duplicates = 0;
    String first = "";
    String second= "";

    for (int i = 0; i < args.length; i++)
    {
       words = words + 1;
      for (int j = 0; j < args.length; j++)
      {
        if (i!=j)
        {
          first = args[i];
          second = args[j];
          if (first.equals(second))
           {
            duplicates = duplicates + 1;
           }
        }
      }
    }
    System.out.println("There are " + words + " command line arguments.");
    if (duplicates > 0)
      {
      System.out.println("There is at least one duplicate command line argument.");
      } else
    {
      System.out.println("There are no duplicate command line arguments.");
    }
  }
}
