package anudipAssigment3;

import java.util.HashMap;

public class HasMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     // add values to the HashMap

	     HashMap<Integer,Integer> num = new HashMap<>();
	     num.put(2,4);
	     num.put(5,25);
	     num.put(7,49);
	     num.put(9,81);
	     for(int i=1;i<=15;i++)
	     {
	    	 if(num.containsKey(i))
	    	 {
	    		 //display key and value if it is present

	    		 System.out.println(i+":"+"Number is square");
	    	 }
	    	 else
	    	 {
	    		 System.out.println(i+":"+"Number  is not square");
	    	 }
	     }
	     for(Integer i:num.keySet())
	     {
	    	 // prints square value of key

	    	 System.out.println("key:"+i+"value:"+num.get(i));
	     }
		}
}


