import java.util.Map;
import java.util.HashMap;

public class Farm {
  Cell[] cells;

  Farm(int rows, int cols){
    int counter = 0;
    cells = new Cell[rows * cols];

    for(int y = 0; y < rows; y++){
      for(int x = 0; x < cols; x++){
        cells[counter] = new Cell(x,y);
        counter++;
      }
    }

  }

  public void plant(Potato potato){
    int counter = 0;

    Cell cell = cells[0];

    while(cell.potato != null){
      counter++;
      cell = cells[counter];
    }

    cell.potato = potato;
  }


  public static void main(String[] args){
    Farm farm = new Farm(10,10);
    for(int i = 0; i < 100; i++){
      System.out.println("Farm x: " + farm.cells[i].x);
    }

    // Cell newCell = new Cell(1,1);
    // System.out.println(newCell.x);
  }
}
