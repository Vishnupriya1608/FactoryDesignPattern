package FactoryDesignPattern;

public abstract class Keyboard {
	String name;

	USBCable USBcable;
	KeyboardCase keyboardcase;
	PCB PCB;
	MountingPlate mountingplate;
	Stabilizers stabilizers;
	KeyCaps keycaps;
	Gaming gaming;
	International international;

	abstract void Make();

	void InsertMolding() {
		System.out.println("Two-shot insert molded keycaps are unsurpassed for high use of applications");
	}
	void NonStandardFonts() {
		System.out.println(" select the actual font that Signature Plastics uses for their standard keycaps");
	}

	void PadPrinting() {
		System.out.println("Pad Printing the keyboard for low volume requirements.");
	}

	void SublimationPrinting() {
		System.out.println("Do the Sublimation Printing for the complex graphic reuirements");
	}

	void PaintingAndEngraving() {
		System.out.println("Signature Plastics has the ability to paint and engrave custom non-standard keycaps to meet your unique backlit application");
	}


	void Packing() {
		System.out.println("Place Keyboard in official Keyboard box");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (USBcable != null) {
			result.append(USBcable);
			result.append("\n");
		}
		if (keyboardcase != null) {
			result.append(keyboardcase);
			result.append("\n");
		}
		if (PCB != null) {
			result.append(PCB);
			result.append("\n");
		}

		if (mountingplate != null) {
			result.append(mountingplate);
			result.append("\n");
		}
		if (stabilizers != null) {
			result.append(stabilizers);
			result.append("\n");
		}
		if (keycaps != null) {
			result.append(keycaps);
			result.append("\n");
		}
		
		if (gaming != null) {
			result.append(gaming);
			result.append("\n");
		}
		if (international != null) {
			result.append(international);
			result.append("\n");
		}
		
		return result.toString();
	}



}
