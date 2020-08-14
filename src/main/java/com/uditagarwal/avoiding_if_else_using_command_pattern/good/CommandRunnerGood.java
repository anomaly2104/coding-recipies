package com.uditagarwal.avoiding_if_else_using_command_pattern.good;

import com.uditagarwal.avoiding_if_else_using_command_pattern.good.executors.CommandExecutor;
import com.uditagarwal.avoiding_if_else_using_command_pattern.other.Command;

import java.util.List;

public class CommandRunnerGood {

    List<CommandExecutor> commandExecutors;

    public CommandRunnerGood(List<CommandExecutor> commandExecutors) {
        this.commandExecutors = commandExecutors;
    }

    public String runCommand(Command command) {
        for (CommandExecutor commandExecutor: commandExecutors) {
            if (commandExecutor.isApplicable(command)) {
                return commandExecutor.execute(command);
            }
        }

        return "Invalid Command";
    }
}
