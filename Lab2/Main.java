import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Iterator;

// Lab 2 - Lists, Stacks, and Queues
// Your Name: Adonai Hawkins-Prather 
// Notes: The instructions are found in comments through the code starting with "Step n"
//        Please leave the comments and add your code just after the comment.
//        Use the examples in the book to complete the lab.

class Main {
  public static void main(String[] args) {
    Lab2 lab = new Lab2();
    // Comment/Uncomment the following 3 method calls as you work on each method.
    // No code should be added to the main method. All of your code will go into the methods in Lab2.
    lab.linkedList();
    lab.queue();
    lab.stack();
  }
}

class Lab2 {
  public void linkedList() {
        System.out.println("    PART ONE: Iterator Changes ");
        System.out.println("-----------------------------------");
  // 1. Create a LinkedList<String> object called progLanguages
    LinkedList<String> progLanguages = new LinkedList<String>();

  // 2. Add elements to progLanguages: "Java", "Python", "JavaScript", "C++"
    progLanguages.add("Java");
    progLanguages.add("Python");
    progLanguages.add("JavaScript");
    progLanguages.add("C++");

  // 3. Remove the element "C++" from the list using .remove()
    progLanguages.remove("C++");
        progLanguages.forEach(e -> System.out.print(e.toUpperCase() + " "));
      System.out.println();

  // 4. Add an element "HTML" at index 2.
    progLanguages.add(2, "HTML");

  // 5. Iterate over progLanguages and use println() to output each element. You must create an Iterator<string> and use hasNext(), and next() similar to the example in our book.
  Iterator<String> iterator = progLanguages.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next().toUpperCase() + " ");
    }
      System.out.println(); 
  }
    
  public void queue() {
      System.out.println(" ");
      System.out.println("    PART TWO: Queue Changes ");
      System.out.println("-----------------------------------");
  // 6. Create a Queue<String> called q
    Queue<String> q = new LinkedList<String>();
  // 7. Add 5 first names to q.
    q.add("Adonai");
    q.add("Amus");
    q.add("Abigale");
    q.add("Adrian");
    q.add("Arnold");
  // 8. Uncomment the following line
    System.out.println("Elements of queue: " + q);
  // 9. Remove the head of the queue and assign it to a String variable removedElement.
  //    Display the value of "Removed element: " + removedElement
    String removedElement = q.remove();
    System.out.println("Removed element: " + removedElement);

  // 10. View the head of the queue using peek(). Output it's value.
    System.out.println("Head of queue: " + q.peek());

  // 11. Using for(String element : q), output all of the values in the queue
    for(String element : q) {
        System.out.print(element + " ");
    }
    System.out.println();

  System.out.println(" ");
  }

public void stack() {
      System.out.println("    PART THREE: bookStack Changes ");
      System.out.println("-----------------------------------");
  // 12. Create a Stack<String> called bookStack
    Stack<String> bookStack = new Stack<String>();
  
  // 13. Push the following book titles onto bookStack: "Clean Code", "Design Patterns", "Pragmatic Programmer"
    bookStack.push("Clean Code");
    bookStack.push("Design Patterns");
    bookStack.push("Pragmatic Programmer");

  // 14. pop() 1 book off the stack. Display it's value
    String removedBook = bookStack.pop();
    System.out.println("Removed book: " + removedBook);
  
  // 15. Use the peek() method to view the top book on the stack
    System.out.println("Top book after pop: " + bookStack.peek());
  
  // 16. push() "Web DB Technologies" onto the stack
    bookStack.push("Web DB Technologies");

  // 17. Use the peek() method to view the top book on the stack
    System.out.println("Top book after pop: " + bookStack.peek());

    // 18. Search for "Design Patterns" in the stack. Display the results of the search.
    System.out.println("Does stack contain Design Patterns? " + bookStack.search("Design Patterns"));
  // 19. Call empty(). Output the results
    System.out.println("Is stack empty? " + bookStack.empty());

  // 20. Print the titles of all of the books on the stack
    System.out.println("All books on stack: " + bookStack);
    
  }
}
