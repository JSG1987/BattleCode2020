import java.util.Random;


class DrunkWalk
{

    static int rows = 12;
    static int cols = 13;
    
    public static void main(String[]args)
    {
        int rescued = 0;
        int success = 0;
        int trials = 0;
        int flowersKilled = 0;
        //Random rand = new Random();
        // double rand = Math.random();
      
        
    } 
    public void runSim(int r, int s, int t, int fk)// r== rescued, s == success, t== trials, and fk==flowers killed 
    {
        int[][] map = new int[rows][cols];
        
        map = mapIsland( map );
        
    }

    public int[][] mapIsland( int[][] map )
    {
        for ( int i = 0; i < rows; i++ )
        {
            for ( int j = 0; j < cols; j++ )
            {
                if ( i != rows/2 )
                {
                    map[i][j] = 2;
                }
                // center row for path
                else
                {
                    map[i][j] = 0;
                }
            }
        }
        
        return map;
    }

    public char direction()
    {
	    char dir = '@';

        // double rn = (Math random() * 100) + 1;
        
        int rn = (int)(Math.random() * 100) + 1;
   
        // rn = rn*(100 % 100) + 1;
	    if (rn > 0 && rn <= 45)
		    dir = 'F';
	    if (rn > 45 && rn <= 70)
		    dir = 'R';
	    if (rn > 70 && rn <= 80)
		    dir = 'L';
	    if (rn > 80 && rn <= 100)
		    dir = 'B';

  
        return dir;
    }

    void replace(int map[][], int row, int col, int newValue)
    {   
	    map[row][col] = newValue;
    }
    void replaceRow(int map[][], int row, int newValue)
    {
	    for (int c = 0; c < cols; c++)
		    replace(map, row, c, newValue);
    }

    void replaceColumn(int map[][], int col, int newValue)
    {
	    for (int r = 0; r < rows; r++)
		    replace(map, r, col, newValue);
    }
}



