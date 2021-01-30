package inventory;


public class woodchair extends FurnitureDecorator {
	public woodchair(shopkeeper s) {
		super(s);
	}
	public void ischildsafe() {
		super.ischildsafe();
		System.out.println("Adding properties of woodchair");
	}
	
}
