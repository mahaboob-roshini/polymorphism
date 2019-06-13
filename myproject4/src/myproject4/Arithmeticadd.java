package myproject4;
class Arithmetic {
	
	void add(int a,int b) {
		 int sum=a+b;
		 System.out.println("sum is"+sum);
	}
}
class Adder extends Arithmetic{
	 void add() {
		
		 }
}
public class Arithmeticadd{
	public static void main(String[ ]args) {
		Arithmetic a1=new Adder();
		a1.add(10,20);
	}
}