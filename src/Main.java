import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            try {
                met();
            } catch (RuntimeException e) {
                System.out.println(" пишите число больше 1 число.");
            }
            finally {
                System.out.println();
                System.out.println(" Finish ! ");
            }

    }

        public static  void met (){
            Scanner scanner = new Scanner( System.in);
            int number = scanner.nextInt();
              if ( number > 1) {
                  int count = 1;
                  for (int i = 1; i <= number; i++) {
                      count *= i;
                      System.out.println(i + "!  " + count);
                  }
              } else if (number < 1 ){
                  throw new RuntimeException(" number меньше число 1 . ");
              }
    }

}