package PK;

import java.util.Arrays;
import java.util.Collections;
public class main {
    public static void main(String[] args) {
        Forme[] formes = {
            new Cercle(0, 0, 5),
            new Cercle(2, 3, 7),
            new Cylindre(1, 1, 4, 6),
            new Cylindre(5, 5, 3, 8)
        };

        System.out.println("Informations avant le tri :");
        for (Forme forme : formes) {
            forme.afficherInfo();
            System.out.println();
        }

        Arrays.sort(formes);

        System.out.println("Informations après le tri par surface :");
        for (Forme forme : formes) {
            forme.afficherInfo();
            System.out.println();
        }

        formes = Arrays.copyOf(formes, formes.length + 1);
        formes[formes.length - 1] = new Cercle(3, 3, 6);

        formes = Arrays.copyOfRange(formes, 1, formes.length);

       Collections.reverse(Arrays.asList(formes));
        }
    }
