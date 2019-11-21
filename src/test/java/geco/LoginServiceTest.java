package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    ArrayList<String> loginsExistants;
    LoginService service;
    String[] logins;

    @Before
    public void setUp() throws Exception {
        logins = new String[] {"azer","qwer","azor"};
        service = new LoginService(logins);
    }

    @Test
    public void loginExists() {
        //Given
        String login1;
        String login2;
        //When
        login1 = "azer";
        login2 = "xcar";
        //Then
        assertTrue(service.loginExists(login1));
        assertFalse(service.loginExists(login2));

    }

    @Test
    public void addLogin() {
        String login;

        login = "xcar";
        service.addLogin(login);

        assertTrue(service.loginExists("xcar"));

    }

    @Test
    public void findAllLoginsStartingWith() {
        //Given
        String pref;
        ArrayList<String> liste = new ArrayList<String>();
        //When
        pref = "az";
        liste.add("azer");
        liste.add("azor");
        //Then
        assertEquals(liste, service.findAllLoginsStartingWith(pref));
    }

    @Test
    public void findAllLogins() {
        ArrayList<String> tous = new ArrayList<String>();

        tous.add("azer");
        tous.add("qwer");
        tous.add("azor");
        Collections.sort(tous);

        assertEquals(tous, service.findAllLogins());
    }
}