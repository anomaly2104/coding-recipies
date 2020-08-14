package com.uditagarwal.avoiding_if_else_using_command_pattern.bad;

import com.google.common.collect.ImmutableList;
import com.uditagarwal.avoiding_if_else_using_command_pattern.other.Database;
import com.uditagarwal.avoiding_if_else_using_command_pattern.other.RechargeProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.uditagarwal.avoiding_if_else_using_command_pattern.bad.TestHelpers.getTestBalanceCommand;
import static com.uditagarwal.avoiding_if_else_using_command_pattern.bad.TestHelpers.getTestUser;
import static org.junit.jupiter.api.Assertions.*;

class CommandRunnerBadTest {

    CommandRunnerBad commandRunnerBad;

    @BeforeEach
    void setUp() {
        commandRunnerBad = new CommandRunnerBad(new Database(), new RechargeProvider());
    }

    @Test
    void testBalanceCheck() {
        String balance = commandRunnerBad.runCommand(getTestBalanceCommand(ImmutableList.of(getTestUser())));
        assertEquals("1000", balance);
    }


}