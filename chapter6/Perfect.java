public class Perfect {
    public static void main (String args[]) {
        int max=1000;
        for(int i = 2; i <= max; ++i)
        if(perfect(i) == true)
        System.out.println("The number "+i+" is true");
    }
    public static boolean perfect(int n) {
            int sum = 1;
      boolean result = false;
      for (int j = 2; j <= n/2; j++)
         if (n % j == 0)
            sum += j;
         if (sum == n)
            result = true;
      return result;
    }
}
