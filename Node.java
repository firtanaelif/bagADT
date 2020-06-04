/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataproject;

/**
 * 
 * Elif Fırtana
 * 170315023
 * 
 * @author HP
 * @param <T>
 */
public class Node<T>
{
    private T data;
    private int count;
    private Node<T> left;
    private Node<T> right;

    public Node(T d)
    {
        this.data=d;
        this.count=1;
        this.right=null;
        this.left=null;
    }

    public T getData()

    {
        return data;
    }

    public Node<T> getRight() {
        return right;
    }

    public int getCount() {
        return count;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public void incrementCount()
    {
        count++;
    }

    public void decreaseCount()
    {
        count--;
    }
    public boolean hasLeft()
    {
        return (left != null);
    }

    public boolean hasRight()
    {
        return (right != null);
    }
}
