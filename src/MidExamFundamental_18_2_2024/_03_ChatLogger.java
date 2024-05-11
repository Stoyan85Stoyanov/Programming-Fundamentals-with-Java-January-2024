package MidExamFundamental_18_2_2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class _03_ChatLogger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> myMessage = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] commandsArray = input.split(" ");
            String command = commandsArray[0];
            String message = commandsArray[1];


            switch (command){

                case "Chat":
                        myMessage.add(message);
                    break;

                case "Delete":
                    if (myMessage.contains(message)) {
                        myMessage.remove(message);
                    }
                    break;

                case "Edit":
                    String editedVersion = commandsArray[2];
                    if (myMessage.contains(message)) {
                        int indexSecond = myMessage.indexOf(message);
                        myMessage.set(indexSecond, editedVersion);
                    }
                    break;

                case "Pin":
                    if (myMessage.contains(message)) {
                        myMessage.remove(message);
                        myMessage.add(message);
                    }
                    break;

                case "Spam":
                    for (int i = 1; i <commandsArray.length; i++) {
                        String text = commandsArray[i];
                        myMessage.add(text);
                    }
                    break;

                default:
                     break;
            }
            input = scanner.nextLine();
        }

        for (String message : myMessage) {
            System.out.println(message);

        }
    }
}
