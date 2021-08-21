package palindromeOrNotLinkedllist;

import palindromeOrNotLinkedllist.palindrome.Node;

public class palindromeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome sc =new palindrome();
		Node list;
		list=sc.insert("1");
		list.next=sc.insert("2");
		list.next.next=sc.insert("1");
		
		sc.convertString(list);
	}

	

}
