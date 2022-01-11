package com.step;

import com.step.menu.Menu;

import java.util.Scanner;

public class Main {
    private static Menu show = new Menu();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean oneMoreTime;
        boolean innerOneMoreTime;
        do {
            show.menu();
            oneMoreTime = false;
            try {
                    int input = sc.nextInt();   sc.nextLine();
                    switch (input){
                        case 1:
                            show.menuProduct();
                            do {
                                show.menuProduct();
                                innerOneMoreTime = false;
                                try {
                                    int input2 = sc.nextInt();   sc.nextLine();
                                    switch (input2) {
                                        case 1:
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                        case 5:
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("\t\tAvailable input (one to six)!, Enter to continue:");
                                            innerOneMoreTime =true;
                                            sc.nextLine();
                                    }
                                }catch (Exception e)
                                 {
                                    System.out.print ("\n\t/// *****Please enter an available input !!");
                                    System.out.println("\t(Available inputs are from one to three) *****///");
                                    sc.nextLine();
                                    oneMoreTime = true;
                                }
                            }while( innerOneMoreTime );

                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("\t\tAvailable input (one to three)!, Enter to continue");
                            sc.nextLine();
                            oneMoreTime = true ;
                    }

            }catch (Exception ex)
             {
                System.out.print ("\n\t/// *****Please enter an available input !!");
                System.out.println("\t(Available inputs are from one to three) *****///");
                sc.nextLine();
                oneMoreTime = true;
            }
    }while( oneMoreTime );

//        Sarcina practica pentru lectia de astazi.
//        ProductStore
//        Aplicatia care gestioneaza informatie despre Produse. Campurile
//        produsului sunt:
//        - denumirea produsului
//            - pretul (zecimal)
//            - producatorul(String)).
//
//
//
//        La lansarea aplicatiei, trebuie sa se initializeze 5 produse in
//        memorie (automat, nu e nevoie de introducere de la tastatura).
//            La ecran sa se afiseze un meniu principal cu 3 optiuni.
//        1 Product info
//        2 Total price
//        3 Exit
//        De la tastatura, utilizatorul trebuie sa aleaga o optiune.
//
//
//
//        1. Product info: Vizualizarea informatiei despre un produs.
//        Utilizatorul apasa 1 apoi de la tastatura introduce numarul produsului
//        care trebuie vizualizat. (1-5).
//            Daca introduce pozitie gresita este rugat sa introduca din nou.
//            Dupa vizualizarea informatiei despre produs, se afiseaza meniul
//            principal.
//        2. Total price - Vizualizarea pretului total pentru toate produsele
//        disponibile.
//        3. Exit - Iesire daca introduce.
//        La introducerea unei optiuni gresite in meniul principal, sa i se
//        afiseze un mesaj la ecran "Ati introdus o optiune incorecta. Incercati
//        din nou."
//
//
    }
}
