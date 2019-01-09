import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;


public class GuessMovie {
    public void guessMovie() throws Exception {
        List films = fileToList();
        String movie = selectRandomMovie(films);
        String riddle = convertMovieToUnderscore(movie);
        guessTheMovie(movie, riddle);

    }


    private ArrayList fileToList () throws Exception{
        File file = new File("movies.txt");
        Scanner readFilms = new Scanner(file);
        ArrayList movies = new ArrayList();

        while (readFilms.hasNextLine()){
            String movie = readFilms.nextLine();
            movies.add(movie);
        }
        return movies;
    }


    private String selectRandomMovie(List movies) {
        int randomMovie = (int) (Math.random() * movies.size());
        return (String) movies.get(randomMovie);
    }


    private String convertMovieToUnderscore (String movie){
        String riddle = "";

        for (int i = 0; i < movie.length(); i++){
            riddle += "_";
        }
        return riddle;
    }


    private void guessTheMovie (String movie, String riddle){

        int tries = 10;
        String mistakes = "";
        System.out.println("Welcome to guess the movie, you have 10 attempts to chase it. Good luck!!");
        System.out.println(riddle);

        while (tries > 0){
            System.out.println("Choose one letter:");
            Scanner scanner = new Scanner(System.in);
            String letter = scanner.nextLine();
            if (letter.length() > 1 && letter != movie){
                tries -= 1;
                System.out.println("Error, that's not the correct movie");
                System.out.printf("Try again, you still have %s tries\n", tries);


            }else if (letter == movie){
                System.out.println("Oh! Wonderful, you guess the movie! Great job!!");
                break;

            }
            if (letter.length() == 1){

                if (movie.indexOf(letter) == -1){
                    tries -= 1;
                    mistakes += letter + "," + " ";
                    System.out.printf("Oh! This %s ins't correct\n", letter);
                    System.out.println(mistakes);
                    System.out.printf("You have still %s tries\n", tries);

                }
                else{
                    for (int i = 0; i < movie.length(); i++){
                        riddle = riddle.substring(0,i) + letter + riddle.substring(i + 1, riddle.length());
                        }
                    if (riddle.contains("_")){
                        System.out.println(riddle);
                        System.out.printf("Letters that you have falied %s\n", mistakes);
                    }
                    else{
                        System.out.println("Great job!! Continue");
                        System.out.println(riddle);
                        System.out.printf("Letters that you have falied %s\n", mistakes);

                    }
                }

            }
        }
    }
}
