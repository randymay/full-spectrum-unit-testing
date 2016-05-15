package com.blaazinsoftware.unitTesting.module1;

/**
 * @author Randy May
 *         Date: 2016-05-12
 */
public class CommandArgumentsParser {
    public CommandArguments parseArguments(String... args) {
        CommandArguments arguments = new CommandArguments();

        for (int index = 0; index < args.length; index++) {
            String value = args[index];

            if (value.startsWith("-")) {
                // Value is a key
                String nextArgument = null;

                // Get the value
                if (index + 1 < args.length) {
                    nextArgument = args[index + 1];
                    if (nextArgument.startsWith("-")) {
                        // Next argument is a key, so the value
                        // for the current key is null
                        nextArgument = null;
                    }
                }

                Argument key = Argument.getValue(value);
                arguments.put(key, nextArgument);
            }
        }

        return arguments;
    }
}
