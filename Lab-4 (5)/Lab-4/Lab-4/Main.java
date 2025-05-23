import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      System.out.println("\n\nBubble sort results ----------------------------------------------");
          // Initialize startTime here
          long BS_startTime = System.nanoTime();
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      Lab4.outputList(bubbleSortedList);
          // Initialize endTime here
          long BS_endTime = System.nanoTime();
          // Calculate elapsedTime here
          long BS_elapsedTime1 = BS_endTime - BS_startTime;

      System.out.println("\n\nInsertion sort results -------------------------------------------");
          // Initialize startTime here
          long IS_startTime = System.nanoTime();
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);  
      Lab4.outputList(insertionSortedList);
          // Initialize endTime here
          long IS_endTime = System.nanoTime();
          // Calculate elapsedTime here
          long IS_elapsedTime2 = IS_endTime - IS_startTime;

      System.out.println("\n\nElapsed Time Comparison -------------------------------------------");
      System.out.println(" ");
      System.out.println("Bubble-Sort Elapsed Time: " + BS_elapsedTime1 + " nanoseconds");   
      System.out.println(" ");
      System.out.println("Insertion-Sort Elapsed Time: " + IS_elapsedTime2 + " nanoseconds");   

}
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here

    for (int i = 1; i < integerList.size(); i++) {
      int currentElement = integerList.get(i);
      int k;
        for (k = i - 1; k >= 0 && integerList.get(k) > currentElement; k--) {
          integerList.set(k + 1, integerList.get(k));
        }
      integerList.set(k + 1, currentElement);
    }
  return integerList;
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here
    boolean needNextPass = true;

    for (int k = 1; k < integerList.size() && needNextPass; k++) {
      // Array may be sorted and next pass not needed
      needNextPass = false;
      for (int i = 0; i < integerList.size() - k; i++) {
        if (integerList.get(i) > integerList.get(i + 1)) {
          // Swap elements
          int temp = integerList.get(i);
          integerList.set(i, integerList.get(i + 1));
          integerList.set(i + 1, temp);

          needNextPass = true; 
        }
      }
    }
    
    return integerList;
  }


  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
}
