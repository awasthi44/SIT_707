package web.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginServiceUnitTest {

    @Test
    public void testValidLogin() {
        assertTrue("Login should succeed for valid credentials",
            LoginService.login("shova", "shova_pass", "1995-05-10"));
    }

    @Test
    public void testInvalidUsername() {
        assertFalse("Login should fail for unknown username",
            LoginService.login("unknown", "shova_pass", "1995-05-10"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse("Login should fail for incorrect password",
            LoginService.login("shova", "wrong_pass", "1995-05-10"));
    }

    @Test
    public void testInvalidDob() {
        assertFalse("Login should fail for incorrect date of birth",
            LoginService.login("shova", "shova_pass", "2000-01-01"));
    }

    @Test
    public void testNullValues() {
        assertFalse("Login should fail when username is null",
            LoginService.login(null, "shova_pass", "1995-05-10"));
        assertFalse("Login should fail when password is null",
            LoginService.login("shova", null, "1995-05-10"));
        assertFalse("Login should fail when dob is null",
            LoginService.login("shova", "shova_pass", null));
    }

    @Test
    public void testEmptyValues() {
        assertFalse("Login should fail for empty username, password and dob",
            LoginService.login("", "", ""));
    }

    @Test
    public void testTrimmedInput() {
        assertTrue("Login should succeed even if input values have leading/trailing spaces",
            LoginService.login("  shova ", " shova_pass", "1995-05-10 "));
    }
}
