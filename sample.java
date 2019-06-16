import System ; 
import System.Collections.Generic ; 
import System.Data.SQLite ; 
import System.Linq ; 
import System.Threading.Tasks ; 
import System.Windows.Forms ; 
static class Program {
	static void Main ( ) {
		Application.EnableVisualStyles ( ) ; 
		Application.SetCompatibleTextRenderingDefault ( false ) ; 
		Application.Run ( new GridView ( ) ) ; 
		var v = new xd.Bar ( 15 ) ; 
		string test = "test" ; 
		bool bb = false ; 
		double x = 22.14 + 5.4 ; 
		double y = 67.1 - 2 ; 
		double z ; 
		z = 12.56 * ( - 2.5 ) ; 
		if ( bb == true ) {
			bb = false ; 
		}

		for ( int i = 0 ; i < 10 ; i ++ ) {
			Console.WriteLine ( i ) ; 
		}

		Console.WriteLine ( x + test + y + "xd" + z + " " + foo ( x ) ) ; 
	}
	private int foo ( double x ) {
		return Math.Floor ( x ) ; 
	}
}
class Ffx {
}
class Bar {
	private int aaa ; 
	public Bar ( int a ) {
		aaa = a ; 
	}
}
