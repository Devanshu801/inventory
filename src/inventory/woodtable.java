package inventory;

public class woodtable extends FurnitureDecorator {
	public woodtable(shopkeeper s) {
		super(s);
	}
	public void ischildsafe() {
		super.ischildsafe();
		System.out.println("Adding properties of wood table");
		
	}
}
