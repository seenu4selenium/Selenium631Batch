package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestListeners.class)
public class TestSample {
	@Test
	public void test01() {
		int a = 90;
		int b = 80;
		int c = a + b;
		System.out.println(c);
	}

	@Test(retryAnalyzer =listeners.RetryAnalyzer.class)
	public void test02() {
		String a ="apple";
		String b = "Apple";
		Assert.assertEquals(a, b);
		System.out.println("Test02 End statment");
	}

}
