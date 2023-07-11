public class NoZerosForHeros {

    public int noBoringZeros(int n) {
        String digits = String.valueOf(n).replaceAll("0+$", "");
        int number = digits.equals("") ? 0 : Integer.parseInt(digits);
        return number;
    }
}
