import java.util.*;

public class Bfs {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();

        graph.put("A", List.of("B", "C"));
        graph.put("B", List.of("A", "D"));
        graph.put("C", List.of("A", "G", "H", "I"));
        graph.put("D", List.of("B", "E", "F"));
        graph.put("E", List.of("D"));
        graph.put("F", List.of("D"));
        graph.put("G", List.of("C"));
        graph.put("H", List.of("C"));
        graph.put("I", List.of("C", "J"));
        graph.put("J", List.of("I"));

        System.out.println("BFS = " + bfs(graph, "A"));
        System.out.println("DFS = " + dfs(graph, "A"));
    }

    private static List<String> dfs(Map<String, List<String>> graph, String startNode) {
        List<String> visited = new ArrayList<>();
        Stack<String> needVisit = new Stack<>();

        needVisit.add(startNode);

        while (!needVisit.isEmpty()) {
            String node = needVisit.pop();

            if (!visited.contains(node)) {
                visited.add(node);
                List<String> strings = graph.get(node);
                needVisit.addAll(strings);
            }
        }

        return visited;
    }

    private static List<String> bfs(Map<String, List<String>> graph, String startNode) {
        List<String> visited = new ArrayList<>();
        Queue<String> needVisit = new LinkedList<>();

        needVisit.add(startNode);

        while (!needVisit.isEmpty()) {
            String node = needVisit.poll();

            if (!visited.contains(node)) {
                visited.add(node);
                List<String> strings = graph.get(node);
                needVisit.addAll(strings);
            }
        }

        return visited;
    }
}
