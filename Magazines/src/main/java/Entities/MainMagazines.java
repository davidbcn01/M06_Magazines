package Entities;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Entities.*;


public class MainMagazines {

    public static void main(String[] args) {
        ArrayList<Revista> revistes = new ArrayList();
        FileAccessor fa;
        boolean a = false;
        Menu menu = new Menu();
        int opcio;
        while (!a) {
        opcio = menu.menuPral();

            switch (opcio) {

                case 1:

                    System.out.println("1!!");
                    fa = new FileAccessor();
                    try {
                        fa.readAutorsFile("src/main/java/Entities/autors.txt");
                        fa.printAutors();
                        fa.readMagazinesFile("src/main/java/Entities/revistes.txt");
                        fa.printRevistes();
                        revistes = fa.readArticlesFile("src/main/java/Entities/articles.txt");
                        mostraRevistes(revistes);
                    } catch (NumberFormatException | IOException e) {

                        e.printStackTrace();
                    }
                    break;
                case 2:

                    seleccionaRevista(revistes);
                    break;
                default:
                    System.out.println("Adeu!!");
                    System.exit(1);
                    break;

            }

        }
    }
    public static void mostraRevistes(ArrayList<Revista> revistes){
        for (int i = 0; i < revistes.size(); i++) {

            System.out.println(revistes.get(i).toString());
            for (int j = 0; j < revistes.get(i).getArticles().size(); j++) {
                System.out.println("\t"+ revistes.get(i).getArticle(j).toString());
                System.out.println("\t\t"+revistes.get(i).getArticle(j).getAutor().toString());
            }

        }
    }

    public static Revista seleccionaRevista(ArrayList<Revista> revistes){
        System.out.println(revistes);
       //mostraRevistes(revistes);
       Scanner sc = new Scanner(System.in);
       System.out.println("Selecciona la revista que es vol visualitzar");
       int op = sc.nextInt();
        System.out.println(revistes.get(op-1));


        return null;

    }
    public static Article seleccionaArticle(Revista revista){
        //TODO

        return null;

    }



}
