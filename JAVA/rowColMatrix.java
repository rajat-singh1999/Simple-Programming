public class rowColMatrix
{
    public static void main(String args[])
    {
        String[][] strMatrix = new String[8][8];

        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                strMatrix[i][j] = i +"," + j;
            }
        }

        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                System.out.print(strMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }   
}
