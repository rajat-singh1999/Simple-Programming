public class CountVowels
{
    public static int recurseCountVowels(String str, int i, int c)
    {
        if(i==str.length()-1)
            return c;
        else
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {    
                c++;    
            }
            return recurseCountVowels(str,i+1,c);
        }
    }
    public static void main(String[] args) {    
            
        int c = 0;    

        String str = "2020 was a very simple year.";    
            
        str = str.toLowerCase();
        System.out.println(recurseCountVowels(str,0,0));   
            
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {    
                c++;    
            }    
        }    
        System.out.println("Number of vowels: " + c);    
    }    
}   