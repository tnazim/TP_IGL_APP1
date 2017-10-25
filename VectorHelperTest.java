import com.company.DifferentSizeException;
import com.company.VectorHelper;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class VectorHelperTest {
    private VectorHelper test = new VectorHelper();
    @org.junit.Test
    public void sort() throws Exception {
        test.sort();
        int[] expected = {0,1,3,5,6,7,8,12,15,21};
        assertArrayEquals(expected,test.getVector());
    }

    @org.junit.Test
    public void sum() throws Exception {
        int[] toBeSummed = {1,1,1,1,1,1,1,1,1,1};
        int[] expected = {6,7,2,4,13,22,9,16,1,8};
        try {
            test.sum(toBeSummed);
        } catch (DifferentSizeException e) {
            e.printStackTrace();
        }
        assertArrayEquals(expected,test.getVector());
    }

    @org.junit.Test
    public void reverseVector() throws Exception {
        int[] expected = {7,0,15,8,21,12,3,1,6,5};
        test.reverseVector();
        assertArrayEquals(expected,test.getVector());
    }

    @org.junit.Test
    public void formula() throws Exception {
        int[] expected = {10,12,2,6,24,42,16,30,0,14};
        test.formula();
        assertArrayEquals(expected,test.getVector());
    }

    @org.junit.Test
    public void minMax() throws Exception {
        int expected[] = {0,21};
        int returned[] = test.minMax();
        assertArrayEquals(expected,returned);
    }

}