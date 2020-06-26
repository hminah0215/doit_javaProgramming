package generics;

public class GenericPrinterTest {

	public static void main(String[] args) {

		// Powder형으로 클래스 생성
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();

		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter); // 재료는 Powder 입니다

		// Plastic형으로 클래스 생성
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();

		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter); // 재료는 Plastic 입니다

	}
}
