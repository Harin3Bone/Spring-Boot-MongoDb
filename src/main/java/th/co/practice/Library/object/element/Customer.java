package th.co.practice.Library.object.element;

import java.util.UUID;

public class Customer extends Person {
    public Customer(UUID uuid, String firstName, String lastName, String identity, String password) {
        super(uuid, firstName, lastName, identity, password);
    }
}
