package th.co.practice.Library.document;

import java.util.UUID;

public class Customer extends Person{
    public Customer(UUID uuid, String firstName, String lastName, String username, String password) {
        super(uuid, firstName, lastName, username, password);
    }

    public Customer() {

    }
}
