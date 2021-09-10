package FactoryDesignPattern;

public class TestKeyboardDrive {

	public static void main(String[] args) {
		KeyboardStore IllinoisStore = new IllinoisKeyboardStore();
		KeyboardStore SFStore = new SanFransiscoKeyboardStore();
 
		Keyboard keyboard = IllinoisStore.orderKeyboard("Gaming");
		System.out.println("Priya ordered a " + keyboard + "\n");
 
		keyboard = SFStore.orderKeyboard("Gaming");
		System.out.println("Kavya ordered a " + keyboard + "\n");

		keyboard = IllinoisStore.orderKeyboard("International");
		System.out.println("Saranya ordered a " + keyboard + "\n");
 
		keyboard = SFStore.orderKeyboard("International");
		System.out.println("Siri ordered a " + keyboard + "\n");

		
	}

}
