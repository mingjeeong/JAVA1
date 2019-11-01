
public class AccountingArrayApp {

	public static void main(String[] args) {

		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;

		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = income * dividendRates[0];
		double devidend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
		System.out.println("Value of Supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("expense : " + expense);
		System.out.println("income : " + income);
		System.out.println("dividend : " + dividend1);
		System.out.println("dividend : " + devidend2);
		System.out.println("dividend : " + dividend3);
	}

}
