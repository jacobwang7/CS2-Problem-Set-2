//This program takes user input as a string and places it at the end of the print statement with System.out.format

public class PartThree {

  public static void main (String[] args) {
    String s = args[0];
    System.out.format("Hello, %s!", s);
  }

}
