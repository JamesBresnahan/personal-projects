


public class fibonacci {
    public static int run(int position)
    {
        int result;
        
        if (position==0) {
            result= 0;
            return result;
	    }

        if (position==1) {
            result = 1;
            return result;
        }

        else {
            result = run(position-2)+run(position-1);
            return result;
        }
    }
    public static void main (String[] args) {
        System.out.println(run(5));
    }
}