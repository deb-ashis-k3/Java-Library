package scaler.easy;

public class SpecialSubsequences {
    public static void main(String[] args) {
        String str = "GABG";
        char seq1 = 'A';
        char seq2 = 'G';

        System.out.println(getSubseQuences(str, seq1, seq2));
    }

    static int getSubseQuences(String str, char seq1, char seq2) {

        if (str == null || str.length() == 0)
            return 0;

        int count = 0;
        int totalCount = 0;

        for (int value : str.toCharArray()) {
            if (value == seq1) {
                count++;
            } else if (value == seq2) {
                totalCount += count;
            }
        }
        return totalCount;

    }
}
