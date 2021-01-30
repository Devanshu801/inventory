package inventory;



public class main {

	public static void main(String[] args) {
		shopkeeper woodchair1 = new woodchair(new furniture());
		woodchair1.ischildsafe();
		System.out.println("\n*****");
		
		shopkeeper woodtable1 = new woodchair(new woodtable(new furniture()));
		woodtable1.ischildsafe();
	}
}
