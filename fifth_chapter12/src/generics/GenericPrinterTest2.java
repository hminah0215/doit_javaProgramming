package generics;

public class GenericPrinterTest2 {

	public static void main(String[] args) {

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		powderPrinter.printing(); // Powder 재료로 출력합니다

		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		plasticPrinter.printing(); // Plastic 재료로 출력합니다
	}
}
