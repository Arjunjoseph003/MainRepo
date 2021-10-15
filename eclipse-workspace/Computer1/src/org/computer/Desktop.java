package org.computer;

public class Desktop implements Hardware, Software {
	private void desktopModel() {
		// TODO Auto-generated method stub
		System.out.println("Desktop Model is Dell");
	}

	@Override
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Hardware Resources are monitor,Mouse,keyboard");
	}

	@Override
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Software Resources are Chrome,Eclipse,MSOffice  ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop d = new Desktop();
		d.desktopModel();
		d.softwareResources();
		d.hardwareResources();
	}

}
