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
 */
public class Test {

    public static void main(String[] args) {

        Bag theBag=new Bag();
        System.out.println(theBag);
        System.out.println("---------------------");

        /* Adding */
        theBag.add(9);
        theBag.add(8);
        theBag.add(7);
        theBag.add(7);
        theBag.add(8);
        theBag.add(9);
        theBag.add(1);
        theBag.add(6);
        theBag.add(5);
        theBag.add(3);
        
        Bag theBag2=new Bag();
        System.out.println(theBag2);
        System.out.println("---------------------");

        /* Adding */
        theBag2.add(9);
        theBag2.add(8);
        theBag2.add(7);
        theBag2.add(7);
        theBag2.add(8);
        theBag2.add(9);
        theBag2.add(1);
        theBag2.add(6);
        theBag2.add(5);
        theBag2.add(3);
        
        Bag theBag3=new Bag();
        System.out.println(theBag3);
        System.out.println("---------------------");

        /* Adding */
        theBag3.add(1);
        theBag3.add(2);
        theBag3.add(3);
        theBag3.add(4);
        theBag3.add(4);
        theBag3.add(5);
        theBag3.add(6);
        theBag3.add(6);
        theBag3.add(5);
        theBag3.add(3);
        
        System.out.println("We 9 8 7 7 8 9 1 6 5 3 are added to Bag 1");
        System.out.print("BAG 1 = ");
        System.out.println(theBag);
        
        System.out.println("---------------------");

        System.out.println("We 9 8 7 7 8 9 1 6 5 3 are added to Bag 2");
        System.out.print("BAG 2 = ");
        System.out.println(theBag2);
        
        System.out.println("---------------------");

        System.out.println("We 1 2 3 4 5 5 6 6 5 3 are added to Bag 3");
        System.out.print("BAG 3 = ");
        System.out.println(theBag3);
        
        System.out.println("---------------------");
        
        System.out.print("BAG 1 INORDER TRAVERSAL =  ");
        Bag.printInorder(theBag);
        System.out.println();
        
        System.out.println("---------------------");
        
        System.out.print("BAG 2 INORDER TRAVERSAL =  ");
        Bag.printInorder(theBag2);
        System.out.println();
        System.out.println("---------------------");
        
        System.out.print("BAG 3 INORDER TRAVERSAL =  ");
        Bag.printInorder(theBag3);
        System.out.println();
        
        System.out.println("---------------------");
        
        System.out.println("Is First Bag and Second Bag Are Equals: "+theBag.isEqual(theBag.root, theBag2.root));
        System.out.println("Is First Bag and Third Bag Are Equals: "+theBag.isEqual(theBag.root, theBag3.root));
        System.out.println("Is Second Bag and Third Bag Are Equals: "+theBag.isEqual(theBag2.root, theBag3.root));
        
        System.out.println("---------------------");

        boolean isHere=theBag.contains(10);
        System.out.println("contains '10' : "+isHere);
        isHere=theBag.contains(8);
        System.out.println("contains '8' : "+isHere);
        
        System.out.println("---------------------");

        int distictsize1=theBag.distictSize();
        System.out.println("distictSize : "+distictsize1);
       
        System.out.println("---------------------");

        int elementsize1=theBag.elementSize(9);
        System.out.println("elementSize of '9': "+elementsize1);
        System.out.println("---------------------");
        int elementsize2=theBag.elementSize(10);
        System.out.println("elementSize of '10': "+elementsize2);
       
        System.out.println("---------------------");

        int size1=theBag.size();
        System.out.println("size of Bag : "+size1);
        
        System.out.println("---------------------");
        
        theBag.remove(3);
        theBag.remove(8);
        theBag.remove(6);
        theBag.remove(9);

        System.out.println("'3','8','6','9' are removed from Bag");
        System.out.print("NEW BAG = ");
        System.out.println(theBag);
        
        System.out.println("---------------------");

        System.out.println("Tried to remove '15' from Bag,although it is not in the Bag");
        theBag.remove(15);
        
        System.out.println("---------------------");
        
        System.out.println("Before clear function");
        boolean isClear = theBag.isEmpty();
        System.out.println("isEmpty : "+isClear);
        
        System.out.println("---------------------");
        
        theBag.clear();
        System.out.println("After clear function");
        isClear=theBag.isEmpty();
        System.out.println("isEmpty : "+isClear);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Bag myBag1 = new Bag();
        System.out.println(myBag1);
        System.out.println("---------------------");

        myBag1.add("to");
        myBag1.add("to");
        myBag1.add("be");
        myBag1.add("not");
        myBag1.add("or");
        myBag1.add("not");
        myBag1.add("or");
        myBag1.add("be");
        
        Bag myBag2 = new Bag();
        System.out.println(myBag2);
        System.out.println("---------------------");

        myBag2.add("to");
        myBag2.add("to");
        myBag2.add("be");
        myBag2.add("not");
        myBag2.add("or");
        myBag2.add("not");
        myBag2.add("or");
        myBag2.add("be");
        
        Bag myBag3 = new Bag();
        System.out.println(myBag3);
        System.out.println("---------------------");

        myBag3.add("to");
        myBag3.add("and");
        myBag3.add("for");
        myBag3.add("not");
        myBag3.add("or");
        myBag3.add("not");
        myBag3.add("or");
        myBag3.add("is");


        System.out.println("to to be not or not or be are added to Bag ");
        System.out.print("BAG 1 = ");
        System.out.println(myBag1);
        System.out.println("---------------------");
        
        System.out.println("to to be not or not or be are added to Bag ");
        System.out.print("BAG 2 = ");
        System.out.println(myBag2);
        System.out.println("---------------------");
        
        System.out.println("to to be not or not or be are added to Bag ");
        System.out.print("BAG 3 = ");
        System.out.println(myBag3);
        System.out.println("---------------------");
        
        System.out.print("BAG 1 INORDER TRAVERSAL =  ");
        Bag.printInorder(myBag1);
        System.out.println();
        System.out.println("---------------------");
        
        System.out.print("BAG 2 INORDER TRAVERSAL =  ");
        Bag.printInorder(myBag2);
        System.out.println();
        
        System.out.println("---------------------");
        
        System.out.print("BAG 3 INORDER TRAVERSAL =  ");
        Bag.printInorder(myBag3);
        System.out.println();
        
        System.out.println("---------------------");
        
        System.out.println("Is First Bag and Second Bag Are Equals: "+theBag.isEqual(myBag1.root, myBag2.root));
        System.out.println("Is First Bag and Third Bag Are Equals: "+theBag.isEqual(myBag1.root, myBag3.root));
        System.out.println("Is Second Bag and Third Bag Are Equals: "+theBag.isEqual(myBag2.root, myBag3.root));
        
        System.out.println("---------------------");

        boolean isThere=myBag1.contains("to");
        System.out.println("contains 'to' : "+isThere);
        isThere=myBag1.contains("and");
        System.out.println("contains 'and' : "+isThere);
        System.out.println("---------------------");

        int distictsize=myBag1.distictSize();
        System.out.println("distictSize : "+distictsize);
        System.out.println("---------------------");

        int elementsize=myBag1.elementSize("or");
        System.out.println("elementSize of 'or' : "+elementsize);
        System.out.println("---------------------");

        int size=myBag1.size();
        System.out.println("size of Bag : "+size);
        System.out.println("---------------------");

        myBag1.remove("or");
        myBag1.remove("to");
        myBag1.remove("be");
        myBag1.remove("not");
        System.out.println("or to be not removed from Bag");
        System.out.print("BAG = ");
        System.out.println(myBag1);
       
        System.out.println("---------------------");

        System.out.println("Tried to remove 'and' from Bag,although it is not in the Bag");
        myBag1.remove("and");
        
        System.out.println("---------------------");
        
        System.out.println("Before clear function");
        boolean isEmpty=myBag1.isEmpty();
        System.out.println("isEmpty : "+isEmpty);
        
        System.out.println("---------------------");

        myBag1.clear();
        System.out.println("After clear function");
        isEmpty=myBag1.isEmpty();
        System.out.println("isEmpty : "+isEmpty);

    }
}
