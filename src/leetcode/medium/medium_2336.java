package leetcode.medium;

import java.util.SortedSet;
import java.util.TreeSet;

public class medium_2336{
public static void main(String[] args) {
    
}
public class SmallestInfiniteSet {
    SortedSet<Integer> s;
   public SmallestInfiniteSet() {
        s = new TreeSet<>();
       for(int i=1;i<=1000;i++) {
           s.add(i);
       }
   }
   
   public int popSmallest() {
       int el = s.first();
       s.remove(s.first());
       return el;
   }
   
   public void addBack(int num) {
       if(!s.contains(num)) {
           s.add(num);
       }
   }
}

/**
* Your SmallestInfiniteSet object will be instantiated and called as such:
* SmallestInfiniteSet obj = new SmallestInfiniteSet();
* int param_1 = obj.popSmallest();
* obj.addBack(num);
*/ {
    
}}
