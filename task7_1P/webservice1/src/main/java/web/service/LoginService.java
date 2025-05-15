package web.service;

import java.util.HashMap;
import java.util.Map;

/**
 * Business logic to handle login functions.
 */
public class LoginService {

    // Mock database of users: username -> [password, dob]
    private static final Map<String, String[]> userData = new HashMap<>();

    static {
        userData.put("shova", new String[]{"shova_pass", "1995-05-10"});
        // Add more test users as needed
    }

    /**
     * Validates user credentials including dob.
     * @param username the username
     * @param password the password
     * @param dob      the date of birth in yyyy-mm-dd format
     * @return true if all match, false otherwise
     */
    public static boolean login(String username, String password, String dob) {
        if (username == null || password == null || dob == null) return false;

        username = username.trim();
        password = password.trim();
        dob = dob.trim();

        String[] credentials = userData.get(username);
        if (credentials != null) {
            return credentials[0].equals(password) && credentials[1].equals(dob);
        }
        return false;
    }
}
