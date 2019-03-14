/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoproject;

/**
 *
 * @author Moiz
 */
public class Queue <T> {
    T queue[];
    int front=0;
    int back=0;
    int size;
    int capacity;
    Queue(int c)
    {
        capacity=c;
        size=0;
        queue=(T[]) new Object[capacity+100];
    }
    public void enqueue(T val)
    {
        queue[back]=val;
        back++;
        size++;
    }
    public T dequeue(){
        front++;
        size--;
        return queue[front-1];
    }
    public boolean isEmpty()
    {
        if (size==0)
            return true;
        else
            return false;
    }
}
