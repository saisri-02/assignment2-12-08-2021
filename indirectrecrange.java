import java.util.*;
public class Indirectrecrange
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
funA(n);
}
static void funA(int n)
{
if(n>=1)
{
funB(n-1);
System.out.println(n+" ");
}
}
static void funB(int n)
{
if(n>=1)
{
funA(n-1);
System.out.println(n+" ");
}
}
}

output:

10
1 2 3 4 5 6 7 8 9 10 