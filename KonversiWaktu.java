public class KonversiWaktu{
		
		int totalDetik, detikSekarang, totalMenit, menitSekarang, totalJam, jamSekarang;
	
	KonversiWaktu(){
		totalDetik=146720;
		
		detikSekarang=totalDetik%60;
		totalMenit=totalDetik/60;
		menitSekarang=totalMenit %60;
		totalJam=totalMenit/60;
		jamSekarang=totalJam%24;		
	}
	
	public static void main(String[] args){
		
		KonversiWaktu waktu = new KonversiWaktu();
		
		System.out.println(+waktu.jamSekarang +" Jam " +waktu.menitSekarang +" menit " +waktu.detikSekarang +" detik.");
		
	}
	
}