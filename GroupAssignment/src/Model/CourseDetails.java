package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naved
 */
public class CourseDetails {
    
    
    private String CourseName;
    private String ProfessorName;
    private String NoOfCredits;
    private String ClassType;     // Lecture, Lab
    private String Semester;
    private String Status;        // Registration Status

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getProfessorName() {
        return ProfessorName;
    }

    public void setProfessorName(String ProfessorName) {
        this.ProfessorName = ProfessorName;
    }

    public String getNoOfCredits() {
        return NoOfCredits;
    }

    public void setNoOfCredits(String NoOfCredits) {
        this.NoOfCredits = NoOfCredits;
    }

    public String getClassType() {
        return ClassType;
    }

    public void setClassType(String ClassType) {
        this.ClassType = ClassType;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
    
    
    
}
