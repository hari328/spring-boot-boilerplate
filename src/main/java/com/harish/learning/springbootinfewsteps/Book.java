package com.harish.learning.springbootinfewsteps;

public class Book {
    private long id;
    private String name;
    private String author;

    public Book(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + this.id + "'" +
            ", name='" + getName() + "'" +
            ", author='" + getAuthor() + "'" +
            "}";
    }

}