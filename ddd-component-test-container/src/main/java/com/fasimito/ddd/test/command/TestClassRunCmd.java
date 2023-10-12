package com.fasimito.ddd.test.command;

import com.fasimito.ddd.test.TestsContainer;

public class TestClassRunCmd extends AbstractCommand {
    private String className;

    public TestClassRunCmd(String cmdRaw) {
        super(cmdRaw);
        this.className = cmdRaw;
    }

    @Override
    protected void action() {
        try {
            TestsContainer.getTestExecutor().execute(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getClassName() {
        return className;
    }
}
