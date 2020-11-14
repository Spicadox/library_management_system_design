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
public class Member {

    private String memberName;
    private String membershipType;
    private String paymentType;
    private Double amountSpent;

    private ArrayList<Member> members = new ArrayList<Member>();

    /**
     * constructor taking in member's name, membership type of premium or
     * regular, payment type, and the amount of money spent
     *
     * @param memberName
     * @param membershipType
     * @param paymentType
     * @param amountSpent
     */
    public Member(String memberName, String membershipType, String paymentType, Double amountSpent) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.paymentType = paymentType;
        this.amountSpent = amountSpent;
    }

    /**
     * constructor that takes nothing
     */
    public Member() {
    }

    /**
     * constructor that takes string of member's name
     *
     * @param memberName
     */
    public Member(String memberName) {

    }

    /**
     * Method that get the member's name
     *
     * @return
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * Method that gets the membership type and should return either premium or
     * regular
     *
     * @return
     */
    public String getMembershipType() {
        return membershipType;
    }

    /**
     * Method that gets the member's payment type
     *
     * @return
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Method that mets the member's amount of money spent
     *
     * @return
     */
    public Double getAmountSpent() {
        return amountSpent;
    }

    /**
     * Method that sets the member's name or change it
     *
     * @param memberName
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * Method that sets the member's membership type
     *
     * @param membershipType
     */
    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    /**
     * Method that sets the member's payment type
     *
     * @param paymentType
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Method that sets the amount of money member spent
     *
     * @param amountSpent
     */
    public void setAmountSpent(Double amountSpent) {
        this.amountSpent = amountSpent;
    }

    /**
     * Method that add members to members array list
     *
     * @param members
     */
    public void addMembers(Member members) {
        this.members.add(members);
    }

}
