import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Potato {
  static int counter = 0;
  static Potato[] all = new Potato[10];
  String plantDate;
  int id;



  Potato(){
    counter++;
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    plantDate = sdf.format(cal.getTime());
    id = counter;
    // System.out.format("Potato planted on %s", plantDate);
  }

  public static void main(String[] args){
    Potato one = new Potato();
    Potato two = new Potato();
    Potato three = new Potato();
    Potato[] all = {one, two, three};

    System.out.println(all[2].id);
  }
}
