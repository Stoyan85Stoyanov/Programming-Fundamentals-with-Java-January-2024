package MapsLambdaAndStreamAPI_MoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_MOBA_Challenger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> playerPool = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"Season end".equals(input)) {
            if (input.contains(" -> ")) {
                String[] inputArgs = input.split(" -> ");
                String player = inputArgs[0];
                String position = inputArgs[1];
                int skill = Integer.parseInt(inputArgs[2]);

                playerPool.putIfAbsent(player, new LinkedHashMap<>());
                playerPool.get(player).putIfAbsent(position, skill);

                if (playerPool.get(player).get(position) < skill) {
                    playerPool.get(player).put(position, skill);
                }

            } else if (input.contains(" vs ")) {
                String[] inputArgs = input.split(" vs ");
                String firstPlayer = inputArgs[0];
                String secondPlayer = inputArgs[1];

                if (playerPool.containsKey(firstPlayer) && playerPool.containsKey(secondPlayer)) {
                    if (playerPool.get(firstPlayer).keySet().stream().anyMatch(playerOnePosition -> playerPool.get(secondPlayer).containsKey(playerOnePosition))) {
                        int totalPointsPlayerOne = playerPool.get(firstPlayer).values().stream().mapToInt(Integer::intValue).sum();
                        int totalPointsPlayerTwo = playerPool.get(secondPlayer).values().stream().mapToInt(Integer::intValue).sum();

                        if (totalPointsPlayerOne > totalPointsPlayerTwo) {
                            playerPool.remove(secondPlayer);
                        } else if (totalPointsPlayerTwo > totalPointsPlayerOne) {
                            playerPool.remove(firstPlayer);
                        }

                    }

                }
            }
            input = scanner.nextLine();
        }

        playerPool.entrySet()
                .stream()
                .sorted((p1, p2) -> {
                    int result = Integer.compare(p2.getValue().values().stream().mapToInt(i -> i).sum(),
                            p1.getValue().values().stream().mapToInt(i -> i).sum());
                    if (result == 0) {
                        result = p1.getKey().compareTo(p2.getKey());
                    }
                    return result;
                })
                .forEach(entry -> {
                    System.out.printf("%s: %d skill%n", entry.getKey(), entry.getValue().values().stream().mapToInt(i -> i).sum());
                    entry.getValue()
                            .entrySet()
                            .stream()
                            .sorted((e1, e2) -> {
                                int result1 = Integer.compare(e2.getValue(), e1.getValue());
                                if (result1 == 0) {
                                    result1 = e1.getKey().compareTo(e2.getKey());
                                }
                                return result1;
                            })
                            .forEach(e -> {
                                System.out.printf("- %s <::> %d%n", e.getKey(), e.getValue());
                            });
                });

    }
}
