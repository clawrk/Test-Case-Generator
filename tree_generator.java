import java.util.*;

public class tree_generator {
    
    public static void prufer_code_to_tree(int[] a , int n)
    {
        // System.out.println(9769);
        int node = n+2;
        int[] f = new int[n+12];
        for(int i=0;i<n+12;i++) f[i]=0;
        for(int i=0;i<n;i++)
        {
            f[a[i]]++;
        }
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i=0;i<node;i++)
        {
            
            if(f[i]==0)
            {
                // System.out.println("this is not in the prufers code:" + i);
                set.add(i);
            }
        }
        
        for(int i=0;i<n;i++)
        {
            // int p,q;
            int p = a[i];
            int q = set.pollLast();   // the minimium weighted node in the treeset is retrieved and removed  . 
            System.out.println("Edge number : " + (i+1));
            System.out.println("edge from : " + p + " to  " +  q);
            f[p]--;
            if(f[p]==0) set.add(p);
        }
        Integer p = set.pollFirst() , q= set.pollLast();
        System.out.println("edge from : " + p + " to  " +  q);
    }
    
    public static void main(String args[]) {
        int n;
		System.out.println("Enter the number size of prufer code array.");
        Scanner obj =new Scanner(System.in);
        n = obj.nextInt();
        int[] a = new int[n+2];
        Random rand = new Random();
        for(int i=0;i<n;i++)
        {
            a[i] = rand.nextInt(n+2)%(n+2);
            // System.out.println("This is in the prufer code : " + a[i]);
        }
        prufer_code_to_tree(a,n);
    }
}
