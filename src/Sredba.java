import java.util.Scanner;

	public class Sredba {
		public static void main(String[] args) {
 
			int prv,vtor,tret;
			Scanner tastatura = new Scanner(System.in);
	System.out.print("Vreme na doagjanje na Igor (cas): ");
		int casI=tastatura.nextInt();
	System.out.print("Vreme na doagjanje na Igor (minuti): ");
		int minI=tastatura.nextInt();
			int vremeI=casI*60+minI;
			
	System.out.print("Vreme na doagjanje na Mladen (cas): ");
		int casM=tastatura.nextInt();
	System.out.print("Vreme na doagjanje na Mladen(minuti): ");
		int minM=tastatura.nextInt();
			int vremeM=casM*60+minM;
			
	System.out.print("Vreme na doagjanje na Dragan(cas): ");
		int casD=tastatura.nextInt();
	System.out.print("Vreme na doagjanje na Dragan(minuti): ");
		int minD=tastatura.nextInt();
			int vremeD=casD*60+minD;
			
	if(vremeI<vremeM && vremeI<vremeD) {
		System.out.print("Igor stignal prv");
			prv=vremeI;
			vtor=Math.min(vremeD,vremeM);
			tret=Math.max(vremeD,vremeM);
 }
	else if(vremeM<vremeI && vremeM<vremeD) {
		System.out.print("Mladen stignal prv");
			prv=vremeM;
			vtor=Math.min(vremeD,vremeI);
			tret=Math.max(vremeD,vremeI);
 }
	else{
		System.out.print("Dragan stignal prv, ");
			prv=vremeD;
			vtor=Math.min(vremeI,vremeM);
			tret=Math.max(vremeI,vremeM);
 } 
	int razlika1=vtor-prv;
	int razlika2=tret-vtor;
		if(razlika1<=10 && razlika2<=5) {
			
			System.out.print("Se sretnale. :)");
 }
	else{
		System.out.print(" Ne se sretnale. :(");
		
 } 
 } 
}