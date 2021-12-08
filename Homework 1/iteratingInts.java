import java.io.IOException;

public class iteratingInts{
  public static void main(String []args)throws IOException{
    System.out.println("Dati un un nr de la 0 la 9:");

    byte asciiNumber  = (byte) System.in.read();//return 1 byte of info
    int randomNumber = (int)asciiNumber - 48;//'0'=48(ascii)
    //System.out.println( ((Object)randomNumber).getClass().getSimpleName() );

    for(int i=0; i<=randomNumber; i++){
      for(int j=0; j<i; j++){
        System.out.print(i);
        if(j == i-1){ System.out.println(""); }
      }
    }
  }
}
