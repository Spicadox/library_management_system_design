package librarymanagement;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author samph
 */
public class PremiumMember extends Member {

    private double fineAmount;
    private final double fee = 20.00;
    private final double premiumFee = 7.00;
    private boolean onTime = true;
    private String dueDate;
    private String currentDate;

    /**
     * constructor that takes member's name, membership type, payment type,
     * amount of money spent, whether member paid on time, and the due date
     *
     * @param memberName
     * @param membershipType
     * @param paymentType
     * @param amountSpent
     * @param onTime
     * @param dueDate
     */
    public PremiumMember(String memberName, String membershipType, String paymentType, Double amountSpent, boolean onTime, String dueDate) {
        super(memberName, membershipType, paymentType, amountSpent);
        this.onTime = onTime;
        this.dueDate = dueDate;
    }

    /**
     * constructor that takes boolean onTime and string dueDate
     *
     * @param onTime
     * @param dueDate
     */
    public PremiumMember(boolean onTime, String dueDate) {
        this.onTime = onTime;
        this.dueDate = dueDate;
    }

    /**
     * default constructor
     */
    public PremiumMember() {
    }

    /**
     * Gets the amount of money member owes relying on getDueDate method and
     * gets the fine by the month, so fee increments by months
     *
     * @return
     */
    public double getFineAmount() {
        String dueDate1 = this.getDueDate();
        char dueDate2 = dueDate1.charAt(0);
        String monthValueNum = Character.toString(dueDate2);
        int monthValue = Integer.parseInt(monthValueNum);

        if (monthValue == 5 || monthValue == 4) {
            return fineAmount = 0;
        } else {
            double fineFee = ((monthValue) * fee);
            double pFineFee = ((((4 - monthValue - 1) * premiumFee)) + premiumFee);
            fineAmount = (fineFee + pFineFee);
            return fineAmount;
        }
    }

    /**
     * Gets the double premium fee
     *
     * @return
     */
    public double getPremiumFee() {
        return premiumFee;
    }

    /**
     * Randomly generate a day with month as 4 and year as 2019
     *
     * @return
     */
    public String getCurrentDate() {
        Random rand = new Random();
        int year = 2019;
        int month = 4;
        int day = rand.nextInt(29) + 1;
        currentDate = Integer.toString(month) + "/" + Integer.toString(day) + "/" + Integer.toString(year);
        return currentDate;
    }

    /**
     * Determines if payment is on time by comparing dueDate and currentDate
     *
     * @return
     */
    public boolean isOnTime() {
        int time = getCurrentDate().compareTo(dueDate);

        if (time > 1) {
            onTime = false;
        } else {
            onTime = true;
        }
        return onTime;
    }

    /**
     * Method to set whether payment was payed ontime.
     *
     * @param onTime
     */
    public void setOnTime(boolean onTime) {
        this.onTime = onTime;
    }

    /**
     * Method to generate a random due date between january and may
     *
     * @return
     */
    public String getDueDate() {
        Random rand = new Random();
        int year = 2019;
        int month = rand.nextInt(5) + 1;
        int day;
        if (month != 2 && month != 4 && month != 6 && month != 9 && month != 11) {
            day = rand.nextInt(30) + 1;
        } else if (month == 2) {
            day = rand.nextInt(27) + 1;
        } else {
            day = rand.nextInt(29) + 1;
        }
        dueDate = Integer.toString(month) + "/" + Integer.toString(day) + "/" + Integer.toString(year);
        return dueDate;
    }

    /**
     * This method sets the dueDate taking in string
     *
     * @param dueDate
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * This method sets the current date taking in string
     *
     * @param currentDate
     */
    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    /**
     * This method sets the fine amount taking in integer
     *
     * @param i
     */
    public void setFineAmount(int i) {
        this.fineAmount = i;
    }

    /**
     * this method sets whether member paid on time
     *
     * @param oTime
     */
    public void setIsOnTime(Boolean oTime) {
        this.onTime = oTime;
    }

}
