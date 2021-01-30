package inventory;

public class steelchair extends FurnitureDecorator {
	public steelchair(shopkeeper s) {
		super(s);
	}
	public void ischildsafe() {
		super.ischildsafe();
		System.out.println("Adding properties of steel chair");
		
	}
}