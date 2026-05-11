package my.work.structural.proxy;

import java.util.Collection;
import java.util.List;

public class ProxyCommandPromptUsingExtension extends RegularCommandPrompt {

    private static final Collection<String> RESTRICTED_COMMANDS = List.of("rm", "rmdir", "del");

    private final boolean isAdmin;

    public ProxyCommandPromptUsingExtension(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public boolean executeCommand(String command) {
        return (canExecuteCommand(command) && isCommandSuccessfullyExecuted(command));
    }

    private boolean canExecuteCommand(String command) {
        return (isAdmin || !RESTRICTED_COMMANDS.contains(command));
    }

    private boolean isCommandSuccessfullyExecuted(String command) {
        return super.executeCommand(command);
    }

}
