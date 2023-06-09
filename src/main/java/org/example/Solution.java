package org.example;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int index = binarySearch(letters, target);
        if (index > letters.length - 1) {
            return letters[0];
        } else if (letters[index] == target) {
            while (letters[index] == target && index < letters.length - 1) {
                index++;
            }
            return letters[index] == target ? letters[0] : letters[index];
        } else return letters[index];
    }

    public int binarySearch(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (letters[mid] == target) {
                return mid;
            }
            if (target < letters[mid]) {
                right = mid - 1;
            }
            if (target > letters[mid]) {
                left = mid + 1;
            }
        }
        return left;
    }
}
