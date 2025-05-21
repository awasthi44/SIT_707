package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

public class LoginFormTest {

	@Test
	public void testStudentIdentity() {
		String studentId = "224887189";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Shova Awasthi";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void test01_EmptyUsername_EmptyPassword() {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertFalse(status.isLoginSuccess());
	}

	@Test
	public void test02_EmptyUsername_WrongPassword() {
		LoginStatus status = LoginForm.login(null, "xyz");
		Assert.assertFalse(status.isLoginSuccess());
	}

	@Test
	public void test03_EmptyUsername_CorrectPassword() {
		LoginStatus status = LoginForm.login(null, "ahsan_pass");
		Assert.assertFalse(status.isLoginSuccess());
	}

	@Test
	public void test04_WrongUsername_EmptyPassword() {
		LoginStatus status = LoginForm.login("abc", null);
		Assert.assertFalse(status.isLoginSuccess());
	}

	@Test
	public void test05_WrongUsername_WrongPassword() {
		LoginStatus status = LoginForm.login("abc", "xyz");
		Assert.assertFalse(status.isLoginSuccess());
	}

	@Test
	public void test06_WrongUsername_CorrectPassword() {
		LoginStatus status = LoginForm.login("abc", "ahsan_pass");
		Assert.assertFalse(status.isLoginSuccess());
	}

	@Test
	public void test07_CorrectUsername_EmptyPassword() {
		LoginStatus status = LoginForm.login("ahsan", null);
		Assert.assertFalse(status.isLoginSuccess());
	}

	@Test
	public void test08_CorrectUsername_WrongPassword() {
		LoginStatus status = LoginForm.login("ahsan", "wrongpass");
		Assert.assertFalse(status.isLoginSuccess());
	}

	@Test
	public void test09_CorrectUsername_CorrectPassword_EmptyCode() {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess());
		Assert.assertFalse(LoginForm.validateCode(""));
	}

	@Test
	public void test10_CorrectUsername_CorrectPassword_WrongCode() {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess());
		Assert.assertFalse(LoginForm.validateCode("wrong"));
	}

	@Test
	public void test11_CorrectUsername_CorrectPassword_CorrectCode() {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess());
		Assert.assertTrue(LoginForm.validateCode("123456"));
	}
}
