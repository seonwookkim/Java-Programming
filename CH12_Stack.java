public class CH12_Stack {
	private ListNode head ;
	private class ListNode {
		private String data ;
		private ListNode link ;
		
		public ListNode() {
			link = null ;
			data = null ;
		}
		public ListNode(String newData, ListNode linkValue) {
			data = newData ;
			link = linkValue ;
		}
	}
	public void showData() {
		System.out.println("=============\nStack Status\n=============") ;
		
		ListNode position = head ;
		while(position != null) {
			System.out.println(position.data) ;
			System.out.println("-------------") ;
			position = position.link ;
		}
	}
	public void Push(String addData) {
		head = new ListNode(addData, head) ;
	}
	public void Pop() {
		if(head != null) {
			head = head.link ;
		}
		else {
			System.out.println("Deleting from an empty list.") ;
			System.exit(0) ;
		}
	}
	
	public static void main(String[]args) {
		CH12_Stack mystack = new CH12_Stack() ;
		mystack.Push("One") ;
		mystack.Push("Two") ;
		mystack.Push("Three") ;
		
		mystack.showData() ;
		
		System.out.println("\n\n Pop() called.\n\n ") ;
		mystack.Pop() ;
		mystack.showData() ;
		
		System.out.println("\n\n Pop() called.\n\n ") ;
		mystack.Pop() ;
		mystack.showData() ;
		
		System.out.println("\n\n Pop() called.\n\n ") ;
		mystack.Pop() ;
		mystack.showData() ;
	}
}
