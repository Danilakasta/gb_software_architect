package com.geekBrains.marchenkods.first.hw.operands;

public enum Priority {
    ZERO(0),
    FIRST(1),
    MINUS_FIRST(-1),
    SECOND(2),
    THIRD(3),
    FOUR(4);
    private int val;

    Priority(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "Priority{" +
                "val=" + val +
                '}';
    }
}
