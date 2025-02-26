//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: 
 */

public class Main {
  public static void main(String[] args) {
    // Created an array of numbers, then used constructor to store it in a class.
    int[] arr = { 5, 9, 3, 12, 7, 3, 11, 5 }; 
    Lab1 ArrayList = new Lab1(arr);
    int i = 0;

    System.out.print("List in Original Order: ");
      while (i < ArrayList.nums().length) {
System.out.print(ArrayList.nums()[i] + " ");
i++;
      }

    System.out.println(" ");
    System.out.println(" ");
    System.out.print("List in Reverse Order: ");
      for (int j = ArrayList.nums().length - 1; j >= 0; j--) {
System.out.print(ArrayList.nums()[j] + " ");
      }

    System.out.println(" ");
    System.out.println(" ");
    System.out.println("The first listed number is " + arr[0] + " as the last number is " + arr[7] + "." );

    System.out.println(" ");
    System.out.println("Between " + ArrayList.nums()[2] + " and " + ArrayList.nums()[6] + ", the biggest No. is " + ArrayList.max(2, 6) + " and the smallest is " + ArrayList.min(2, 6) + ".");

    System.out.println(" ");
    System.out.println("All numbers add up to " + ArrayList.sum() + " with an average of " + ArrayList.avg() + ".");

    System.out.println(" ");
    System.out.println("Within the list, it's greatest number is " + ArrayList.max_all() + " and smallest is " + ArrayList.min_all() + ".");

  }
}     
public class Test {
  public static void main(String[] args) {
    int[] x = new int[3];
    System.out.println("x[0] is " + x[0]);
  }
}


// Add all of the methods here
class Lab1 {
  private final int[] nums;

  public Lab1(int[] nums) {
    this.nums = nums;
  }
  public int increment(int num) {    
    return ++num;
  }

  public int[] nums() {
    return this.nums;
  }



  public int sum() {
    int sum_answer = 0;
    for (int i = 0; i < nums.length; i++) {
      sum_answer += nums[i];
    }
    return sum_answer;
  }


  public int max(int a, int b) {
    int    max_answer = 0;
    if      (nums[a] > nums[b]) {max_answer = nums[a];}
    else if (nums[a] < nums[b]) {max_answer = nums[b];} // Change condition to check for other comparison
    return max_answer;
  }

  public int min(int a, int b) {
    int    min_answer = 0;
    if      (nums[a] > nums[b]) {min_answer = nums[b];}
    else if (nums[a] > nums[b]) {min_answer = nums[a];} // Change condition to check for other comparison
    return min_answer;
  }

  public int avg() {
    int avg_answer = 0;
    for (int i = 0; i < nums.length; i++) {
      avg_answer += nums[i];
    }
    avg_answer = avg_answer / nums.length;
    return avg_answer;
  }

  public int max_all() {
    int max_all_answer = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      if(nums[i] < nums[i+1]) {max_all_answer = nums[i+1];}
    }
    return max_all_answer;
  }

  public int min_all() {
    int min_all_answer = 100; // I had to jerryrig this one //
    for (int i = 1; i < nums.length - 1; i++) {
      if (nums[i] < min_all_answer) {min_all_answer = nums[i];}
    }
    return min_all_answer;
  }
}

//  Tasks: In Lab 1 (attached), add the following methods to the already created Lab1 class:
  //!!    max(int a, int b): Use an if-statement to return the maximum value.
  //!!    min(int a, int b): Use an if-statement to return the minimum value.
  //!!    sum(int[] nums): Return the sum of all values in the array.
  //!!    average(int[] nums): Use a foreach loop to return the average.
  //!!    max(int[] nums): Use a for loop to return the maximum value.
  //!!    min(int[] nums): Use a for loop to return the minimum value.
// In the main() method:
  //!     Create an array with values {5, 9, 3, 12, 7, 3, 11, 5}.
  //!     Output the array in order using a while loop.
  //!     Output the array in reverse using a for loop.
  //!     Output the first and last values of the array.
  //!     Call the methods created in Lab1.

