package SamplePrograms;

import org.junit.Test;

import static SamplePrograms.Program1.isReallyMax;
import static SamplePrograms.Program1.max;
import static org.junit.Assert.assertEquals;

public class Program1Test {

    @Test
    public void testMax(){
        isReallyMax(5);
        /*
        *
        *
        *
        *
        *
         */
        assertEquals(5, max(5, 4));
    }

    @Test
    public void testFail(){
        assertEquals(6,  max(5, 6));
    }

    public static class Program2Test{
        @Test
        public void testAnother(){
            isReallyMax(5);
            assertEquals(5, max(5, 4));
        }
    }
}
