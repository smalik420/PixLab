public class IntArrayWorker
{
  /** two dimensional matrix */
	private int[][] matrix = null;
  
  /** set the matrix to the passed one
    * @param theMatrix the one to use
    */
	public void setMatrix(int[][] theMatrix)
	{
		matrix = theMatrix;
	}
  
	public int getCount(int target)
	{
		int total = 0;
		for (int row = 0; row < matrix.length; row++)
		{
		  for (int col = 0; col < matrix[0].length; col++)
		  {
				if (matrix[row][col] == target)
					total++;
		  }
		}
		
		return total;  
	}
  
  
  public int getLargest()
  {
	  int highest = matrix[0][0];
	  
	  for (int row = 0; row < matrix.length; row++)
	  {
		  for (int column = 0; column < matrix[0].length; column++)
		  {
			  if (matrix[row][column] > highest)
				highest = matrix[row][column];
		  }
	  }
	  
	  return highest;
  }
  
  public int getColTotal(int columnNum)
  {
	int total = 0;
	for(int i = 0; i < matrix.length; i++) 
	{
		int row[] = matrix[i]; 
		int temp = row[columnNum]; 
		total += temp; 

	} 
	return total;
  }
  
 public void reverseRows()
{
    for (int i = 0 ; i < matrix.length ; i++) 
    {     
        int[] reversed = new int[matrix[i].length]; 
        for(int j = 0 ; j < matrix[i].length ; j++) 
        {
            reversed[reversed.length - 1 - j] = matrix[i][j]; 
        }
        matrix[i] = reversed;
    }
}
  
  
  /**
   * Method to return the total 
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[row].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }

  
  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  /** 
   * fill the array with a pattern
   */
  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; 
           col++)
      {
        if (row < col)
          matrix[row][col] = 1;
        else if (row == col)
          matrix[row][col] = 2;
        else
          matrix[row][col] = 3;
      }
    }
  }
 
}
