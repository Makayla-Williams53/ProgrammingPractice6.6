public class Main
{
    public static void main(String[] args)
    {
        int[][] table = new int[5][5];


        //pattern 1
        for(int row = 0; row < table.length; row++)
        {
            for(int col = 0; col < table[row].length; col++)
            {
                table[row][col] = col;
            }
        }

        printTable(table);

        System.out.println();

        //pattern 2
        for(int row = 0; row < table.length; row++)
        {
            for(int col = 0; col < table[row].length; col++)
            {
                table[row][col] = row;
            }
        }

        printTable(table);

        System.out.println();

        //pattern
        int countDown = 0;

        for(int row = 1; row <= table.length; row++)
        {
            for(int col = 0; col < table[row - 1].length; col++)
            {
                table[row - 1][col] = (row * 5) - countDown;
                countDown++;
            }
            countDown = 0;
        }

        printTable(table);

    }//end main method

    public static void printTable(int[][] table)
    {
        for(int row = 0; row < table.length; row++)
        {
            for(int col = 0; col < table[row].length; col++)
            {
                System.out.print(table[row][col] + "\t");
            }
            System.out.println();
        }
    }//end printTable method

}//end class Main
