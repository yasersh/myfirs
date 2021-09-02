import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class test {
    @Test
    void itShowFirtEmptyClass(){
        assertArrayEquals( new String[] { "000" ,"000"},displayMinefilde(new String[] {"...", "..."}));
    }

    @Test
    void itsShowCorectNumberOfRows(){
        assertArrayEquals( new String[] { "000" ,"000","000"},displayMinefilde(new String[] {"...", "...","..."}));
    }
    @Test
    void itsShowCorectNumberOfColunms(){
        assertArrayEquals( new String[] { "0000"},displayMinefilde(new String[] {"...."}));
    }







    private String[] displayMinefilde(String[]  input) {
        // do every thing posebel
        String[] result = new String[input.length];
        for (int i = 0 ; i < input.length; i++){
            result [i] = "000";
        }
        return result;
    }
}
