class GFG {

    static int swapBits(int n)
    {
        for (int i = 0; i < 32; i += 2) {
            
             // find i th bit
            int i_bit = (n >> i) & 1;
            
            // find i+1 th bit
            int i_1_bit
                = (n >> (i + 1)) & 1; 
            
            // remove i_bit
            n = n - (i_bit << i) 
            
            // remove i+1 th bit
                - (i_1_bit << (i + 1)) 
                
            // put i_bit at i+1 location        
                + (i_bit   << (i + 1)) 
                
                // put i+1 bit at i location   
                + (i_1_bit << i); 
        }
        return n;
    }
    public static void main(String[] args)
    {
        int n = 23;
        System.out.print(swapBits(n));
    }
}
