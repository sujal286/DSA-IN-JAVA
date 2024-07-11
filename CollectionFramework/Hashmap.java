import java.util.HashMap;
import java.util.Map;
import java.util.Set;
class Hashmap 
{

    public static void main(String args[])
    {
     HashMap<String, Integer> map= new HashMap<>();
   
     map.put("Sujal Saha",23);
     map.put("Mann kumar",45);
     map.put("Yash Raj",66);

     System.out.println(map);

     if(map.containsKey("Anil"))
     {
      System.out.println("key is present");
     }
     else
     {
      System.out.println("key is not present");
     }

     System.out.println(map.get("Sujal Saha")); //key exists
       System.out.println(map.get("Raj Sheikh")); //key doesn't exist


       //Iteration (1)
       for( Map.Entry<String, Integer> e : map.entrySet()) {
           System.out.print(e.getKey()+" ");
           System.out.println(e.getValue());
       }


       //Iteration (2)
       Set<String> keys = map.keySet();
       for(String key : keys) {
           System.out.println(key+ " " + map.get(key));
       }

    }
}
