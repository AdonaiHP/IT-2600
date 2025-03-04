public class Main {
  public static void main(String[] args) {

    //Assign a value to bestCase to represent a best-case scenario with the given value of text. Note: this is not the true worst-case scenario because we could have much longer values for text, but it could represent a case scenario for an application if this always the value of text.//

    String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    String bestCase = "A";
    
    //! * Initialize startTime here
        long startTime = System.nanoTime();
    int index = match(text, bestCase);
    //! * Initialize endTime here
        long endTime = System.nanoTime();
    //! * Calculate elapsedTime here
        long elapsedTime1 = endTime - startTime;
    System.out.println("Elapsed Time for the best-case input is " + elapsedTime1 + " nanoseconds");   


    
    if (index >= 0)
      System.out.println("    best-case input matched at index " + index);
    else
      System.out.println("    best-case input unmatched");   

    String worstCase = "9";
    
    // * Initialize startTime here
    startTime = System.nanoTime();
        index = match(text, worstCase);
    // * Initialize endTime here
    endTime   = System.nanoTime();
    // * Calculate elapsedTime here
    long elapsedTime2 = endTime - startTime;
    System.out.println("Elapsed Time for worst case scenario is " + elapsedTime2 + " nanoseconds");   

    
    if (index >= 0)
      System.out.println("    worst-case input matched at index " + index);
    else
      System.out.println("    worst-case input unmatched");  
  }

  // Return the index of the first match. -1 otherwise.
  public static int match(String text, String pattern) {
    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
      if (isMatched(i, text, pattern))
        return i;
    }

    return -1;
  }
	
  // Test if pattern matches text starting at index i
  private static boolean isMatched(int i, String text, 
      String pattern) {
    for (int k = 0; k < pattern.length(); k++) {
      if (pattern.charAt(k) != text.charAt(i + k)) {
        return false;
      }
    }
    
    return true;
  }
}