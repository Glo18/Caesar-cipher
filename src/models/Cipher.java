package models;

import java.security.Key;

public class Cipher {
    private String mStatement;
    private int mKey;
    public Cipher(String Statement, int Key) {
        mStatement = Statement;
        mKey = Key;
    }
    public String getStatement() {
        return mStatement;
    }
    public int getKey() {
        return mKey;
    }
    public String isEncrypted() {
        mStatement = "d";
        return mStatement;
    }
}
