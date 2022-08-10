package com.github.appachey.jrtb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.appachey.jrtb.command.CommandName.HELP;
import static com.github.appachey.jrtb.command.HelpCommand.HELP_MESSAGE;

@DisplayName("Unit-level testing for help command")
public class HelpCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return HELP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return HELP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new HelpCommand(sendBotMessageService);
    }
}
