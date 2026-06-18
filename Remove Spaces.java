class GfG {

    static String removeSpaces(String s) {
        int n = s.length();
        int i = 0, itr = 0;
    
        // convert string to character array
        char[] arr = s.toCharArray();
    
        // Iterate through the string
        while (i < n) {
            
            // Check if current character 
            // is not a space
            if (arr[i] != ' ') {
                
                // Copy the non-space character 
                // to the new string
                arr[itr++] = arr[i];
            }
            i++;
        }
    
        // Return only the modified part of the string 
        // without any extra characters
        return new String(arr, 0, itr);
    }

    public static void main(String[] args) {
        String s = "g  eeks   for ge  eeks  ";
        System.out.print(removeSpaces(s));
    }
}
