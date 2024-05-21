import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		String input=k.nextLine();
		
		CircularLinkedList list = new CircularLinkedList();//Circular linkedlist olusturuldu.
		
		int index=0;
		
		
		
		if(input.charAt(index)=='|') {
			
			System.out.println("Hatali giris.");
			System.exit(0);
			
		}else if(input.charAt(index) == ' ' && input.charAt(index)=='|'&& input.charAt(index)==' ') {
			System.out.println("Sayi dizisini once giriniz.");
			System.exit(0);
		}else if(input.charAt(index) == ' ') {
			System.out.println("Boslukla baslamayiniz.");
			System.exit(0);
		}else if(!(input.charAt(index)>47 && input.charAt(index)< 58)) {
			System.out.println("Lutfen sayiyla baslayiniz.");
			System.exit(0);
		}
		
		
		
		String deger="";
		int tut=0;
		while(true) {
			
			if(input.charAt(index)=='|') {
				
				tut=index;
				break;
				
			}
			if(input.charAt(index)>47 && input.charAt(index)< 58) {//Yani rakamsa..
				deger+=""+input.charAt(index);
				
				
			}
			if(input.charAt(index+1)==' ') {
				
				list.addLast(Integer.parseInt(deger));//boslukla ayrilacagi icin listeye ekleniyor.
				deger="";
				
			}
			
			index++;
			
		}
		
		input=input.substring(tut+2);
		
		// | sonraki iki sayi tutulcak..
		
		int sayi1= Integer.parseInt(input.substring(0,input.indexOf(' ')));
		
		int sayi2=Integer.parseInt(input.substring(input.indexOf(' ')+1));
		
		
		list.sil(sayi1, sayi2);//silme isleminin gerceklesmesi..Linkedlist guncelleme..
		
		list.print();//yazdirma
		
		
		
	}

}
