package org.example._2023_11_20;

public interface Inter1 {
    void get();
}

enum Level {
    HIGH,
    LOW
}

class Employee {
    private Level level;

    public Employee(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public void checkLevel(Employee employee) {
        if (employee.getLevel() == Level.HIGH) {

        }
    }
}
