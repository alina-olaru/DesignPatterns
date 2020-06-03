package com.company;

public class SoftwareEngineer extends Employee {
    public SoftwareEngineer(Job job) {
        super(job);
    }

    @Override
    public void whatIsMyJob() {
        System.out.println("(SoftwareEngineer)I am a ");
        job.whatIsMyJob();
    }
}
