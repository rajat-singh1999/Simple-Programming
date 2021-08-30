public class ReverseStringUsingRecursion {

    public static void main(String[] args) {
        String str = "I am A Science Student!";
        String reversed = recursiveFunction(str);
        System.out.println("Reversed: " + reversed);
    }

    public static String recursiveFunction(String str)
    {
        if (str.isEmpty())
            return str;

            return recursiveFunction(str.substring(1)) + str.charAt(0);
    }
}