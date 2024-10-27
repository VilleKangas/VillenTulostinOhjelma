public class TulostinOhjelma {
    public static void main(String[] args) {
        // 2. Tulostetaan "Hei olen Tulostin-ohjelma"
        System.out.println("Hei olen Tulostin-ohjelma");

        
        System.out.print("Ohjelman tekijä: ");

        // 4. Alustetaan tekija-muuttuja ja asetetaan sen arvoksi oma nimi
        String tekija = "Ville Kangas";

        // 5. Tulostetaan tekija-muuttujan arvo samalla rivillä
        System.out.println(tekija);

        // 6. Alustetaan kaksi numeerista muuttujaa luku1 ja luku2
        int luku1 = 5;
        int luku2 = 2;

        // 7. Tulostetaan luku1-muuttujan arvo
        System.out.println("Luku1-muuttujan arvo on " + luku1);

        // 8. Tulostetaan "Luku1-muuttujan arvo on 5" (tai mikä arvo luku1:lla onkaan)
        System.out.println("Luku1-muuttujan arvo on " + luku1);

        // 9. Tulostetaan luku2-muuttujan arvo
        System.out.println("Luku2-muuttujan arvo on " + luku2);

        // 10. Alustetaan tulo-muuttuja
        int tulo;

        // 11. Kerrotaan luku1 ja luku2, ja sijoitetaan tulos tulo-muuttujaan
        tulo = luku1 * luku2;

        // 12. Tulostetaan kertolaskun tulos
        System.out.println(luku1 + " * " + luku2 + " = " + tulo);

        // 13. Erotus, summa ja jako

        // Erotus
        int erotus = luku1 - luku2;
        System.out.println(luku1 + " - " + luku2 + " = " + erotus);

        // Summa
        int summa = luku1 + luku2;
        System.out.println(luku1 + " + " + luku2 + " = " + summa);

        // Jako (huomioi desimaalit)
        double jako = (double) luku1 / luku2;  // Muutetaan luku1 ja luku2 double-tyypiksi
        System.out.println(luku1 + " / " + luku2 + " = " + jako);

        // 14. Muutetaan muuttujien alustuksia loogisemmaksi
        // Siirretään muuttujien alustukset koodin alkuun.
        int luku3 = 10;
        int luku4 = 5;
        double tulo2 = (double) luku3 * luku4; // Tämä laskutoimitus käyttää doublea
        System.out.println(luku3 + " * " + luku4 + " = " + tulo2);

        // 15. Ohjelma valmis!
    }
}
