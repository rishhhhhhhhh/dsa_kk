import java.util.*;

class Main 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
        int n , c = 0 ;
        n = sc.nextInt() ;
        if(n<10)
        {
            System.out.println(n) ;
            System.exit(0);
        }
        int t , j ;
        String s = "" ;
        while(n>0)
        {
            t = n%10+48 ;
            s += (char)t ;
            n /= 10 ;
            c++ ;
        }
        StringBuilder s1 = new StringBuilder(s);
        char temp , temp1 ;
        j = c-1 ;
        for(int i = 0 ; i<c/2 ; i++)
        {
            temp = s1.charAt(j) ;
            temp1 = s1.charAt(i) ;
            s1.setCharAt(j , temp1) ;
            s1.setCharAt(i , temp) ;
            j-- ;
        }
        for(int i = 0 ; i<c ; i+=2)
        {
            if((i+1) == c) break ;
            j = i+1 ;
            temp = s1.charAt(j) ;
            temp1 = s1.charAt(i) ;
            s1.setCharAt(j , temp1) ;
            s1.setCharAt(i , temp) ;
        }
        System.out.println(s1) ;
	}
}