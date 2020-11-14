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
public class CDs extends Product {

    private int numCDs;
    private ArrayList<CDs> CDs = new ArrayList<CDs>();

    /**
     * constructor taking name, cost and number of cd in stock
     *
     * @param name
     * @param cost
     * @param numInStock
     */
    public CDs(String name, Double cost, int numInStock) {
        super(name, cost, numInStock);
    }

    /**
     * This method gets the number of CDs if implemented fully and used.
     *
     * @return
     */
    public int getNumCDs() {
        return numCDs;
    }

    /**
     * This method sets the number of CDs if implemented fully and used.
     *
     * @param numCDs
     */
    public void setNumCDs(int numCDs) {
        this.numCDs = numCDs;
    }

    /**
     * This method adds just the name of the CD if implemented fully and used.
     *
     * @param CDs
     */
    public void addCDs(CDs CDs) {
        this.CDs.add(CDs);
    }
}
