package board;

import people.Person;

public abstract class KanBanItem {
    private Board board;
    private Status status;
    private Person assignee;
    private Person reporter;
    private String description;
    private String title;


    public KanBanItem(Board board, Status status, Person assignee, Person reporter, String description, String title){
        this.board = board;
        this.status = status;
        this.assignee = assignee;
        this.reporter = reporter;
        this.description =  description;
        this.title = title;
    }

}
