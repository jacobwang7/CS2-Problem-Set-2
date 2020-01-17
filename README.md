# Problem Set 2: Getting Started with Java
## Due Thursday, January 24, 11:59pm EST

This problem will allow you to get more comfortable writing, compiling, and running code in Java. This problem set will also introduce you to using Slack to ask questions. If you are new to Java, I am expecting you to write the code in Atom and to compile and run the code using the platformio-ide-terminal package within Atom or with cmd (Windows) or Terminal (Mac) outside of Atom.

---

### Reminder: Cloning

You have three options to clone the repository so that you have a local copy on your computer:

1. Use the GitHub Desktop app to clone the repo, then move it to your course directory.

*OR*

2. Use a terminal to issue ``git clone``, then move the repo to your course directory.

*OR*

3. Follow the instructions in the last problem set for using the Packages -> Command Palette in Atom.

After this problem set, I'll assume you have figured out the best way to do this for your system.

### Action Item: Slack
You will recieve an email sometime soon asking you to join the class Slack workspace. Accept the invitation. You are more than welcome to create an alias for yourself on Slack so that you can ask a question anonymously! The reason for using Slack is so that we don't have to write the same email 100 times and so that you can get answers quickly without waiting around for us to respond.

When you have a question on this problem set, post it to Stack. Remember to include the text of any error messages you get or to include a sreenshot of Atom at the time you run into a problem.

### Part 1: Compiling and running a Java program

1. Open your repository in Atom.

2. Click on the `src`  folder in the tree structure on the left, then go to ``Packages -> platformio-ide-terminal -> New Terminal``. 

3. In the terminal, make sure you're in the `src` directory by typing `pwd`. If you're not, use the `cd` command (e.g., `cd src` or `cd ..` to navigate to the `src` directory. Then type the following by the blinking cursor in the terminal to compile the code in `PartOne.java`. **NOTE:** Everything up to and including the `$` is what the prompt looks like on my computer. It might look different on your computer, but it will probably end with `$`. You only need to type everything that comes after the `$` below.

```bash
[bash ps1]$ javac PartOne.java
```

This will create a new file, `PartOne.class`, which is the Java byte code that can be understood by the Java virtual machine. 

3. Now run your program by typing:

```bash
[bash ps1]$ java PartOne
```

4. This should print ``Hello, World!`` to the screen.


### Part 2 (2 points) 
Java programs can receive *command line arguments* (i.e., input provided on the command line when running the program) just as they can in Python. The body of any `main` function in Java can access the command line arguments in the array `args` that we have seen in the declaration `public static void main (String[] args)`. In the following command:

   ```java
   [bash ps1]$ java PartTwo Boston College
   ```

   `args.length` would be `2`, the string `"Boston"` would be in `args[0]` while the string `"College"` would be the value in `args[1]`. 

In the provided `PartTwo.java` file, rewrite the call to `System.out.println` so that it accepts a name from the command line. Running it as in

   ```java
   [bash ps1]$ java PartTwo Mookie
   ```

   should print

   ```java
   Hello, Mookie!
   ```

Make sure you did it right by compiling and running your code, as described in Part 1.

### Part 3 (2 points)
Java's `System` package has utilities for reading in input and printing out output (I/O). You have seen `System.out.println` which prints to standard out (i.e., the screen) whatever you give it as an argument. There's also a handy function named `format` in `System.out` which supports formatted output and does not include a new line at the end by default.  For example, the call

   ```java
   System.out.format("The city of %s is amazing!", "Boston");
   ```

   would print to the console

   ```java
   The city of Boston is amazing!
   ```

   The string `"The city of %s is amazing!"` is a *format string* and `%s` represents a placeholder in the string accepting a String as input. Other specifiers are `%d`, `%f` and `%c` for integers, floats, and characters, respectively. If you need a new line, you'd use `%n`. For example, this code:

   ```java
   int x = 12;
   String y = "seltzer";
   double z = 3.14;
   System.out.format("My favorite drink is %s, my favorite number is %d, ", y, x);
   System.out.format("and my favorite truncation of pi is %.2f%n", z);
   ```

   would print out

   ```bash
 My favorite drink is seltzer, my favorite number is 12, and my favorite truncation of pi is 3.14
   ```

1. Make a new file **in the `src` directory** called `PartThree.java`. Copy and paste the contents of `PartOne.java` or `PartTwo.java` into this new file. **Don't forget to change the name of the class to match the name of the file!**

2. Find the line of code that uses `System.out.println`.

3. Rewrite this line of code to do 2 things: (1) Use `System.out.format` instead of `System.out.println`. (2) Using `args[0]`, make this line print out a hello to the first command line argument. If the user runs the program like this `java PartThree Awkwafina`, then your program shoud print out `Hello, Awkwafina!`. 

4. Make sure you did it right by compiling and running your code, as described in Part 1.


### Part 4 (2 points) 
As we have seen, the if-else control structure in Java is not that different from what you see in Python. The important thing to remember is that Java uses parenthesis and curly braces. No colons or indentation are necessary in Java (though proper indentation is nice). 

Create a brand-new file in the `src` directory called `PartFour.java`. Using one of the earlier programs as a template, create a class declaration and main method. Your main method should take the first command-line argument and report whether it is an odd or an even integer. (You can assume that the user will be cooperative and always provide an integer as the first command-line argument.)

For instance, if the program is called like this:

```bash
java PartFour 7
```

the program should print out

```bash
7 is an odd number
```

You will need to use `System.out.format`, `args[0]`, and the mathematical operator called modulus `%`. The modulus operator returns the remainder when dividing the first number by the second number. If `a % 2` is equal to 0, then `a` is an even number, because all even numbers are divisible by 2 (i.e., they give a remainder of 0 when divided by 2). Otherwise, `a` is odd.  

### Part 5 (3 points) 
Now create a new file in `src` called `PartFive.java`. You will write a program that takes an integer `n` as a command line argument and then uses `n` to determine how many times to print the string:

   ```java
   This does not spark joy.
   ```

   For example, the call

   ```java
   [bash ps1]$ java PartFive 4
   ```

   would print

   ```java
   This does not spark joy.
   This does not spark joy.
   This does not spark joy.
   This does not spark joy.
   ```

For this problem you'll need to figure out how to do two things: (1) to convert a string representation of an integer such as `"343"` to an actual `int` `343`, and (2) to call the `System.out.println` function repeatedly. For the former, take a stroll through [the documentation for Java's built-in `Integer` class](https://docs.oracle.com/javase/8/docs/api/?java/lang/Integer.html) to see if there are any pre-defined library functions that might convert a string such as `"343"` to an integer `343`. For the latter, refer to the class notes on for-loops in Java, look at the text book appendix on Java, or simply Google around a bit for information on Java for-loops, which are a bit different from `for` statements in Python. 

---

Once your code works to your satisfaction, save the files, stage them, commit them, and push them to your personal master repo on the GitHub Classroom site, as you did for ps1. Use the commit message "READY FOR GRADING" so we know you are done. For a reminder about how to do this, see ps1.

As always, you can check to see if it worked by going to your account on GitHub and checking to see if it was updated and whether the files have changed in the way you expected. This is your responsibility.

---

## Important notes on grading

1. The only acceptable way to submit is through GitHub. If you do not submit via GitHub, you will get a 0.

2. All `.java` files **must be in the `src` directory**. You will lose 1 point for every `.java` file you put in a different directory.

3. Your code must compile. If one of your programs does not compile, you will get a 0 for that component of the problem set. 

