package myproject4;

 class cycle
 {
	void  func(){
		System.out.println("cycle is super class");
	 }


}
class motorcycle extends cycle
{
	void func() {
		super.func();
		System.out.println("motorcycle is sub class");
	}
}
  public class Overridies 
{
	public static void main(String[ ]args) {
		motorcycle c1=new motorcycle();
		c1.func();
	}
}