package com.company;

public class Teacher extends Employee {
    public Teacher(Job job) {
        super(job);
    }

    @Override
    public void whatIsMyJob() {
        System.out.println("(Teacher)I am a ");
        job.whatIsMyJob();
    }
}
