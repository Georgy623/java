class TriangleWithLoops {
    public static void main(String[] args) {
        // Write your code here

        int counter = 1;
        
      
        for(int i = 7; i >= 0; --i)
        {   
            
            for(int x = i; x > 0; --x)
            {
                System.out.print(" ");
            }
           
            for(int y = counter; y > 0; --y)
            {
                System.out.print("T");
     
            }

            counter+=2;

            System.out.println();

        }
    }
}
