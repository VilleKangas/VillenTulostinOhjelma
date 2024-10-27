public class TulostinOhjelma {
    public static void main(String[] args) {
        // Tulostetaan ohjelman tervehdys
        System.out.println("Hei olen Tulostin-ohjelma");

        // Tulostetaan tekijän nimi samalla rivillä
        System.out.print("Ohjelman tekijä: ");
        String tekija = "Ville Kangas";
        System.out.println(tekija);

        // Alustetaan muuttujat
        int luku1 = 5;
        int luku2 = 2;
        int luku3 = 10;
        int luku4 = 5;

        // Tulostetaan muuttujien arvot ja laskutoimitusten tulokset
        System.out.println("Luku1-muuttujan arvo on " + luku1);
        System.out.println("Luku2-muuttujan arvo on " + luku2);

        int tulo = luku1 * luku2;
        System.out.println(luku1 + " * " + luku2 + " = " + tulo);

        int erotus = luku1 - luku2;
        System.out.println(luku1 + " - " + luku2 + " = " + erotus);

        int summa = luku1 + luku2;
        System.out.println(luku1 + " + " + luku2 + " = " + summa);

        double jako = (double) luku1 / luku2;
        System.out.println(luku1 + " / " + luku2 + " = " + jako);

        // Lisälaskutoimitukset uusilla muuttujilla
        double tulo2 = (double) luku3 * luku4;
        System.out.println(luku3 + " * " + luku4 + " = " + tulo2);
    }
}
