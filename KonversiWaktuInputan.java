import java.util.Scanner;

public class KonversiWaktuInputan{
	
	public static void main(String[] args){
		
		int totalDetik, detikSekarang, totalMenit, menitSekarang, totalJam, jamSekarang;
		
		Scanner detik = new Scanner(System.in);
		
		System.out.println("Masukan detik : ");
		totalDetik = detik.nextInt();
		
		detikSekarang=totalDetik%60;
		totalMenit=totalDetik/60;
		menitSekarang=totalMenit %60;
		totalJam=totalMenit/60;
		jamSekarang=totalJam%24;
		System.out.println(+jamSekarang +" Jam " +menitSekarang +" menit " +detikSekarang +" detik.");
		
	}
	
}

/*
output:
Masukan detik :
13456
3 Jam 44 menit 16 detik.

penjelasan
untuk membuat inputan datik bertipe data int pada java maka pada program ini membuat terlebih dahulu 
class Scanner, class yang berfungsi untuk inputan pada java.dan jangan lupa mengimpornya agar dapat di gunakan.
membuat scanner baru dan menyimpannya ke dalam variabel detik yang gunakan di sini adalah totalDetik = detik.nextInt();.
nextInt() untuk yang bertipe data integer seperti detik. kemudia setelah masukan detik untuk menkonversikannya ke jam 
menit dan detik sekarang maka proses perhitungan untuk mencari detikSekarang adalah dengan total%60, 
mencari totalMenit adalah dengan totalDetik/60, mencari menitSekarang adalhag dengan
totalMenit%60, mencari totalJam adalah dengan totalMenit/60, mencari jamSekarang adalah dengan totalJam%24;
kemudia setelah proses perhitungan maka tampilkan hasil dari pehitungan itu mulai dari jam 
*/