
public class AccountingIFApp {

	public static void main(String[] args) {

		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		double dividend1;
		double devidend2;
		double dividend3;
		if (income > 10000) {
			dividend1 = income * 0.5;
			devidend2 = income * 0.3;
			dividend3 = income * 0.2;
		} else {
			dividend1 = income * 1;
			devidend2 = income * 0;
			dividend3 = income * 0;
			
		}

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
