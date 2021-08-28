package graph;

import java.util.*;

public class Graph {
    private final Map<Vertex, List<Vertex>> adjVertices = new HashMap();

    public Graph() {
    }

    public void addVertex(String data) {
        Vertex vertex = new Vertex(data);
        this.adjVertices.putIfAbsent(vertex, new ArrayList());
    }

    public void addEdge(String data1, String data2) {
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);
        ((List)this.adjVertices.get(vertex1)).add(vertex2);
        ((List)this.adjVertices.get(vertex2)).add(vertex1);
    }

    public void removeVertex(String data) {
        Vertex vertex = new Vertex(data);
        this.adjVertices.values().forEach((list) -> {
            list.remove(vertex);
        });
        this.adjVertices.remove(vertex);
    }

    public void removeEdge(String data1, String data2) {
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);
        List edgeVertex1 = (List)this.adjVertices.get(vertex1);
        List<Vertex> edgeVertex2 = (List)this.adjVertices.get(vertex2);
        if (edgeVertex1 != null) {
            edgeVertex1.remove(vertex2);
        }

        if (edgeVertex2 != null) {
            edgeVertex2.remove(vertex1);
        }

    }

    public String printGraph() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator var2 = this.adjVertices.keySet().iterator();

        while(var2.hasNext()) {
            Vertex vertex = (Vertex)var2.next();
            stringBuilder.append(vertex);
            stringBuilder.append(this.adjVertices.get(vertex));
        }

        return stringBuilder.toString();
    }

    int size() {
        return this.adjVertices.size();
    }


    // Code Challenge: Class 36 ---graph-breadth-first--
    Set<String> bft(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet();
        Queue<String> queue = new LinkedList();
        queue.add(root);
        visited.add(root);

        while(!queue.isEmpty()) {
            String vertex = (String)queue.poll();
            Iterator var6 = graph.getAdjvertices(vertex).iterator();

            while(var6.hasNext()) {
                Vertex v = (Vertex)var6.next();
                if (!visited.contains(v.data)) {
                    visited.add(v.data);
                    queue.add(v.data);
                }
            }
        }

        return visited;
    }

    // Code Challenge: Class 38 ---graph-depth-first--


    Set<String> dft(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet();
        Stack<String> stack = new Stack();
        stack.push(root);

        while(true) {
            String vertex;
            do {
                if (stack.isEmpty()) {
                    return visited;
                }

                vertex = (String)stack.pop();
            } while(visited.contains(vertex));

            visited.add(vertex);
            Iterator var6 = graph.getAdjvertices(vertex).iterator();

            while(var6.hasNext()) {
                Vertex v = (Vertex)var6.next();
                stack.push(v.data);
            }
        }
    }

    // code challenge 39
    boolean isExist(Vertex A, Vertex B, Graph graph){

        Set<String> visited = new LinkedHashSet();
        Queue<String> queue = new LinkedList();
        queue.add(A.data);
        visited.add(A.data);

        while(!queue.isEmpty()  ) {
            String vertex = (String)queue.poll();
            Iterator var6 = graph.getAdjvertices(vertex).iterator();

            while(var6.hasNext()) {
                Vertex v = (Vertex)var6.next();
                if (!visited.contains(v.data)) {
                    visited.add(v.data);
                    queue.add(v.data);
                }
                if (visited.contains(B.data)){
                    return true;
                }
            }
        }

        return false;

    }


    private List<Vertex> getAdjvertices(String data) {
        return (List)this.adjVertices.get(new Vertex(data));
    }


 }