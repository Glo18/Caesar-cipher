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
    @Test
    public void newCipher_substituteLetter_d() {
        Cipher testCipher = new Cipher("d", 3);
        assertEquals("d", testCipher.toEncrypt("d", 3));
    }
    @Test
    public void newCipher_substituteLetterByKey_d(){
        Cipher testCipher = new Cipher("d", 3);
        assertEquals("g",testCipher.isEncrypted("d", 3));
    }
    @Test
    public void newCipher_substituteMultipleLettersByKeys_abc(){
        Cipher testCipher = new Cipher("abc", 3);
        assertEquals("def",testCipher.toDecrypt("def",3));
    }
    @Test
    public void newCipher_encryptAStringByKey_ab(){
        Cipher testCipher = new Cipher("yz", 2);
        assertEquals("ab",testCipher.isDecrypted("yz",2));
    }
    @Test
    public void newCipher_decryptAStringByKey_yz(){
        Cipher testCipher = new Cipher("ab", 2);
        assertEquals("yz",testCipher.toDecrypt("ab", 2));
    }
}
