package graph;

import java.util.Objects;

public class Vertex {
    String data;

    public Vertex(String data) {
        this.data = data;
    }

    public String toString() {
        return "Vertex{label='" + this.data + "'}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof Vertex) {
            Vertex vertex = (Vertex)o;
            return this.data.equals(vertex.data);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.data});
    }
}
