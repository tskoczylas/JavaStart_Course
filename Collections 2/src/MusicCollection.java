import org.w3c.dom.ls.LSOutput;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MusicCollection {
    public static void main(String[] args) {
        List<Song> songs = List.of(
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("No One", 248, "Alicia Keys", Song.Genre.POP),
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("Believer", 216, "Imagine Dragons", Song.Genre.ROCK),
                new Song("Fear of The Dark", 438, "Iron Maiden", Song.Genre.METAL),
                new Song("Enter Sandman", 346, "Metallica", Song.Genre.METAL),
                new Song("The Unforgiven", 348, "Metallica", Song.Genre.METAL),
                new Song("Girl on Fire", 404, "Alicia Keys", Song.Genre.POP)
        );
        System.out.println("Lączny czas muzyki w gatunku " + Song.Genre.POP + ":" + countLenghtbyGenre(songs, Song.Genre.POP) + "s");
        String artist="Metallica";
        System.out.println("Laczna liczba piosenek zespołu  " + artist + ": " +countSongsbyArtist(songs,artist));
        System.out.println("Piosneki bez gatunku: " + Song.Genre.POP + ": "  );
        printSongsWithoutGenre(songs, Song.Genre.POP);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

    }
    private static void printSongsWithoutGenre(List<Song> songs, Song.Genre genre) {
         songs.stream()
                .filter(s -> s.getGenre()!= genre)
                .distinct()
                .forEach(System.out::println);
    }

    private static long countSongsbyArtist(List<Song> songs,String artist) {
        return songs.stream()
                .filter(s -> s.getArtist() == artist)
                .count();}


    private static int countLenghtbyGenre(List<Song> songs,Song.Genre genre) {
       return songs.stream()
               .filter(s -> s.getGenre() == genre)
               .mapToInt(Song::getLength)
                .sum();

    }
}