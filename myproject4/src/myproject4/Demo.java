package myproject4;
class Vehcile {
	String  getName() {
		
		return "genericsports";
	 }
void getteamnumber() {
	System.out.println("each team have n palyers"+getName());
}
}
class soccer extends Vehcile{
	
	String  getName() {
		
		
		return "soccersports ";
	}
	
}
public class Demo
{
	public static void main(String[ ]args) {
		Vehcile s=new Vehcile();
		s.getteamnumber();
		System.out.println(s.getName());
		Vehcile v=new soccer();
		v.getteamnumber();
		System.out.println(v.getName());
	}
}