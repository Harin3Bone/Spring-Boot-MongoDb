package th.co.practice.Library.object.element;

import th.co.practice.Library.object.define.PersonLevel;

import java.util.UUID;

public class Person {
    private UUID uuid = UUID.randomUUID();
    private String firstName;
    private String lastName;
    private String identity;
    private String password;
    private PersonLevel level;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PersonLevel getLevel() {
        return level;
    }

    public void setLevel(PersonLevel level) {
        this.level = level;
    }

    public Person(){

    }

    public Person(UUID uuid, String firstName, String lastName, String identity, String password, PersonLevel level) {
        this.uuid = uuid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identity = identity;
        this.password = password;
        this.level = level;
    }
}
