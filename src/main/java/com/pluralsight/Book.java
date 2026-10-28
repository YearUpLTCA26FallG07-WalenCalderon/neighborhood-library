package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private boolean isCheckedOut;
    private String checkedOutTo;
    private String title;


    public Book(int id, String isbn, boolean isCheckedOut, String checkedOutTo, String title) {
        this.id = id;
        this.isbn = isbn;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
        this.title = title;
    }

    public void checkOut(String name) {
        if (!isCheckedOut) {
            isCheckedOut = true;
            checkedOutTo = name;
        } else {
            System.out.println("This book is already checked out!");
        }
    }


    public void checkIn(){
        if(isCheckedOut){
            isCheckedOut = false;
            checkedOutTo = "";
        } else{
            System.out.println("This book is already checked in");
        }
    }


    //Getters and Setters------------------------------------------------------------|
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
