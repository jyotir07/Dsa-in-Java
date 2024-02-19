// Author: jyotir07
import java.util.Scanner;
class Arrays {
  public static void main(String[] args) {
    int array_01[] = { 1, 2, 3, 4, 5, 6, 7 };
    // printing second element from the array
    System.out.println("Array's element at index 1 is: " + array_01[1]);

    // printing the whole array
    System.out.print("Elements in the array are:");
    for (int i = 0; i < array_01.length; i++) {
      System.out.print(" " + array_01[i]);
    }
    System.out.println();

    // using .length function
    System.out.println("Length of the array is: " + array_01.length);

    // creating another array
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the array: ");

    int size = sc.nextInt();
    int anotherArray[] = new int[size];
    // printing the array
    for (int i = 0; i < size; i++) {
      System.out.println(" " + anotherArray[i]); // by default all the elements in the array are zero this is because of
                                                 // the default valuse of int datatype
    }
    // taking input for the elements of the array
    for (int i = 0; i < size; i++) {
      System.out.println("Enter element " + i + ":");
      anotherArray[i] = sc.nextInt();
    }
    // printing the new array
    System.out.println("Elements are: ");
    for (int i = 0; i < anotherArray.length; i++) { // size or anotherArray.lemgth both can be used here
      System.out.print(" " + anotherArray[i]);
    }
  }
}
