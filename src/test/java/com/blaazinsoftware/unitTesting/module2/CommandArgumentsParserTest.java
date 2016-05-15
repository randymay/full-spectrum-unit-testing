package com.blaazinsoftware.unitTesting.module2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Randy May
 *         Date: 2016-05-12
 */
public class CommandArgumentsParserTest {

    private CommandArgumentsParser parser = new CommandArgumentsParser();

    @Test(expected = InvalidKeyException.class)
    public void testInvalidKey() throws Exception {
        parser.parseArguments(
                "-fileName", "/scripts/script1",
                "-dbName", "DATABASE",
                "-invalid", "SERVER",
                "-userName", "USER",
                "-password", "PASSWORD");
    }

    @Test(expected = MissingKeyException.class)
    public void testMissingUserName() throws Exception {
        CommandArguments arguments = parser.parseArguments(
                "-fileName", "/scripts/script1",
                "-dbName", "DATABASE",
                "-serverName", "SERVER",
                "-password", "PASSWORD");

        assertEquals(arguments.getUserName(), "USER");
    }
}