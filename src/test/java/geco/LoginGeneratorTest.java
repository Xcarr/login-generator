package geco;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    LoginService loginService;
    LoginGenerator generator;
    String nom, prenom, nom1, prenom1;

    @Before
    public void setUp() throws Exception {
        loginService = new LoginService(new String[] {"JROL",
                "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
    }

    @Test
    public void generateLoginForNomAndPrenom() {
        //Given
        nom = "Durand";
        prenom = "Paul";
        nom1 = "Pernaud";
        prenom1 = "Bill";
        //When
        generator = new LoginGenerator(loginService);
        //Then
        assertEquals("PDUR",
                generator.generateLoginForNomAndPrenom(nom, prenom));
        assertEquals("BPER1",
                generator.generateLoginForNomAndPrenom(nom1, prenom1));
    }

}
