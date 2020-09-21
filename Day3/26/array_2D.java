class TwoDimArray
{
   public static void main(String[] args)
   {
      // Array of size 4x3 to hold integers.
      int[][] values =
      {
         { 10, 20, 30 ,10}, { 40, 50, 60,10}, { 70, 80, 90 },
         { 11, 21, 31 },{10,20,30}
      };

      // Nested loops to print the array in tabular form.
      for (int row = 0; row < 5; row++)
      {
         for (int col = 0; col < 3; col++)
         {
            System.out.print(values[row][col] + " ");
         }

         System.out.println();    // Print new line.
      }
   }
}