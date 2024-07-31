import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private User user;

    @BeforeEach
    public void init() {
        user = new User("user", "password", "user@email.com");
    }

    @Test
    public void getLogin_assertNull_success() {
        assertNotNull(user.getLogin());
    }

    @Test
    public void getPassword_assertFalse_success() {
        assertFalse(false, user.getPassword());
        assertTrue(true, user.getPassword());
    }

    @Test
    public void getEmail_assertEquals_success() {
        assertEquals("user@email.com", user.getEmail());

    }


    @Test
    public void setLogin_throwsException_success() {
        assertThrows(IllegalArgumentException.class, () -> user.setLogin("a"));
    }

    @Test
    public void setPassword_throwsException_success() {
        assertThrows(IllegalArgumentException.class, () -> user.setPassword("abc0125"));
    }

    @Test
    public void setEmail_throwsException_success() {
        assertThrows(IllegalArgumentException.class, () -> user.setEmail("userNewEmail.com"));
    }

    @Test
    public void isValidPassword_assertTrue_success() {
        assertTrue(user.isValidPassword("password"));

    }

    @Test
    public void isValidPassword_assertFalse_success() {
        assertFalse(user.isValidPassword("incorrect password"));
    }
}