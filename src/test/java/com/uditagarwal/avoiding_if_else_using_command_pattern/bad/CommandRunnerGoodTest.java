package com.uditagarwal.avoiding_if_else_using_command_pattern.bad;

import com.google.common.collect.ImmutableList;
import com.uditagarwal.avoiding_if_else_using_command_pattern.good.CommandRunnerGood;
import com.uditagarwal.avoiding_if_else_using_command_pattern.good.executors.BalanceCommandExecutor;
import com.uditagarwal.avoiding_if_else_using_command_pattern.good.executors.CommandExecutor;
import com.uditagarwal.avoiding_if_else_using_command_pattern.good.executors.RechargeCommandExecutor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.uditagarwal.avoiding_if_else_using_command_pattern.bad.TestHelpers.getTestBalanceCommand;
import static com.uditagarwal.avoiding_if_else_using_command_pattern.bad.TestHelpers.getTestUser;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CommandRunnerGoodTest {

    CommandRunnerGood commandRunnerGood;

    @BeforeEach
    void setUp() {

        ImmutableList<CommandExecutor> commandExecutors = ImmutableList.of(
                new BalanceCommandExecutor(TestHelpers.getTestDatabase()),
                new RechargeCommandExecutor(TestHelpers.getTestDatabase(), TestHelpers.getTestRechargeProvider())
        );

        commandRunnerGood = new CommandRunnerGood(commandExecutors);
    }

    @Test
    void testBalanceCheck() {
        String balance = commandRunnerGood.runCommand(getTestBalanceCommand(ImmutableList.of(getTestUser())));
        assertEquals("1000", balance);
    }


}