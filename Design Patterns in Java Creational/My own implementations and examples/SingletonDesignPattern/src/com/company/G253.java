package com.company;

import java.util.List;

public class G253 {
    private static volatile G253 instance = null;
    List<Student> students;

    private G253(List<Student> students) {
        this.students = students;
    }

    private G253(){
        try{

        }catch (Exception e){
            e.printStackTrace();
        }

        if(instance!=null){
            throw new RuntimeException("There is already an instance , use getInstance method!!");
        }
    }

    public static G253 getInstance(){
        if(instance==null){
            synchronized (G253.class){
                if(instance==null){
                    instance = new G253();
                }
            }
        }
        return instance;
    }

    public static G253 getInstance(List<Student> students){
        if(instance==null){
            synchronized (G253.class){
                if(instance==null){
                    instance = new G253(students);
                }
            }
        }
        return instance;
    }
}
