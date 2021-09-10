package FactoryDesignPattern;

public class GamingKeyboard  extends Keyboard {
	KeyboardIngredientFactory requirementFactory;
 
	public GamingKeyboard(KeyboardIngredientFactory requirementFactory) {
		this.requirementFactory = requirementFactory;
	}
 
	void Make() {
		System.out.println("making " + name);
		USBcable = requirementFactory.SelectUSBcable();
		keyboardcase = requirementFactory.SelectKeyboardCase();
		keycaps = requirementFactory.SelectKeyCaps();
		PCB = requirementFactory.SelectPCB();
		gaming = requirementFactory.SelectGaming();

	}


}
