
public class CircularLinkedList {

	private Node head;
	
	
	
	public CircularLinkedList() {
		head=null;
		
	}
	
	public void addLast(int sayi){
		
		Node gez=head;
		
		Node n = new Node(sayi);
		
		if(gez==null) {// head null ise yani linked list bos ise..
			
			//Bu durumda n head olucak ve nexti kendisini gostericek.
			
			n.setNext(n);
			head=n;
			
		}else {//Eger head null degilse.
			
			
			while(gez.getNext()!= head ) {
				
				gez=gez.getNext();
				
			}
			
			gez.setNext(n);
			n.setNext(head);
			
		}
			
			
			
	}
	
	public void sil(int sayi1,int sayi2) {
		
		int say=0;
		
		
		
		while(say<sayi1){//Cunku sayi1 kadar cikarma islemi yapilcak..
			
			if(head!=null){//head null degilse..sayi2. eleman silinecek.
				
				
				Node iterator=null;
				Node iterator1=null;
				if(sayi2!=1){
					iterator=head;
					iterator1=iterator.getNext();
					for(int i=2;i<sayi2;i++) {
						
						iterator1=iterator1.getNext();//asil silinecek.
						iterator=iterator.getNext();//Bir oncesi
					}
					if(iterator==iterator1) {//Yani sadece head kalmis demektir.Yani head silinecek.
						head=null;
						
					}else if(iterator1!= iterator){
						if(iterator1!=head) {
							iterator.setNext(iterator1.getNext());
							iterator1.setNext(null);
							
						}else{
							head=head.getNext();
							iterator.setNext(iterator1.getNext());
							iterator1.setNext(null);
							
			
						}	
					}
					if(head!=null) {
						iterator=head;
						iterator1=head.getNext();
					}	
				}else if(sayi2==1){
					
					Node gez=head;
					
					if(head!=null) {
						do {
							
							gez=gez.getNext();
						}while(gez.getNext()!=head);
						
						if(gez!=head) {
							head=head.getNext();
							gez.setNext(head);
						}else
							head=null;
					}
					
					if(head!=null) {
						iterator=head;
						iterator1=head.getNext();
					}
				}
			}else if(head==null) {//Circular linkedlist bos ise donguden ciksin.
				break;
				
			}
			say++;
			
		}	
		
		if(say!=sayi1&& head==null){
			System.out.println("Error: linkedlist is too small.");
		}else if(say==sayi1 && head==null) {
			System.out.println("Linkedlist is now empty.");
			
		}
		
		
	}
	public void print() {
		
		Node gez=head;
		
		if(head!=null) {
			do {
				System.out.print(gez.getSayi()+" ");
				gez=gez.getNext();
			}while(gez!=head);
			
			
			
		}
		
			
			
	}
		
	
	
	
	
		
	
	
}
