class HaystackAndNeedle {

    static boolean substringExists(String s1, String s2)
	{
		int M = s1.length();
		int N = s2.length();

		for (int i = 0; i <= N - M; i++) {
			int j;

            for (j = 0; j < M; j++)
				if (s2.charAt(i + j)!= s1.charAt(j))
					break;

			if (j == M)
				return true;
		}

		return false;
	}

    public static void main(String args[])
	{
		String needle = "lo Wo";
		String haystack = "Hello World!";

		boolean res = substringExists(needle, haystack);

		if (res)
			System.out.println("Present in haystack!");
		else
            System.out.println("Not present");
	}
}