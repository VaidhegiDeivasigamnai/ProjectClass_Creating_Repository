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
	public void laptopModel() {
		System.out.println("good graphics");

	}
	public static void main(String[] args) {
		DesktopModel d = new DesktopModel();
		d.desktopModel();
		d.hardwareresources();
		d.softwareResources();
		d.laptopModel();
	}

}
