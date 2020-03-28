//Tugas 2 dengan inputan

import java.util.Scanner; 

public class MahasiswaInputan{
	public static void main(String[] args){
		
		Scanner masukan = new Scanner(System.in);
		/* Program */   
		System.out.print ("Nama	: "); 
		String a = masukan.nextLine();
		System.out.print ("Stambuk	: ");
		String b = masukan.nextLine();
		System.out.print ("Jurusan	: ");
		String c = masukan.nextLine();
		System.out.print ("Fakultas: ");		
		String d = masukan.nextLine();
		
		
		System.out.print("\n");
		/* coba ketik : masukan.nextInt(); ; Apa akibatnya ?*/    
		System.out.println ("----------------------------"); 
		System.out.println ("Nama	: "+a); 
		System.out.println ("Stambuk	: "+b);
		System.out.println ("Jurusan	: "+c);
		System.out.println ("Fakultas: "+d);
	}
}

/*
output:
Nama    : fadhilah rifqi
Stambuk : 13020180091
Jurusan : teknik informatika
Fakultas: ilmu komputer

----------------------------
Nama    : fadhilah rifqi
Stambuk : 13020180091
Jurusan : teknik informatika
Fakultas: ilmu komputer

penjelasan:
penjelasan:
untuk membuat inputan string pada java maka pada program ini membuat terlebih dahulu 
class Scanner, class yang berfungsi untuk inputan pada java.dan jangan lupa mengimpornya agar dapa di gunakan.
 membuat scanner baru dan menyimpannya ke dalam 
variabel a, b,c, dan d yang gunakan di sini adalah String a = masukan.nextLine().
nextLine() untuk yang bertipe data string seperti nama, stambuk, jurusan, fakultas seperti pada progam ini.
kemudian panggil dan cetak inputan-inputan yang sudah di inputkan tadi nama, stambuk, jurusan, dan fakultas.
*/