class Main {
  public static void main(String[] args) {
    String[] vertices = {
      "Business & Technology",
      "Theatre",
      "Liberal Arts",
      "Student Services",
      "Health Careers & Sciences",
      "Health Technologies Center",
      "Recreation Center",
      "Technology Learning Center"
    };

    int[][] edges = {
    {0, 1}, {0, 3}, {0, 4},
    {1, 2},
    {2, 3}, {2, 4},
    {3, 5}, {3, 6},
    {4, 5}, {4, 6},
    {5, 6},
    {6, 7}
    };

    Graph<String> graph = new UnweightedGraph<>(vertices, edges);
    // Get a dfs starting at the Business and Technology Building. Change this is you called it something different in your vertices!

    UnweightedGraph<String>.SearchTree dfs = graph.dfs(graph.getIndex("Business & Technology")); 

    java.util.List<Integer> searchOrders = dfs.getSearchOrder();
    System.out.println(dfs.getNumberOfVerticesFound() + " vertices are searched in this DFS order:");
    for (int i = 0; i < searchOrders.size(); i++)
      System.out.print(graph.getVertex(searchOrders.get(i)) + ", ");
    System.out.println();

    for (int i = 0; i < searchOrders.size(); i++)
      if (dfs.getParent(i) != -1)
        System.out.println("parent of " + graph.getVertex(i) +
          " is " + graph.getVertex(dfs.getParent(i)));
    System.out.println();
    System.out.println();

  dfs.printPath(graph.getIndex("Health Technologies Center"));
    System.out.println();
    System.out.println();
dfs.printPath(graph.getIndex("Student Services"));
    System.out.println();
    System.out.println();
dfs.printPath(graph.getIndex("Recreation Center"));
    System.out.println();
    System.out.println();
dfs.printTree();
  }
}