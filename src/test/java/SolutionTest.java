import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void nextGreatestLetterTest1() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char output = 'c';
        Assert.assertEquals(output, new Solution().nextGreatestLetter(letters, target));
    }

    @Test
    public void nextGreatestLetterTest2() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char output = 'c';
        Assert.assertEquals(output, new Solution().nextGreatestLetter(letters, target));
    }

    @Test
    public void nextGreatestLetterTest3() {
        char[] letters = {'x', 'x', 'y', 'y'};
        char target = 'c';
        char output = 'f';
        Assert.assertEquals(output, new Solution().nextGreatestLetter(letters, target));
    }
}
