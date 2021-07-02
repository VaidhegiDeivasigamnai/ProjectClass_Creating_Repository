package org.computer;

public class DesktopModel implements Software, Hardware{

	@Override
	public void hardwareresources() {
		System.out.println("Computer Hardwares"); 
		
	}

	@Override
	public void softwareResources() {
		System.out.println("Computer Softwares"); 
		
	}
	public void desktopModel() {
		System.out.println("Latest Model"); 

	}
	public static void main(String[] args) {
		DesktopModel d = new DesktopModel();
		d.desktopModel();
		d.hardwareresources();
		d.softwareResources();
	}

}
