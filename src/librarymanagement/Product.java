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
public abstract class Product {

    private String name;
    private Double cost;
    private Boolean isInStock;
    private int numInStock;

    private ArrayList<Books> books = new ArrayList<>();
    private ArrayList<CDs> CDs = new ArrayList<>();

    /**
     * Product constructor
     *
     * @param name
     * @param cost
     * @param numInStock
     */
    public Product(String name, Double cost, int numInStock) {
        this.name = name;
        this.cost = cost;
        this.numInStock = numInStock;
    }

    /**
     * Get the name of book or CD
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Get the cost of book or CD
     *
     * @return
     */
    public Double getCost() {
        return cost;
    }

    /**
     * Get whether there are books or CD
     *
     * @return
     */
    public Boolean getIsInStock() {
        return isInStock;
    }

    /**
     * Get the number of books or CD in stock
     *
     * @return
     */
    public int getNumInStock() {
        return numInStock;
    }

    /**
     * Set the name of book or CD
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the cost of Book or CD
     *
     * @param cost
     */
    public void setCost(Double cost) {
        this.cost = cost;
    }

    /**
     * Set whether the book or CD is in stock
     *
     * @param isInStock
     */
    public void setIsInStock(Boolean isInStock) {
        this.isInStock = isInStock;
    }

    /**
     * Set the number of book or CD in stock
     *
     * @param numInStock
     */
    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }

}
