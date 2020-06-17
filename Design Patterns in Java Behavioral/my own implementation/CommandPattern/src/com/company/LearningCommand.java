package com.company;

public class LearningCommand implements Command {

    private LearningProcess learningProcess;

    public LearningCommand(LearningProcess learningProcess) {
        this.learningProcess = learningProcess;
    }

    @Override
    public void execute() {
        learningProcess.toggle();
    }
}
