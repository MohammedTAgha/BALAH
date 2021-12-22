package com.company;

public class Exam3 {
    public static void main(String[] args) {
        String hasExam ="yes";
        String hasLecture ="no";
        String LectureCanseld ="no";

        if(hasExam.equals("yes")){
            System.out.println("go to University");
        }else {
            if(hasLecture.equals("yes")){
                if (LectureCanseld.equals("yes")){
                    System.out.println("go to University");
                }else {
                    System.out.println("Stay in home");
                }
            }
        }
    }
}
