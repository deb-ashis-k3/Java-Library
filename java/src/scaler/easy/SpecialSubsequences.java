package scaler.easy;

public class SpecialSubsequences {
    public static void main(String[] args) {
        SpecialSubsequences specialSubsequences = new SpecialSubsequences();
        String str = "GABCGAG";
        System.out.println(specialSubsequences.solve(str));

    }

    public long solve(String str) {
        if (str.length() < 0 || str == null)
            return 0;
        long response = 0;
        int tempCount = 0;
        for (char value : str.toCharArray()) {
            if (value == 'A') {
                tempCount++;
            } else if (value == 'G') {
                response += tempCount;
            }
        }
        return response;
    }
}
