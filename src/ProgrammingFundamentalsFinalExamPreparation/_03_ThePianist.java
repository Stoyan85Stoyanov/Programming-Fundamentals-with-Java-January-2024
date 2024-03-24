package ProgrammingFundamentalsFinalExamPreparation;

import java.util.*;

public class _03_ThePianist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> pieceMap = new LinkedHashMap<>();
        Map<String, String> keyPiece = new LinkedHashMap<>();

        int countPisces = Integer.parseInt(scanner.nextLine());

        for (int piece = 0; piece < countPisces; piece++) {
            String[] pieceParts = scanner.nextLine().split("\\|");

            String pieceName = pieceParts[0];
            String composer = pieceParts[1];
            String key = pieceParts[2];

            pieceMap.put(pieceName, composer);
            keyPiece.put(pieceName, key);

        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")){
            String [] commandParts = command.split("\\|");
            String commandName = commandParts [0];

            switch (commandName) {
                case "Add":
                    String newPieceName = commandParts[1];
                    String composer = commandParts[2];
                    String key = commandParts[3];

                    if (pieceMap.containsKey(newPieceName)) {
                        System.out.printf("%s is already in the collection!%n", newPieceName);

                    } else {
                        pieceMap.put(newPieceName, composer);
                        keyPiece.put(newPieceName, key);
                        System.out.printf("%s by %s in %s added to the collection!%n", newPieceName, composer, key);
                    }
                    break;

                case "Remove":
                    String pieceForRemove = commandParts[1];

                    if (pieceMap.containsKey(pieceForRemove)) {
                        pieceMap.remove(pieceForRemove);
                        System.out.printf("Successfully removed %s!%n", pieceForRemove);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceForRemove);
                    }
                    break;

                case "ChangeKey":
                    String pieceName = commandParts[1];
                    String newKey = commandParts[2];

                    if (!pieceMap.containsKey(pieceName)) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);

                    } else {
                        keyPiece.put(pieceName, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", pieceName, newKey);
                    }
                    break;
            }
        command = scanner.nextLine();

        }
        for (String piece : pieceMap.keySet()) {
            String composer = pieceMap.get(piece);
            String key = keyPiece.get(piece);

            System.out.printf("%s -> Composer: %s, Key: %s%n", piece, composer, key);
        }
    }
}

