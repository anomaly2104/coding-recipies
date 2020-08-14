package com.uditagarwal.avoiding_if_else_using_command_pattern.bad;

import com.uditagarwal.avoiding_if_else_using_command_pattern.other.Database;
import com.uditagarwal.avoiding_if_else_using_command_pattern.other.RechargeProvider;
import com.uditagarwal.avoiding_if_else_using_command_pattern.other.Command;

import java.util.List;

public class TestHelpers {

    static public Database getTestDatabase() {
        return new Database();
    }

    static public RechargeProvider getTestRechargeProvider() {
        return new RechargeProvider();
    }

    static public String getTestUser() {
        return "test-user";
    }

    static public Command getTestBalanceCommand(List params) {
        return new Command("balance", params);
    }

    static public Command getTestRechargeCommand(List params) {
        return new Command("recharge", params);
    }
}
