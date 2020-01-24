//This program takes user input as an integer and determines whether or not it's even or odd.
//if statements are used because if the input integer is divisible by 2, then it is even, otherwise it's odd.
//Modulo is used because it allows you to determine divisibility.

public class PartFour {

  public static void main(String[] args) {
  int n = Integer.parseInt(args[0]);
    if (n%2==0) {
      System.out.format("%d is an even number", n);
    } else {
      System.out.format("%d is an odd number", n);
    }

  }

}
