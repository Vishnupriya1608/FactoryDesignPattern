package FactoryDesignPattern;

public abstract class KeyboardStore {
	protected abstract Keyboard createKeyboard(String item);
	 

	public Keyboard orderKeyboard(String type)
	{
		Keyboard keyboard;
		
		
		keyboard =createKeyboard(type);
		
		System.out.println("--- Making a " + keyboard.getName() + " ---");
		
		keyboard.Make();
		keyboard.InsertMolding();
		keyboard.NonStandardFonts();
		keyboard.PadPrinting();
		keyboard.SublimationPrinting();
		keyboard.PaintingAndEngraving();
		keyboard.Packing();
		

		return keyboard;
		
		
	}
}
