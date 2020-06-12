
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 * Design a data structure that supports all following operations in average O(1) time.-insert,delete,get random
 * can be implemented using a hashmap
 */

class RandomizedSet {

HashMap<Integer,Integer> mp;
List<Integer> list;


    /** Initialize your data structure here. */
    public RandomizedSet() {
        mp=new HashMap<>();
        list=new ArrayList<>();
        }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(mp.containsKey(val))
            return false;
        else
            list.add(val);
            mp.put(val,list.size()-1);
            return true;
        
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!mp.containsKey(val)){
            return false;
        }
        int index=mp.get(val);
        Collections.swap(list, list.size()-1, index);
int swappedwith=list.get(index);
mp.put(swappedwith, index);
int rem=list.remove(list.size()-1);
mp.remove(rem);
return true;

    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random r=new Random();
      int n=  r.nextInt(list.size());
      return list.get(n);
        
    }
}
public class InsDelGetRandom {
    
    
    public static void main(String[] args) {
        
    }
}
