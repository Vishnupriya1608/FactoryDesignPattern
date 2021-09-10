package FactoryDesignPattern;

public class SanFransiscoKeyboardRequirementFactory  implements KeyboardIngredientFactory 
{

	public USBCable SelectUSBcable() {		
		return new USBcables();
	}

	public KeyboardCase SelectKeyboardCase() {
		return new KeyBoardCases();
	}

	public PCB SelectPCB() {
		return new PCBs();
	}

	public MountingPlate SelectMountingPlate() {
		return new MountingPlates() ;
	}

	public Stabilizers SelectStabilizers() {
		return new stabilizer();
	}

	public KeyCaps SelectKeyCaps()
	{
	
		return new keycap();
	}

	public Gaming SelectGaming() {
		return new gamings();
	}

	public International SelectInternational() {
		return new interanationalk();
	}
}
