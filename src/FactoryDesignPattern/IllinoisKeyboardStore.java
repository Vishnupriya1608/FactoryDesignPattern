package FactoryDesignPattern;

public class IllinoisKeyboardStore extends KeyboardStore {
	protected Keyboard createKeyboard(String item) {
		Keyboard keyboard = null;
		KeyboardIngredientFactory requirementFactory =
		new SanFransiscoKeyboardRequirementFactory();

		if (item.equals("Gaming")) {

			keyboard = new GamingKeyboard(requirementFactory);
			keyboard.setName("Gaming Keyboard");

		} else if (item.equals("International")) {

			keyboard = new InternationalKeyboard(requirementFactory);
			keyboard.setName("International Keyboard");

		} 
		return keyboard;
	}
	}


