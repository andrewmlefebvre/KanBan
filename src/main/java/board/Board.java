package board;

import people.Instructor;
import people.Person;
import people.Student;

import java.util.LinkedList;
import java.util.List;

public class Board {
    private String name;
    private List<Student> students;
    private List<Instructor> instructors;
    private Instructor owner;
    private List<KanBanItem> tickets;

    public Board(String name, Instructor owner){
        this.name = name;
        this.owner = owner;
        this.students = new LinkedList<>();
        this.instructors = new LinkedList<>();
        this.tickets = new LinkedList<>();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void addInstructor(Instructor instructor){
        this.instructors.add(instructor);
    }

    public List<KanBanItem> getTicketOnBoard(){
        return this.tickets;
    }
}
