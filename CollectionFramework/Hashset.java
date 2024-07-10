import java.util.HashSet;
import java.util.Iterator;

class Hashset
{
    public static void main(String args[])
    {
        HashSet<Integer> set=new HashSet<>(); //Allocated in heap && only add unique elements

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);

        System.out.println(set); 

        System.out.println(set.size());

        if(set.contains(20))
        {
            System.out.println("Yes,it contains 20");
        }

        set.remove(20);
        System.out.println(set);

        Iterator it=set.iterator();

        while(it.hasNext()) //hasNext  return true if there is another element after that element else false 
        {
        System.out.print(it.next()+" ");
        }

    }
}
