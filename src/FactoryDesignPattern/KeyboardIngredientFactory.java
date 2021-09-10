package FactoryDesignPattern;

public interface KeyboardIngredientFactory {
	
	public USBCable SelectUSBcable();
	public KeyboardCase SelectKeyboardCase();
	public PCB SelectPCB();
	public MountingPlate SelectMountingPlate();
	public Stabilizers SelectStabilizers();
	public KeyCaps SelectKeyCaps();
	public Gaming SelectGaming();
	public International SelectInternational();

}
