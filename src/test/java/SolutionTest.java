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
        char target = 'z';
        char output = 'x';
        Assert.assertEquals(output, new Solution().nextGreatestLetter(letters, target));
    }

    @Test
    public void nextGreatestLetterTest4() {
        char[] letters = {'c', 'f', 'j', 'm', 'n', 'p', 'q', 's', 'z'};
        char target = 'y';
        char output = 'z';
        Assert.assertEquals(output, new Solution().nextGreatestLetter(letters, target));
    }

    @Test
    public void binarySearchTest1() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        int output = 0;
        Assert.assertEquals(output, new Solution().binarySearch(letters, target));
    }
}
