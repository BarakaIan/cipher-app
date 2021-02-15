package models;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DecodeTest {
    @Test
    public void runEncryption_ifInputIsString() {
        Encode testEncryption = new Encode("abc",3);
        assertEquals("abc", testEncryption.getmInputString());
    }

    @Test
    public void runDecrypt_ifKeyIsInt() {
        Encode testEncrypt = new Encode("abc",3);
        assertEquals(3, testEncrypt.getmShift());
    }
//
//    @Test
//    public void runDecrypt_ifDecryptsVariousInputs() {
//        Decode testDecryption = new Decode("!ODCB EURZQ IRA MXPSV RYHU D ODCB GRJ2", 3);
//        assertEquals("!fA@? Bliqh Fi> dogjm ipEl A fA@? DiG2", Decode.decrypt(testDecryption));
//    }

    }


