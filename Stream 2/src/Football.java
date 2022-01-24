import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Football {
    public static void main(String[] args) {
        List<Match> setteams= List.of(
                new Match("Poland","Germany",0,1),
                new Match("England","Italy",1,1),
                new Match("Spain","Italy",2,0),
                new Match("Poland","Italy",2,2),
                new Match("Sweeden","Austria",1,5),
                new Match("France","Portugal",3,3),
                new Match("Poland","Chroatia",1,1),
                new Match("Sweeden","Austria",1,6),
                new Match("Andora","Italy",1,5),
                new Match("Hungary","Bulgaria",3,1)
        );

        Stream<Match> footballstream = Stream.of(
                new Match("Poland","Germany",0,1),
                new Match("England","Italy",1,1),
                new Match("Spain","Italy",2,0),
                new Match("Poland","Italy",2,2),
                new Match("Sweeden","Austria",1,5),
                new Match("France","Portugal",3,3),
                new Match("Poland","Chroatia",1,1),
                new Match("Sweeden","Austria",1,6),
                new Match("Andora","Italy",1,5),
                new Match("Hungary","Bulgaria",3,1)
        );

        String footballTeam="Andora";



        allMaches(setteams);
        System.out.println(">>>");
        findandPrintTeam(setteams, footballTeam);
        System.out.println(">>>");
        countTeams(setteams);
        System.out.println(">>>");
        System.out.println("Goals in match: " + getGoals(setteams));






    }

    private static int getGoals(List<Match> setteams) {
        Stream<Match> countGoals= setteams.stream();
        int sum = countGoals
                .mapToInt(Match::getSummaryGoals)
                .sum();

        return sum;
    }


    private static void countTeams(List<Match> setteams) {

        Stream<Match> countHomeTeams= setteams.stream();
    long count =  countHomeTeams
                .map(Match::getTeamsNames)
            .flatMap(Arrays::stream)
             .distinct()
            .count();
        System.out.println("Temas in game: " + count );
    }

    private static void findandPrintTeam(List<Match> setteams, String footballTeam) {
        System.out.println("Team " + footballTeam + " maches:" );
        Stream<Match> findTeams= setteams.stream();
        findTeams.filter(m->m.containTeam(footballTeam))
        .forEach(System.out::println);
    }

    private static void allMaches(List<Match> setteams) {
        System.out.println("All maches:");
        Stream<Match> sortetTeams= setteams.stream();
        sortetTeams.sorted(Comparator.comparingInt(Match::getGoalDifference)).forEach(System.out::println);
    }


}
