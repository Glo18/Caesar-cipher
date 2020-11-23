package models;

import org.junit.*;

import java.security.Key;
import java.sql.Statement;

import static org.junit.Assert.*;
public class CipherTest {
    @Test
    public void newCipher_instantiatesCorrectly() {
        Cipher testCipher = new Cipher("d", 3);
        assertEquals(true, testCipher instanceof Cipher);
    }

    @Test
    public void newCipher_readsAString_d() {
        Cipher testCipher = new Cipher("d", 3);
        assertEquals("d", testCipher.getStatement());
    }

    @Test
    public void newCipher_readsKey_3() {
        Cipher testCipher = new Cipher("d", 3);
        assertEquals(3, testCipher.getKey());
    }
}
