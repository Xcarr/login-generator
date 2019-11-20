package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    ArrayList<String> loginsExistants;
    LoginService service;
    String[] logins = new String[2];

    @Before
    public void setUp() throws Exception {
        loginsExistants.add("azer");
        loginsExistants.add("qwer");
        loginsExistants.add("azor");
        logins[0] = loginsExistants.get(0);
        logins[1] = loginsExistants.get(1);
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
        assertEquals(true, service.loginExists(login1));
        assertEquals(false, service.loginExists(login2));

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
        ArrayList<String> liste = new ArrayList<>();
        //When
        pref = "az";
        liste.add(loginsExistants.get(0)); liste.add(loginsExistants.get(2));
        //Then
        assertEquals(liste, service.findAllLoginsStartingWith(pref));
    }

    @Test
    public void findAllLogins() {
        ArrayList<String> tous = new ArrayList<>();

        tous.add(loginsExistants.get(0));
        tous.add(loginsExistants.get(1));
        tous.add(loginsExistants.get(2));

        assertEquals(tous, service.findAllLogins());
    }
}