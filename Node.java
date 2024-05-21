
public class Node {
	private int sayi;
	private Node next;

	public Node(int sayi) {
		this.sayi = sayi;
		next = null;
	}

	public void setNext(Node next) {
		this.next = next;
	}
		
	public Node getNext() {
		return next;
	}
		
	public int getSayi() {
		return sayi;
	}
	
	public void setSayi(int a){
		
		this.sayi=a;
		
		
	}
	
	
	
	
	
}
