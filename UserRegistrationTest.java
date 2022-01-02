package UserRegistration;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class UserRegistrationTest {
	private String email;
	private Boolean expectedResult;
	private UserRegistrationTest user_reg;

	@Before
	public void initialize() {
		user_reg = new UserRegistrationTest();
	}

	public UserRegistrationTest() {
		this.email = email;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection emailaddress() {
		return Arrays.asList(new Object[][] { { "abc+100@gmail.com", true }, { "abc@abc@gmail.com", false },
				{ "abc.100@yahoo.com", true }, { "abc@gmail.com.1a", false } });
	}

	@Test
	public void emailvalidTest() throws InvalidUserInputException {
		System.out.println("Parameterized email is : " + email);
		assertEquals(expectedResult, user_reg.email(email));

	}

	
	private Object email(String email2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void firstnameTest() {
		try {
			UserRegistrationMain ur = new UserRegistrationMain();
			boolean result = ur.firstname();
			Assert.assertEquals(true, result);

		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

	@Test
	public void lastnameTest() {
		try {
			boolean result = UserRegistrationMain.lastname();
			Assert.assertEquals(true, result);
		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

	@Test
	public void emailTest() {
		try {
			boolean emailres = UserRegistrationMain.email("abc+100@gmail.com");
			Assert.assertEquals(true, emailres);
		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

	@Test
	public void mobilenumberTest() {
		try {
			boolean mobile = UserRegistrationMain.mobilenumber();
			Assert.assertEquals(true, mobile);
		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

	@Test
	public void rule4Test() {
		try {
			boolean specialch = UserRegistrationMain.Rule4();
			Assert.assertEquals(true, specialch);
		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

}
