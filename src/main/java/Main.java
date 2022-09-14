import system.KanBanSystem;

public class Main {
    

    public static void main(String[] args){
        System.out.println("Start");

        KanBanSystem kanBanSystem = new KanBanSystem();




        System.out.println("End");
    }
}

/*
Educational KanBan

Each student has a kanban board with default columns  To Do / In Progress / Ready For Review / Graded and a backlog
Teachers create assignments and assign them to a group(class).  They go to the backlog, until the teacher releases them, and they move to do column
The student then moves them through the workflow until it reaches ready for review, in which the teacher will review and grade
Once in graded column, only the teacher can move the task for example if something is regraded


 */
