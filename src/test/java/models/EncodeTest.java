package models;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EncodeTest {

    @Test
    public void runEncode_ifInputIsString() {
        Encode testEncode = new Encode("abc", 3);
        assertEquals("abc", testEncode.getmInputString());
    }

    @Test
    public void runDecode_ifKeyIsInt() {
        Encode testEncode = new Encode("abc", 3);
        assertEquals(3, testEncode.getmShift());
    }

    //    @Test
//    public void runEncode_oneCharacter(){
//        Encode testEncode = new Encode("f", 3);
//        assertEquals(3, testEncode.getmInputString());
////    }
//    @Test
//    public void runDecode_oneCharacter_includeUpperCAse() {
//        Decode testDecode = new Decode("F", 1);
//        assertEquals(1, testDecode.getmInputString());
//    }
}
//    }
//    @Test
//    public void runEncode_oneCharacter_encodedExceedsRangeRightShiftA_Z(){
//        Encode testEncode = new Encode("b", 4);
//        assertEquals(4, testEncode.runEncode());
//    }
//

