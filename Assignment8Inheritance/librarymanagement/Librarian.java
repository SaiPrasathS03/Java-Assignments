package com.zoho.librarymanagement;

public class Librarian {
    private String name;
    private String id;
    private String password;

    public Librarian(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public void verifyLibrarian() {
        System.out.println("Verifying librarian " + name + " with ID " + id);
    }

    public void search(String searchString) {
        System.out.println("Searching for: " + searchString);
    }
}
