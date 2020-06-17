package com.company;

import java.util.List;

public class toggleAllComand implements Command{

    private List<LearningProcess> processes;

    public toggleAllComand(List<LearningProcess> processes) {
        this.processes = processes;
    }

    @Override
    public void execute() {
        for(LearningProcess p : processes){
            p.toggle();
        }

    }
}
