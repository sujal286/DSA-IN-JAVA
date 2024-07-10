import java.util.ArrayList;
import java.util.Collections;
class Arraylist {
     public static void main(String args[])
  {
     ArrayList<Integer> list=new ArrayList<>();
     
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(5);

     System.out.println(list);

     System.out.println(list.get(1));

     list.remove(3);
     System.out.println(list);
 
     list.add(0,7);
     System.out.println(list);
  
     for(int i=0;i<list.size();i++)
     {
       System.out.println(list.get(i));
     }

     Collections.sort(list);
   
     System.out.println(list);
     
  }
}
