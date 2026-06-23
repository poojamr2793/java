class GfG {
    
    static String URLify(String s) {

        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            
            // if " " is encountered, 
	        // append "%20" to string
            if (s.charAt(i) ==' ') {
                result.append("%");
                result.append("2");
                result.append("0");
            } 
            
            // else append the current 
		    // character.
            else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "i love programming";
        System.out.println(URLify(s));
    }
}
