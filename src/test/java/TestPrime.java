import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;

public class TestPrime {

	@Step("Is 3 a prime number <param0>")
	public void positveScenario(int param0) {
		org.junit.Assert.assertTrue(VerifyPrimeNumber.isPrime(param0));
	}

	@Step("Check 4 for not a prime number <param0>")
	public void methodStub(int param0) {
		org.junit.Assert.assertFalse(VerifyPrimeNumber.isPrime(param0));
	}

	@Step("Almost all numbers are prime <table>")
	public void methodStub(Table table) {
        for (TableRow row : table.getTableRows()) {
            String number = row.getCell("Number");
            System.out.println("Number : '" + number + "'");
            org.junit.Assert.assertTrue(VerifyPrimeNumber.isPrime(new Integer(number)));
        }
	}


}
