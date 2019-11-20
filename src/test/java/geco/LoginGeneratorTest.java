package geco;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    LoginService loginService;
    LoginGenerator generator;

    @Before
    public void setUp() throws Exception {
        loginService = new LoginService(new String[] {"JROL",
                "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
    }

    @Test
    public void generateLoginForNomAndPrenom() {
    }

    @Test
    public void testGenerateLoginForNomAndPrenom() {
    }
}
