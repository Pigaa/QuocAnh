/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PIGA
 */
import java.util.ArrayList;
public class StudentList extends ArrayList<Student> {
    public StudentList() {
        super();
    }

    public Student search(String code) {
        code = code.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equals(code))
                return this.get(i);
        }
        return null;
    }

    private boolean isCodeDuplicated(String code) {
        code = code.trim().toUpperCase();
        return search(code) != null;
    }

    public void addStudent() {
        String newCode, newName;
        int newMark;
        boolean codeDuplicated = false;

        do {
            newCode = Inputter.inputPattern("Student code (e.g., S001): ", "[S]\\d{3}");
            newCode = newCode.trim().toUpperCase();
            codeDuplicated = isCodeDuplicated(newCode);

            if (codeDuplicated)
                System.out.println("Code is duplicated!");
        } while (codeDuplicated);

        newName = Inputter.inputNonBlankStr("Name of new student: ");
        newName = newName.toUpperCase();
        newMark = Inputter.inputInt("Mark (0..10): ", 0, 10);

        Student student = new Student(newCode, newName, newMark);
        this.add(student);
        System.out.println("Student " + newCode + " has been added.");
    }

    public void searchStudent() {
        if (this.isEmpty())
            System.out.println("Empty list. No search can be performed!");
        else {
            String sCode = Inputter.inputStr("Input student code for search: ");
            Student student = this.search(sCode);
            if (student == null)
                System.out.println("Student " + sCode + " doesn't exist!");
            else
                System.out.println("Found: " + student);
        }
    }

    public void updateStudent() {
        if (this.isEmpty())
            System.out.println("Empty list. No update can be performed!");
        else {
            String uCode = Inputter.inputStr("Input code of updated student: ");
            Student student = this.search(uCode);
            if (student == null)
                System.out.println("Student " + uCode + " doesn't exist!");
            else {
                String oldName = student.getName();
                String msg = "Old name: " + oldName + ", new name: ";
                String newName = Inputter.inputNonBlankStr(msg);
                student.setName(newName);

                int oldMark = student.getMark();
                msg = "Old mark: " + oldMark + ", new mark (0..10): ";
                int newMark = Inputter.inputInt(msg, 0, 10);
                student.setMark(newMark);

                System.out.println("Student " + uCode + " has been updated.");
            }
        }
    }

    public void removeStudent() {
        if (this.isEmpty())
            System.out.println("Empty list. No remove can be performed!");
        else {
            String rCode = Inputter.inputStr("Input code of removed student: ");
            Student student = this.search(rCode);
            if (student == null)
                System.out.println("Student " + rCode + " doesn't exist!");
            else {
                this.remove(student);
                System.out.println("Student " + rCode + " has been removed.");
            }
        }
    }

    public void printAll() {
        if (this.isEmpty())
            System.out.println("Empty list!");
        else {
            System.out.println("Student list:");
            for (Student student : this) {
                System.out.println(student);
            }
            System.out.println("Total: " + this.size() + " student(s).");
        }
    }
}

    
