package com.uditagarwal.avoiding_if_else_using_command_pattern.bad;

import com.uditagarwal.avoiding_if_else_using_command_pattern.other.Database;
import com.uditagarwal.avoiding_if_else_using_command_pattern.other.RechargeProvider;
import com.uditagarwal.avoiding_if_else_using_command_pattern.other.Command;

public class CommandRunnerBad {
    final Database database;
    final RechargeProvider rechargeProvider;

    public CommandRunnerBad(Database database, RechargeProvider rechargeProvider) {
        this.database = database;
        this.rechargeProvider = rechargeProvider;
    }

    String runCommand(Command command) {
        if ("balance".equals(command.getName())) {
            if (command.getParams().size() != 1) {
                return "Invalid Command";
            }
            String user = command.getParams().get(0);
            return database.getUsreBalance(user).toString();
        } else if ("recharge".equals(command.getName())) {
            if (command.getParams().size() != 2) {
                return "Invalid Command";
            }
            String user = command.getParams().get(0);
            Integer rechargeAmount = Integer.parseInt(command.getParams().get(1));

            Integer userBalance = database.getUsreBalance(user);
            if (userBalance < rechargeAmount) {
                return "Not sufficient balance";
            }
            rechargeProvider.recharge(user, rechargeAmount);
            return "Recharge Done";
        } else {
            return "Invalid command";
        }
    }
}
