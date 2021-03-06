package week17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(new String[]{"AC", "ACDE", "BCFG", "CDE"},
                new Solution().solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4}));
        assertEquals(new String[]{"ACD", "AD", "ADE", "CD", "XYZ"},
                new Solution().solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2, 3, 5}));
        assertEquals(new String[]{"WX", "XY"},
                new Solution().solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2, 3, 4}));
    }
}