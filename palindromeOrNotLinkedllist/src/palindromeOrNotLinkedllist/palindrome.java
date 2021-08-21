package palindromeOrNotLinkedllist;



public class palindrome { 
	     class Node{
	    	String data;
	    	 Node next;
	    	 Node(String data)
	    	 {
	    		this.data=data;
	    		next=null;
	    	 }
	     }
	     public Node insert(String s)
	     {
	    	 Node n=new Node(s);
	    	 return n;
	     }
	     public void  convertString(Node head)
	 	{
	 		 Node temp=head;
	 		 String s="";
	 		 while(temp!=null)
	 		 {
	 			 s=s.concat(temp.data);
	 			 temp=temp.next;
	 		 }
	 		boolean c= palindromeCheck(s);
	 		if(c==true)
	 		{
	 			System.out.println("yes");
	 		}
	 		else
	 		{
	 			System.out.println("not");
	 		}
	 		 
	 	}
	     public boolean palindromeCheck(String s)
	     { 
	    	  int p=s.length();
	    	  if(s.length()==0)
	    	  {
	    		  return false;
	    	  }
	    	  else
	    		  
	    	   {
	    		   for(int i=0;i< p/2;i++)
	    		   {
	    			   if(s.charAt(i)!=s.charAt(p-i-1))
	    			   {
	    				   return false;
	    				   
	    			   }
	    			   
	    		   }
	    	   }
	    	   return true;
	     }

}
