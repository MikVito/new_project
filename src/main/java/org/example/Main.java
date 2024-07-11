package org.example;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1234, "Vito");
        User user2 = new User(1234, "Vito");
        User user3 = new User(1231, "Dana");
        System.out.println(user1.isEqual(user2));
        System.out.println(user2.isEqual(user3));
    }
}

class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isEqual(User user) {
        return id == user.getId() && name.equals(user.getName());
    }
}

