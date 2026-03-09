public class Main {

   public static void main(String []args) {
     
      // *** 2D ARRAY DATA STRUCTURE ***
      // like an Array, but a GRID with
      // ROWS (horizontal) & COLUMNS (vertical)

      // DECLARE a 2D array with double square brackets
      int[][] experimentData; // null (empty)
      double[][] pointValues;

      // CREATE a 2D array, call constructor
      experimentData = new int[10][3]; // 10 rows, 3 cols

      // INITALIZE a 2D array (declare + create)
      String[][] seatingChart = new String[4][6];
      // total number of items? 4 * 6 = 24

      // SET A VALUE by accessing a cell
      // ACCESS a cell: arrayName[row][col]
      seatingChart[0][0] = "Caleb";
      seatingChart[0][5] = "Caleb2";
      // 6 cols -> but 5 is FINAL INDEX!!!
      seatingChart[1][0] = "Caleb3";
      seatingChart[1][5] = "Caleb4";
      seatingChart[2][1] = "Caleb5";
      seatingChart[2][3] = "Caleb6";
      seatingChart[2][4] = "Caleb7"; // second to last col
      seatingChart[3][0] = "Caleb8";

      // Shortcut: INITIALIZER LISTS
      // use double curly brackets to set values
      // for a 2D array right away
      String[][] bingo = {
                        {"!", "A", "11"},
                        {"$", "<3", ":)"},
                        {",", "20", "x"}
                         };
// Look at new array
System.out.println(bingo); // no built-in tpString
// have to use a loop or access individual idtems
System.out.println(bingo[0][0]);
System.out.println(bingo[1][1]); //heart
System.out.println(bingo[1][2]); //smiley




   }
}
