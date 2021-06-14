import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testClass2 {
	
	String message="Robert";
	String message2="Hi Robert";
	
	@Test
	public void testSaluationMessage() {
		System.out.println("Inside testSalutationMeassage()");
		message="Hi!"+"Robert";
		assertEquals(message,message2);
	}

}