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
public class Student {
    private final int CURRENT_YEAR = 2019;
    private String name;
    private int age;
    private int id;
    private String dob;
    
    public Student(String newName, int newAge, int newId)
    {
        name = newName;
        age = newAge;
        id = newId;
    }
    
    public Student(String newName, String dateOfBirth, int newId)
    {
        name = newName;
        age = calcAgeFromDob(dateOfBirth);
        id = newId;
    }
    
    public Student(String newName, String dateOfBirth, int newAge, int newId)
    {
        name = newName;
        dob = dateOfBirth;
        age = newAge;
        id = newId;
    }
    
    public int calcAgeFromDob(String dateOfBirth)
    {
        int birthYear = Integer.parseInt(dateOfBirth.substring(6));
        return CURRENT_YEAR - birthYear;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
