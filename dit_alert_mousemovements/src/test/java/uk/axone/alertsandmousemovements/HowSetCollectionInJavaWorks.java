package uk.axone.alertsandmousemovements;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class HowSetCollectionInJavaWorks {

    @Test
    public void test1(){
        Set<String> set1 = new LinkedHashSet<String>();
        set1.add("apple");
        set1.add("banana");

        System.out.println(set1.size());

        Iterator<String> it = set1.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    @Test
    public void testSetCollection(){
        //1. How to create a set collection object
        Set<String> fruitSet = new LinkedHashSet<String>();

        //2. How to add elements to a set
        fruitSet.add("Apple");
        fruitSet.add("Pears");
        fruitSet.add("Orange");
        fruitSet.add("Strawberry");
        fruitSet.add("Strawberry");
        fruitSet.add("Strawberry");

        //3. how to fetch the size
        System.out.println("Collection size : "+fruitSet.size());

        //4. How to iterate through the elements
        Iterator<String> itr = fruitSet.iterator();

/*        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());*/

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}