package nl.obren.sokrates.sourcecode.operations.impl;

import nl.obren.sokrates.sourcecode.operations.StringOperation;

import java.util.List;

public class NoOpsOperation extends StringOperation {
    public NoOpsOperation() {
        super("noops");
    }

    public NoOpsOperation(List<String> params) {
        this();
        this.setParams(params);
    }

    @Override
    public String exec(String input) {
        return input;
    }
}