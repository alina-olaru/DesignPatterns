package com.company;

//reference / bridge ->job object
public abstract class Employee {
    protected Job job;

    public Employee(Job job) {
        this.job = job;
    }

    abstract public void whatIsMyJob();
}
