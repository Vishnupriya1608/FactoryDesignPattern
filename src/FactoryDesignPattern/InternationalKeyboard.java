package FactoryDesignPattern;

public class InternationalKeyboard extends Keyboard {
	KeyboardIngredientFactory requirementFactory;
 
	public InternationalKeyboard(KeyboardIngredientFactory requirementFactory) {
		this.requirementFactory = requirementFactory;
	}
 
	void Make() {
		System.out.println("making " + name);
		USBcable = requirementFactory.SelectUSBcable();
		keyboardcase = requirementFactory.SelectKeyboardCase();
		keycaps = requirementFactory.SelectKeyCaps();
		mountingplate=requirementFactory.SelectMountingPlate();
		international = requirementFactory.SelectInternational();
	}

}
