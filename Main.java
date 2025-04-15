class Main {
  public static void main(String[] args) {

    MyHashMap<String, Integer> creditHours = new MyHashMap<String, Integer>();
    // Adding course credit hours
    creditHours.put("IT-1025", 3);
    creditHours.put("IT-1050", 3);
    creditHours.put("IT-1150", 3);
    creditHours.put("IT-2310", 3);
    creditHours.put("IT-2320", 4);
    creditHours.put("IT-2351", 4);
    creditHours.put("IT-2650", 4);
    creditHours.put("IT-2660", 4);
    creditHours.put("IT-2030", 4);
    // Check for specific values
    System.out.println("Contains IT-1025: " + creditHours.containsKey("IT-1025"));
    System.out.println("Contains IT-2110: " + creditHours.containsKey("IT-2110"));
    // Print all values
    System.out.println("\nAll values in the map:");
    System.out.println(creditHours.toString());
    // Remove specified entries
    creditHours.remove("IT-2030");
    creditHours.remove("IT-1150");
    // Print all values after removal
    System.out.println("\nValues after removal:");
    System.out.println(creditHours.toString());
    }
    }


