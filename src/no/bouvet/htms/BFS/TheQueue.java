package no.bouvet.htms.BFS;

import java.util.Arrays;

public class TheQueue {

    private String[] queueArray;
    private int queueSize;
    private int front, rear, numberOfItems = 0;

    TheQueue(int size){
        queueSize = size;
        queueArray = new String[size];
        Arrays.fill(queueArray, "-1");
    }

    public void insert(String input){
        if (numberOfItems + 1 <= queueSize){
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
            System.out.println("INSERT " + input + " was added to the Queue\n");
        }
        else {
            System.out.println("Sorry but the Queue is full");
        }
    }

    public void remove(){
        if (numberOfItems > 0){
            System.out.println("REMOVE " + queueArray[front] + " was removed");
            queueArray[front] = "-1";
            front++;
            numberOfItems--;
        }
        else {
            System.out.println("Sorry but the queue is empty");
        }
    }
    public void peek(){
        System.out.println("The first element is " + queueArray[front]);
    }


}
