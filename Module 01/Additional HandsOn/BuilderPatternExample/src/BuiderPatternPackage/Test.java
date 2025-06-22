package BuiderPatternPackage;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer myPC = new Computer.Builder()
	            .setCPU("Intel i7")
	            .setRAM("16GB")
	            .setStorage("1TB SSD")
	            .build();

	        myPC.showSpecs();

	}

}
