package AssociativeArraysLambdaAndStreamAPIExercise;

import java.util.*;

public class ForceBook09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> teamsMap = new LinkedHashMap<>();
        while (!input.equals("Lumpawaroo")){
            if (input.contains("|")){
                String team = input.split(" \\| ")[0];
                String player = input.split(" \\| ")[1];
                if (!teamsMap.containsKey(team)){
                    teamsMap.put(team, new ArrayList<>());
                    // засега само добавяме новия отбор, но преди да добавим плейра,
                    // проверяваме дали го има в друг отбор:
                }
                boolean isExist = false;
                for (List<String> playersTeams: teamsMap.values() ) {
                    // проверяваме само листа с играчите, не целия мап
                    if (playersTeams.contains(player)){
                        isExist = true;
                        break;
                    }
                }
                if (!isExist){
                    teamsMap.get(team).add(player);
                }

            } else if (input.contains("->")) {
                String player = input.split(" -> ")[0];
                String team = input.split(" -> ")[1];

                teamsMap.entrySet().forEach(entryTeam -> entryTeam.getValue().remove(player));
                // ако го има играча някъде, го премахваме, защото той ще се мести в друг отбор

                if (!teamsMap.containsKey(team)) {
                    // ако няма такъв отбор...
                    teamsMap.put(team, new ArrayList<>());
                    teamsMap.get(team).add(player);
                } else { // ако има такъв отбор...
                    teamsMap.get(team).add(player);
                }
                System.out.printf("%s joins the %s side!%n", player, team);
            }
            input = scanner.nextLine();
        }
        teamsMap.entrySet().stream().filter(teamEntry -> teamEntry.getValue().size() > 0) // принтирай ми от мапа само отборите, които имат играчи
                .forEach(entry -> {
                            System.out.printf("Side: %s, Members: %s%n", entry.getKey(), entry.getValue().size()); //Side: {forceSide}, Members: {forceUsers.Count}
                entry.getValue().forEach(entryPlayer -> System.out.println("! " + entryPlayer)); // принтираме играчите във всеки отбор
                });
    }
}
