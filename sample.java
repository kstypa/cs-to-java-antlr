using System ; 
using System .Collections .Generic ; 
using System .Data .SQLite ; 
using System .Linq ; 
using System .Threading .Tasks ; 
using System .Windows .Forms ; 
namespace antlr_test {
static class Program {
static void Main ( ) {
Application .EnableVisualStyles ( ) ; 
Application .SetCompatibleTextRenderingDefault ( false ) ; 
Application .Run ( new GridView ( ) ) ; 
var v = new xd .Bar ( 15 ) ; 
string test = "test" ; 
bool bb = false ; 
double x = 22.14 + 5.4 ; 
double y = 67.1 - 2 ; 
double z ; 
z = 12.56 * ( - 2.5 ) ; 
if ( bb == true true ) {
bb = false ; 
}

for ( int i = 0 ; i < 10 ; i ++ ) {
Console .WriteLine ( i ) ; 
}

Console .WriteLine ( x + test + y + "xd" + z + " " + foo ( x ) ) ; 
}
private int foo ( double x ) {
return Math .Floor ( x ) ; 
}
}
class Ffx {
}
}
namespace xd {
class Bar {
private int aaa ; 
public Bar ( int a ) {
aaa = a ; }
}
}
