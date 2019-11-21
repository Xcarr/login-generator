package geco;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    LoginService loginService;
    LoginGenerator generator;
    String nom, prenom, nom1, prenom1, nom2, prenom3, nom3;
    String nomCourt;

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
        nom1 = "Rolling";
        prenom1 = "Jean";
        nom2 = "Dùrand";
        nom3 = "Ralling";
        prenom3 = "John";

        nomCourt ="Du";
        //When
        generator = new LoginGenerator(loginService);
        //Then
        assertEquals("PDUR",
                generator.generateLoginForNomAndPrenom(nom, prenom));
        assertEquals("JRAL2",
                generator.generateLoginForNomAndPrenom(nom3, prenom3));
        assertEquals("JROL1",
                generator.generateLoginForNomAndPrenom(nom1, prenom1));
        assertEquals("PDUR1",
                generator.generateLoginForNomAndPrenom(nom2, prenom));
        assertEquals("PDU",
                generator.generateLoginForNomAndPrenom(nomCourt, prenom));
    }

}
