package com.AssignmentDay8;

import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

class KruskalAlgorithm {
    int vertices, edges;
    Edge[] edgeList;

    KruskalAlgorithm(int v, int e) {
        vertices = v;
        edges = e;
        edgeList = new Edge[e];
    }

    
    int find(int[] parent, int i) {
        if (parent[i] == -1) {
            return i;
        }
        return find(parent, parent[i]);
    }


    void union(int[] parent, int x, int y) {
        parent[x] = y;
    }


    void kruskalMST() {
        Arrays.sort(edgeList);
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);

        System.out.println("Edges in the Minimum Spanning Tree:");

        for (Edge edge : edgeList) {
            int x = find(parent, edge.src);
            int y = find(parent, edge.dest);


            if (x != y) {
                System.out.println(edge.src + " -- " + edge.dest + " == " + edge.weight);
                union(parent, x, y);
            }
        }
    }

    public static void main(String[] args) {
        KruskalAlgorithm graph = new KruskalAlgorithm(4, 5);


        graph.edgeList[0] = new Edge(0, 1, 10);
        graph.edgeList[1] = new Edge(0, 2, 6);
        graph.edgeList[2] = new Edge(0, 3, 5);
        graph.edgeList[3] = new Edge(1, 3, 15);
        graph.edgeList[4] = new Edge(2, 3, 4);

        graph.kruskalMST();
    }
}