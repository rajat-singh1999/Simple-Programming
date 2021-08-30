public class BizareStringManip
{
    public static String reverseString(String str)
    {  
        char ch[]=str.toCharArray();  
        String rev="";  
        for(int i=ch.length-1;i>=0;i--)
        {  
            rev+=ch[i];  
        }  
        return rev;  
    }

    public static String bizare(String str)
    {
        String w="", nstr="";
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)==' ' || str.charAt(i)=='.')
            {
               if(w.length()%2==0)
               {
                   w=reverseString(w);
               }
               nstr = nstr+" "+w;
               w="";
            }
            else
            {
                w=w+str.charAt(i);
            }
        }
        
        return nstr;
    }
    
    public static void main(String args[])
    {
        String str = "I am a Student of Computer Science.";
        String nstr = bizare(str);
        System.out.println(nstr);
    }
}
