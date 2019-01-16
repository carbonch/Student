/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredesign;

/**
 *
 * @author Christopher
 */
public class StudentMain {
    public static void main(String[] args)
    {
        Student[] studentList = new Student[3];
        studentList[0] = new Student("Chris", 19, 1);
        studentList[1] = new Student("Sommer", 21, 2);
        studentList[2] = new Student("Bassam", 27, 3);
    }
}
