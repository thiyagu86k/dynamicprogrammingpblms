/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thiyagaraja
 */
public class Graph {
    private int numVerticies;
    private List<List<Integer>> adjList;
    
    public Graph(int numVerticies){
        this.numVerticies=numVerticies;
        adjList=new ArrayList<>(numVerticies);
        for(int i=0;i<numVerticies;i++){
            adjList.add(new ArrayList<>());
            
        }
    }
    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source); // Uncomment for an undirected graph
    }

    public void printGraph() {
        for (int i = 0; i < numVerticies; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int numVertices = 5;
        Graph graph = new Graph(numVertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
    
    
}
