package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {
    PasswordGeneration pass;

    @Before
    public void setUp() throws Exception {
        pass = new PasswordGeneration();
    }

    @Test
    public void getRandomPassWord() {
        String pw = "abcdefgh";
        assertEquals(pw.length(), pass.getRandomPassWord().length());
    }
}