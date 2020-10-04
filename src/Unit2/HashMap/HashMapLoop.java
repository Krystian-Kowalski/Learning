package Unit2.HashMap;

import java.util.*;
import java.lang.*;

class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private Map<String , List<Integer>> studentGradeParametersMap;
        // Jeśli nie ma wartości dodaj listę do danego klucza a potem i tak dodaj Inty grades
        public void addGrade(String subject, Integer grade) {
        if(studentGradeParametersMap.get(subject) == null) {
            studentGradeParametersMap.put(subject, new ArrayList<>());
        }
            studentGradeParametersMap.get(subject).add(grade);
    }

    //pobrać Listę i wyciągnąć z niej średnią


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName);
    }

    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}


class HashMapLoop
{
    static void main (String[] args) throws java.lang.Exception {
        Double sum = 0d;


//        HashMap<String, Integer> piotrGrades = new HashMap<>();
//        piotrGrades.put("Maths", 4);
//        piotrGrades.put("Biology", 1);
//        piotrGrades.put("IT", 4);
//        piotrGrades.put("English", 4);
//
//        for(Integer grade : piotrGrades.values()) {
//            sum += grade;
//        }
//        System.out.println("The average grade is: " + sum / piotrGrades.values().size());
    }
}