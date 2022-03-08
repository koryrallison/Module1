package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

    public String getLetterGrade(){
        int gradePoint = (earnedMarks / possibleMarks) * 100;

        String letterGrade = "";
        if (gradePoint >= 90){
            letterGrade = "A";
            return letterGrade;
        }
        if (gradePoint >= 80){
            letterGrade = "B";
            return letterGrade;
        }
        if (gradePoint >= 70){
            letterGrade = "C";
            return letterGrade;
        }
        if (gradePoint >= 60) {
            letterGrade = "D";
        }
        else {
            letterGrade = "F";
        }
        return letterGrade;

    }

    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

}
