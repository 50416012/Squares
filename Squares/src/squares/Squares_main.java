package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x[] = { 0.0, 0.2, 0.4, 0.6, 0.8, 1.0 };
		double y[] = { 1.1, 1.9, 3.2, 4.1, 5.4, 6.6 };
		double theta[] = new double[2];

		Squares_lib slib = new Squares_lib(x, y);
		for(int i = 0; i < 100; i++){
			theta = slib.getDx();
			System.out.println(i+" : theta[0] = "+theta[0]);
			System.out.println(i+" : theta[1] = "+theta[1]);
			System.out.println(i+" : Objective function = "+slib.getRx());
		}
	}
	// Excel
	// Ø•Ð= - 0.1733
	// ŒX‚« = 5.5570 
	
    // ‚±‚ÌƒvƒƒOƒ‰ƒ€ 
	// Ø•Ð = 0.9456161906575469
	// ŒX‚« = 5.543477145492482
}
