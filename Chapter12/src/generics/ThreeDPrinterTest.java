package generics;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
		//캐스팅 해줄 필요는 없다.
		Powder powder = printer.getMaterial();
		
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<Plastic>();
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial();
		

//		ThreeDPrinter<Water> printerWater = new ThreeDPrinter<Water>();
//		printerWater.setMaterial(new Water());
//		Water water = printerWater.getMaterial();
		
		
		System.out.println(powder);
		System.out.println(plastic);
//		System.out.println(water);
		
		plastic.doPrinting();
		powder.doPrinting();
		
	}

}
