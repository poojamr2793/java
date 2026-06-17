class GfG {

    static int findPosition(int n)
    {
        // Check if n has exactly one set bit
        if (n == 0 || (n & (n - 1)) != 0)
            return -1;

        int pos = 1;
        int val = 1;
        while ((val & n) == 0) {
            // Shifting left
            val = val << 1;
            pos++;
        }
        return pos;
    }

    // Main function
    public static void main(String[] args)
    {
        int n = 2;
        System.out.println(findPosition(n));
    }
}
