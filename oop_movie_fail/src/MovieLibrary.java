public class MovieLibrary {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.title = "Forrest Gump";
        movie.description = "Historia życia Forresta, chłopca o niskim ilorazie inteligencji " +
                "z niedowładem kończyn, który staje się miliarderem i bohaterem wojny w Wietnamie.";
        movie.director = "Robert Zemeckis";
        movie.rating = 9;
        movie.maxRating = 10;
        movie.oscars = true;

        System.out.println("Informacje o filmie:");
        System.out.println("Tytuł: " + movie.title);
        System.out.println("Opis: " + movie.description);
        System.out.println("Reżyser: " + movie.director);
        System.out.println("Ocena: " + movie.rating + '/' + movie.maxRating);
        System.out.println("Czy otrzymał Oskara: " + movie.oscars);
        //Komentarz dodany aby byla zmiana w kodzie.
    }
}
