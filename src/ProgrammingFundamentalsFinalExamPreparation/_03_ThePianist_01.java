package ProgrammingFundamentalsFinalExamPreparation;

import java.util.*;

public class _03_ThePianist_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> pieceMap = new HashMap<>();

        int countPisces = Integer.parseInt(scanner.nextLine());

        for (int piece = 0; piece < countPisces ; piece++) {
            String [] pieceParts = scanner.nextLine().split("\\|");

            String pieceName = pieceParts [0];
            String composer = pieceParts [1];
            String key = pieceParts [2];

            List <String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer);
            pieceInfo.add(key);
            pieceMap.put(pieceName, pieceInfo);

        }

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Stop")) {
                break;
            }
            String [] commandParts = command.split("\\|");
            String commandName = commandParts [0];

            switch (commandName){
                case "Add":
                    String newPieceName = commandParts [1];
                    String composer = commandParts [2];
                    String key = commandParts [3];

                    if (pieceMap.containsKey(newPieceName)){
                        System.out.printf("%s is already in the collection!%n", newPieceName);


                    }else {
                        List<String> newPieceInfo = new ArrayList<>();
                        newPieceInfo.add(composer);
                        newPieceInfo.add(key);
                        pieceMap.put(newPieceName, newPieceInfo);
                        System.out.printf("%s by %s in %s added to the collection!%n", newPieceName, composer, key);
                    }
                    break;

                case "Remove":
                    String pieceForRemove = commandParts [1];

                    if (pieceMap.containsKey(pieceForRemove)){
                        pieceMap.remove(pieceForRemove);
                        System.out.printf("Successfully removed %s!%n", pieceForRemove);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceForRemove);
                    }
                    break;

                case "ChangeKey":
                    String pieceName = commandParts [1];
                    String newKey = commandParts [2];

                    if (!pieceMap.containsKey(pieceName)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);

                    }else {
                        List<String> currentPieceInfo = pieceMap.get(pieceName);

                        currentPieceInfo.remove(1);
                        currentPieceInfo.add(newKey);
                        pieceMap.put(pieceName, currentPieceInfo);
                        System.out.printf("Changed the key of %s to %s!%n", pieceName, newKey);
                    }
                    break;
            }

        }

        pieceMap.entrySet().stream().sorted((e1, e2) -> {

            if (e1.getKey().compareTo(e2.getKey()) == 0) {
                return e1.getValue().get(0).compareTo(e2.getValue().get(0));
            }
            return e1.getKey().compareTo(e2.getKey());

        }).forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));

        }
    }










