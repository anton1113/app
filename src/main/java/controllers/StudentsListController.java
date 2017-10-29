package controllers;

import supplementary.Student;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ApplicationScoped
public class StudentsListController implements Serializable {

    private List<Student> students;

    public StudentsListController() {
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @PostConstruct
    public void init() {
        loadStudents();
    }

    private void loadStudents() {
        students = new ArrayList<Student>();
        students.add(new Student("Anton", "Rasshchektaiev", "anton11131113@gmail.com"));
        students.add(new Student("Mary", "Public", "mary@luv2code.com"));
        students.add(new Student("John", "Doe", "john@luv2code.com"));
        students.add(new Student("Ajay", "Rao", "ajay@luv2code.com"));
    }
}
