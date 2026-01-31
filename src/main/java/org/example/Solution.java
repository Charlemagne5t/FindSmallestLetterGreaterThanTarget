package org.example;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int r = letters.length - 1;
        int mid;
        int res = -1;
        while(l <= r) {
            mid = l + ( r - l) / 2;
            if(letters[mid] > target) {
                r = mid - 1;
            }else {
                res = mid;
                l = mid + 1;
            }
        }

        return res == letters.length - 1 ? letters[0] : letters[res + 1];
    }
}
