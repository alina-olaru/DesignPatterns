package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LearningProcess java = new LearningProcess();
        LearningProcess html = new LearningProcess();
        LearningProcess advancedMath = new LearningProcess();
        SwitchLearningState switchLearningState = new SwitchLearningState();

        LearningCommand learningCommand = new LearningCommand(java);
//        switchLearningState.storeAndExecute(learningCommand);
//        switchLearningState.storeAndExecute(learningCommand);
//        switchLearningState.storeAndExecute(learningCommand);
//        switchLearningState.storeAndExecute(learningCommand);
//        switchLearningState.storeAndExecute(learningCommand);
//        switchLearningState.storeAndExecute(learningCommand);
//        switchLearningState.storeAndExecute(learningCommand); switchLearningState.storeAndExecute(learningCommand);
//        switchLearningState.storeAndExecute(learningCommand); switchLearningState.storeAndExecute(learningCommand);
//        switchLearningState.storeAndExecute(learningCommand); switchLearningState.storeAndExecute(learningCommand);

        List<LearningProcess> learningProcesses = new ArrayList<>();
        learningProcesses.add(java);
        learningProcesses.add(html);
        learningProcesses.add(advancedMath);


        Command toggleAllCommand = new toggleAllComand(learningProcesses);
        switchLearningState.storeAndExecute(toggleAllCommand);
        switchLearningState.storeAndExecute(learningCommand);
        switchLearningState.storeAndExecute(learningCommand);
        switchLearningState.storeAndExecute(learningCommand);
        switchLearningState.storeAndExecute(learningCommand);
        switchLearningState.storeAndExecute(toggleAllCommand);






    }
}
