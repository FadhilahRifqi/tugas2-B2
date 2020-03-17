public class Mahasiswa{
	String nama;
	String stambuk;
	String jurusan;
	String fakultas;
	
	Mahasiswa(){
		nama="FADHILAH RIFQI";
		stambuk="13020180091";
		jurusan="TEKNIK INFORMATIKA";
		fakultas="ILMU KOMPUTER";
	}

	public static void main(String[] args){
		Mahasiswa mahasiswa1 = new Mahasiswa();

		System.out.println("Nama	: " +mahasiswa1.nama);
		System.out.println("Stambuk	: " +mahasiswa1.stambuk);
		System.out.println("Jurusan	: " +mahasiswa1.jurusan);
		System.out.println("Fakultas: " +mahasiswa1.fakultas);		
	}
}
