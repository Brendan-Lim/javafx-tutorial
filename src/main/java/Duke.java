public class Duke {
    private String commandType;

    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        commandType = determineCommandType(input);
        return "Duke heard: " + input;
    }

    public String getCommandType() {
        return commandType;
    }

    private String determineCommandType(String input) {
        String command = input.strip().split("\\s+", 2)[0].toLowerCase();
        switch (command) {
        case "todo":
        case "deadline":
        case "event":
            return "AddCommand";
        case "mark":
        case "unmark":
            return "ChangeMarkCommand";
        case "delete":
            return "DeleteCommand";
        default:
            return "";
        }
    }
}
