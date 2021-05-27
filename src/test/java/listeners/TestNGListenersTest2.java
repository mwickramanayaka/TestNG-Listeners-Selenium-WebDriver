package listeners;
 
import org.testng.SkipException;
import org.testng.annotations.Test;

 
 
public class TestNGListenersTest2 {

	@Test
	public void test4() {

	}

	@Test
	public void test5() {
		System.out.println("I am inside Test2");
		
	}

	@Test
	public void test6() {
		System.out.println("I am inside Test3");
		throw new SkipException("TestSkipped");
	}

}
