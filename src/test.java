import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class test {
    @Test
    void itShowFirtEmptyClass(){
        assertArrayEquals( new String[] { "000" ,"000"},displayMinefilde(new String[] {"...", "..."}));
    }

    private String displayMinefilde(String[]  input) {
        return new String[0];
    }
}
