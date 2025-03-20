public class LE4_1
{
	public static void main(String[] args) {
		Beverage[] beverages = { new Whiskey(), new Vodka(), new Rum(), new Beer() };
        for (Beverage beverage : beverages) {
            System.out.println();
            beverage.prepareBeverage();
        }
	}
}
