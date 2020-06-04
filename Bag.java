/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 * Elif Fırtana
 * 170315023
 * 
 */
package dataproject;

public class Bag<T extends Comparable<T>> {

    public Node<T> root;

    public Bag() {

        root=null;
    }
    
    
    public Bag(Node newNode)
    {
        root=newNode;
    }

    public  void add(T data)
    {

        if (isEmpty()) {
            Node<T> newNode = new Node<T>(data);
            root = newNode;

        }

        else{
            Node<T> current=root;
            while (true)
            {
                if (data.compareTo(current.getData()) <0 )
                {
                    if (current.getLeft()!=null)
                    {
                        current=current.getLeft();
                    }
                    else
                    {
                        Node<T> newNode=new Node<T>(data);
                        current.setLeft(newNode);
                        break;
                    }
                }
                    else if(data.compareTo(current.getData()) >0)
                {
                    if (current.getRight()!=null)
                    {
                        current=current.getRight();
                    }
                    else
                    {
                        Node<T> newNode=new Node<T>(data);
                        current.setRight(newNode);
                        break;
                    }
                }
                else if(data.compareTo(current.getData()) ==0)
                {

                    current.incrementCount();
                    break;
                }
            }
        }
    }

    public boolean isEqual(Node<T> root1, Node<T> root2) {
        boolean rootEqual = false;
        boolean lEqual = false;
        boolean rEqual = false;    

        if (root1 != null && root2 != null) {
            rootEqual = root1.getData().equals(root2.getData());

            if (root1.getLeft()!=null && root2.getLeft() != null) {
                // compare the left
                lEqual = isEqual(root1.getLeft(), root2.getLeft());
            }
            else if (root1.getLeft() == null && root2.getLeft() == null) {
                lEqual = true;
            }
            if (root1.getRight() != null && root2.getRight() != null) {
                // compare the right
                rEqual = isEqual(root1.getRight(), root2.getRight());
            }
            else if (root1.getRight() == null && root2.getRight() == null) {
                rEqual = true;
            }

            return (rootEqual && lEqual && rEqual);
        }
        return false;
    } 

    public boolean remove(T data) {
        if (!contains(data)) {
            System.out.println("The item '" + data + "' is not located in the Bag");
            return false;
        }
        else {
            Node<T> temp = remove(root, data);
            return contains(temp.getData());
        }
    }
    private Node<T> remove(Node<T> root,T data) {


        Node<T> current = root;
        if (current == null) {
            return current;
        }
        if (data.compareTo(current.getData()) < 0) {
             current.setLeft(remove(current.getLeft(), data));
        }
        else if (data.compareTo(current.getData()) > 0) {
            current.setRight( remove(current.getRight(), data));
        }
        else {
            if (current.getCount() > 1) {
                current.decreaseCount();
                return current;
            }
            else {
                if (current.getLeft() != null && current.getRight() != null ) {
                    Node<T> MinFromRightSubTree=(Node<T>) findMinFromRight(current.getRight());
                    current.setData(MinFromRightSubTree.getData());
                    remove(current.getRight(),MinFromRightSubTree.getData());
                }
                else if (current.getLeft() != null ) {
                    current=current.getLeft();
                }
                  else if (current.getRight() != null ) {
                       current=current.getRight();
                 }
                 else
                {
                    current=null;
                }
            }
        }
        return current;
    }

    private Node<T> findMinFromRight(Node<T> node) {
        while(node.getLeft() !=null)
        {
            node=node.getLeft();
        }
        return node;
    }
    
    public boolean contains(T data)
    {
        Node<T> current=root;
        boolean found=true;
        while (found) {
            if (data.compareTo(current.getData()) < 0) {
                if (current.getLeft() != null) {
                    current = current.getLeft();
                }
                else break;


            }  if (data.compareTo(current.getData()) > 0) {
                if (current.getRight() != null) {
                    current = current.getRight();
                }
                else break;

            }  if (data.compareTo(current.getData()) == 0) {

               found=false;
            }
        }
        return !found;
    }


    public boolean isEmpty()
    {
        if (root == null)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public void clear()
    {
        root=null;
    }

    public int distictSize() {
        return (distictSize(root));
    }

    private int distictSize(Node<T> node)
    {
        if (node==null) {
            return(0);
        }
        else {
        return (distictSize(node.getLeft()) + 1 + distictSize(node.getRight()));
        }
    }

    public int elementSize(T data) {
        Node<T> current = root;

        int elementsize = 0;
        if (!contains(data)) {
            System.out.println(data+" is not found in the Bag.");
             return 0;
        }
           else {
            while (1==1) {
                if (data.compareTo(current.getData()) < 0) {
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    }
                } else if (data.compareTo(current.getData()) > 0) {
                    if (current.getRight() != null) {
                        current = current.getRight();
                    }
                } else if (data.compareTo(current.getData()) == 0) {
                     elementsize = current.getCount();
                    break;
                }
            }
            return elementsize;
        }
    }

    public int size()
    {
        return size(root);
    }

    private int size(Node<T> node) {
        int size=0;
        if (node==null) {
            return(0);
        }
        else {
        return node.getCount()+ size(node.getLeft()) + size(node.getRight());
        }
    }


    public static void printInorder(Bag bag)
    {
        if (bag.root == null)
            return;
        else{
            if(bag.root.hasLeft())
                printInorder(new Bag(bag.root.getLeft()));

                System.out.print(bag.root.getData()+" : "+bag.root.getCount()+"  ");

            if(bag.root.hasRight())
                printInorder(new Bag(bag.root.getRight()));
        }
        
    }
    
    @Override
    public String toString()
    {
       return toString(root);
    }

    private String toString(Node<T> root) {
        if(isEmpty())
        {
            return "Our Bag is empty";
        }
       else {
            Node<T> current = root;
            String result = "";
            if (current == null) {
                return "";
            }
            result += toString(current.getLeft());
            result += "{" + current.getData().toString() + " : " + current.getCount() + "}";
            result += toString(current.getRight());

            return result;

        }
    }
}