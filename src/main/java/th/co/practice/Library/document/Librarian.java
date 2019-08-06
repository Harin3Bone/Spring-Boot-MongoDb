package th.co.practice.Library.document;

import java.util.UUID;

public class Librarian extends Person{
    public Librarian() {

    }

    public Librarian(UUID uuid, String firstName, String lastName, String username, String password) {
        super(uuid, firstName, lastName, username, password);
    }
}
