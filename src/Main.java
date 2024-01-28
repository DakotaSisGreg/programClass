/**
 * gitExample
 */

//

public class Main{

//    public static void main(String[] args) {
//    repeatFront dakota = new repeatFront();
//    String output= dakota.repeatFront(str:"dakota", n:4);
//    System.out.println(dakota.repeat)
//    }


    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.repeatFrontDoWhile("Chocolate",4));
        System.out.println(obj.repeatFrontFor("Chocolate",4));
        System.out.println(obj.repeatFrontWhile("Chocolate",4));
    }

    /**
     * method: repeatFrontFor
     * @param str
     * @param n
     * @return
     */
    public String repeatFrontFor(String str, int n){
        String newString=" ";
        for(int i =n;i >=0; i--){
            newString += str.substring(0,i);
        }
        return newString;
            
    }

    public String repeatFrontWhile(String str, int n){
        String newString = " ";
        int i = n;
        while (i>=0){
            newString += str.substring(0,i);
            i--;
        }
        return newString;
       }

    public String repeatFrontDoWhile(String str, int n ){
        String newString = " ";
        int i = n;
        do {
            newString += str.substring(0,i);
            i--;
        }
        while (i>=0);
        return newString;
    }

}

// Variables practice
public class variablePractice {
    public static void main(String[] args) {
     int temperature = 25;
        System.out.println("Temperature: " + temperature);

    String firstName = "Dakota";
    String lastName = "Gregory";

    String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);
    }
}

// strings and chars practice
public class stringCharacterPractice{
    public static void main(String[] args) {
    String message = "Hello, World!";
    System.out.println(message.length());

    String quote = "Im absolutely losing my mind!";
    if (quote.length() >= 10) {
            char charAt10thPosition = quote.charAt(9);
            System.out.println("Character at the 10th position: " + charAt10thPosition);
        } else {
            System.out.println("The quote is not long enough to have a 10th position character.");
        }
    }
}

// Loops practice

public class evenNumbers {
    public static void main (String[]args) {
        int number = 10;
        System.out.println("List of even numbers from 2 to 10 " + number + ":");
        for (int i=2; i <= number; i++) {
            if (1 % 2 == 0) {
                System.out.print(i + " ");
            }
        }
     }
}

import java.util.Scanner;
public class positiveNumbersAdded {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int positiveInteger;

        while (true) {
            System.out.println("Enter a positive number: ");
            number = scanner.nextInt();

            if (positiveInteger < 0) {
                break;
            }

            sum += positiveInteger;
        }

        system.out.println(positiveInteger);
        scanner.close;
    }
}

// method practice

import java.util.Scanner;
public class calcSquare {
    static boolean calculatedSquare(double number) {
        double sqrt=Math.sqrt(square);
        return ((sqrt - Math.floor(sqrt)) == 0);

    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        double goodSquare=sc.nextDouble();
        if (calculatedSquare(square))
        System.out.println("This number is a perfect square.");
        else
        System.out.println("Im sorry, this is not a perfect square.");
    }
}

public class welcome {
    public static void maint(String[] args) {
        printName("Dakota");

        public static void printName(String name) {
            System.out.println("Hello " + name + "!");
        }
    }
}

public class MyReview {
    public static void main(String[] args) {
        System.out.println(reverseDoubleChar("The"));
        System.out.println(reverseDoubleChar2("AABB"));
        System.out.println(reverseDoubleChar3("String"));
    }

    public static String reverseDoubleChar(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result = result + word.charAt(i) + word.charAt(i);
        }
        return result;
    }

    public static String reverseDoubleChar2(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result = result + word.charAt(i) + word.charAt(i);
        }
        return result;
    }

    public static String reverseDoubleChar3(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result = result + word.charAt(i) + word.charAt(i);
        }
        return result;
    }
}

// Array practice

public class testArray{
    public static void main(String[] args) {
        int[] theArray = {5, 10, 15, 20, 25};
        int sum = 0;
        for (int i = 0; i < theArray.length; i++) {
            sum += theArray[i];
        }
        System.out.println("The total sum of this array is " + sum);
    }
}

public class maximumArray {
    int[] bigArray = {2, 4, 6, 8, 10, 12, 14, 16};
    int max = maximumArray[0];
    for (int i = 1; i < maximumArray.length; i++) {
        if (maximumArray[i] > max) {
            max = maximumArray[i];
        }
        
        System.out.println(max);
    }
}

//Object oriented programming practice

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 22),
                new Student("Bob", 18),
                new Student("Charlie", 25),
                new Student("David", 19),
                new Student("Eva", 21),
                new Student("Frank", 23)
        };

        System.out.println("Names of students older than 20:");
        for (Student student : students) {
            if (student.age > 20) {
                System.out.println(student.name);
            }
        }
    }
}

//codingbat 1

public int sumDigits(int n) {
  int sum = 0;
while (n > 0) {
    sum += n % 10;
    n = n / 10;
}
return sum;
}

//codingbat 2

public long factorial(int number) {
  long result = 1;
  
  for (int i = 1; i <= number; i++) {
    result *= i;
  }
  
  return result;
}

//codingbat 3

public boolean isLeapYear(int year) {
  if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)) {
    return true;
  } else {
    return false;
  }
}

//codingbat 4

public int countOccurrences(String text, char target) {
  int count = 0;
    for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) == target) {
            count++;
        }
    }
    return count;
}

//codingbat 5

public int countVowels(String s) {
  int count = 0;
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count++;
        }
    }
    return count;
}


//codingbat 6

public int[] reverseArray(int[] nums) {
  int[] reversed = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        reversed[i] = nums[nums.length - 1 - i];
    }
    return reversed;
}



public class Room {

    int widthOfRoom;
    int lengthOfRoom;
    int heightOfRoom;
    int depthOfRoom;
    int heightOfDoor;
    int numOfDoor;
    int heightOfWindow;
    int numOfWindow;

    // Constructor
    public Room(int roomWidth, int roomLength, int roomHeight, int winHeight, int doorHeight, int numberOfWindows, int numberOfDoors) {
        this.widthOfRoom = roomWidth;
        this.lengthOfRoom = roomLength;
        this.heightOfRoom = roomHeight;
        this.heightOfWindow = winHeight;
        this.numOfWindow = numberOfWindows;
        this.heightOfDoor = doorHeight;
        this.numOfDoor = numberOfDoors;
    }

    // Method to calculate paint needed for the room and doors
    public void calculatePaintNeeded() {
        int totalSurfaceAreaOfRoom = 2 * (widthOfRoom * heightOfRoom) + 2 * (lengthOfRoom * heightOfRoom) - (heightOfDoor * numOfDoor) - (heightOfWindow * numOfWindow);
        int surfaceAreaOfDoors = heightOfDoor * numOfDoor;

        double gallonsNeeded = totalSurfaceAreaOfRoom / 350.0;
        double remainingQuarts = (gallonsNeeded - (int) gallonsNeeded) * 4;

        // Print the results
        System.out.println("Gallons needed for the room: " + (int) gallonsNeeded);
        System.out.println("Quarts needed for the doors: " + remainingQuarts);
    }
