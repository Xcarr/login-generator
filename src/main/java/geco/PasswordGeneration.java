package geco;

import java.util.Random;

public class PasswordGeneration {
    private PasswordGeneration pass;

    public PasswordGeneration(){

    }

    public String getRandomPassWord(){
        String mdp = "";
        for (int cpt = 0; cpt<8; cpt++) {
            Random rr = new Random();
            char c = (char)(rr.nextInt(26)+97);
            mdp += c;
        }
        System.out.println(mdp);
        return mdp;
    }
}
