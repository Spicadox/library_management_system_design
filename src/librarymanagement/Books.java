package librarymanagement;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author samph
 */
public class Books extends Product {

    private int numBooks;
    private ArrayList<Books> books = new ArrayList<Books>();

    /**
     * constructor that takes book's name, cost, and number in stock
     *
     * @param name
     * @param cost
     * @param numInStock
     */
    public Books(String name, Double cost, int numInStock) {
        super(name, cost, numInStock);
    }

    /**
     * Method that gets the amount of different books in array
     *
     * @return
     */
    public int getNumBooks() {
        numBooks = books.size();
        return numBooks;
    }

    /**
     * Method that sets the number of books in stock
     *
     * @param numBooks
     */
    public void setNumBooks(int numBooks) {
        this.numBooks = numBooks;
    }

    /**
     * Method that adds the books to array list
     *
     * @param books
     */
    public void add(Books books) {
        this.books.add(books);
    }

    /**
     * Method to remove the books from the array list if completed and used in
     * program
     *
     * @param books
     */
    public void removeBook(Books books) {
        this.books.remove(books);
    }

}
