package inventory;

public class FurnitureDecorator implements shopkeeper {
	protected shopkeeper shopkeeper;
	
public FurnitureDecorator(shopkeeper s) {
	this.shopkeeper = s;
}
public void ischildsafe() {
	this.shopkeeper.ischildsafe();
}

}
