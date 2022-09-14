package system;

import board.Board;
import board.KanBanItem;
import people.Person;

import java.util.LinkedList;
import java.util.List;

public class KanBanSystem {
    public List<Person> users;
    public List<KanBanItem> tickets;
    public List<Board> boards;

    public KanBanSystem(){
        this.users = new LinkedList<Person>();
        this.tickets = new LinkedList<KanBanItem>();
        this.boards = new LinkedList<Board>();
    }

}
