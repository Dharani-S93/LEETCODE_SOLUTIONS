class Solution {
    private int count = 0;

    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26]; // Array to store frequency of letters

        // Count frequency of each character in tiles
        for (char ch : tiles.toCharArray()) {
            freq[ch - 'A']++;
        }

        backtrack(freq);
        return count; 
    }

    private void backtrack(int[] freq) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) { // If this letter is available
                count++; // Count this sequence
                freq[i]--; // Use this letter
                
                backtrack(freq); // Recursively find other sequences
                
                freq[i]++; // Backtrack (restore frequency)
            }
        }
    }
}
