package my.work.structural.proxy;

import java.util.Collection;
import java.util.List;

public class ProxyCommandPromptUsingImplementation implements Console {

    private static final Collection<String> RESTRICTED_COMMANDS = List.of("rm", "rmdir", "del");

    private final boolean isAdmin;

    private final Console console;

    public ProxyCommandPromptUsingImplementation(boolean isAdmin) {
        this.isAdmin = isAdmin;
        console = new RegularCommandPrompt();
    }

    @Override
    public boolean executeCommand(String command) {
        return (canExecuteCommand(command) && isCommandSuccessfullyExecuted(command));
    }

    private boolean canExecuteCommand(String command) {
        return (isAdmin || !RESTRICTED_COMMANDS.contains(command));
    }

    private boolean isCommandSuccessfullyExecuted(String command) {
        return console.executeCommand(command);
    }

}
