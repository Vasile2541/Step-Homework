import java.io.IOException;

public class vocaleIfElse{
  public static void main(String[] args) throws IOException {

    System.out.println("Verifica daca litera este vocala:");
    char charr      = (char) System.in.read();
    char upperCharr = Character.toUpperCase(charr);

    if(upperCharr == 'A'){
       System.out.println(charr + ": Este o vocala;");
    }
    else if(upperCharr == 'E'){
      System.out.println(charr + ": Este o vocala;");
    }
    else if(upperCharr == 'I'){
      System.out.println(charr + ": Este o vocala;");
    }
    else if(upperCharr == 'O'){
      System.out.println(charr + ": Este o vocala;");
    }
    else if(upperCharr == 'U'){
      System.out.println(charr + ": Este o vocala;");
    }
    else{
      System.out.println(charr + ": Este o consoana;");
    }

  }
}