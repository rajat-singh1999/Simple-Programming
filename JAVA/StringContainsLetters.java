class StringContainsLetters {

	public static boolean onlyDigits(String str, int n)
	{

        for (int i = 0; i < n;i++)
        {
			if (!Character.isDigit(str.charAt(i)))
            {
				return false;
			}
		}
		return true;
	}

    public static boolean recurseOnlyDigits(String str, int n, int i)
    {
        if(i==n-1)
            return true;
        else{
            if(!Character.isDigit(str.charAt(i)))
                return false;
            else
                return recurseOnlyDigits(str,n,i+1);
        }
    }

	public static void main(String args[])
	{
		String str = "1234";
		int len = str.length();

		System.out.println(onlyDigits(str, len));
        System.out.println(recurseOnlyDigits(str, len, 0));
	}
}
