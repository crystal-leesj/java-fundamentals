import java.time.LocalDateTime;

public class Main {
  public static void main(String[] args) {
    // System.out.println("Hello World!");

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(1);
    // flipNHeads(2);

    Main object = new Main();
    object.clock();
  }

  // Write a function called pluralize that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.
  public static String pluralize(String animal, int n) {
    char s = 's';
    if (n == 0) {
      return animal + s;
    } else if (n > 1) {
      return animal + s;
    }
    else {
      return animal;
    }
  }

  // Write a function called flipNHeads that accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.
  public static void flipNHeads(int n) {
    double rand = Math.random();
    int flipCounter = 0;
    int headsCounter = n;

    while (headsCounter != 0) {
      if (rand > 0.5) {
        System.out.println(String.format("heads"));
        flipCounter++;
        headsCounter--;
      } else {
        System.out.println(String.format("tails"));
        flipCounter++;
        rand = Math.random();
      }
    }

    System.out.println(String.format("It took %d flips to flip %d head in a row.", flipCounter, n));
  }

  // Write a method clock that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.

  // REF - https://crunchify.com/how-to-run-a-program-forever-in-java-keep-running-main-thread-continuously/
  private synchronized void clock() {
    LocalDateTime now = LocalDateTime.now();
    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();

		while (true) {
			System.out.println(String.format("%d:%d:%d", hour, minute, second));
			try {
				this.wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}