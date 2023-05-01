package com.bMuirhead

class Surgery {

    String name
    String address
    String postcode
    String telephone
    int numberOfPatients
    String description
    String openingTime
    //Trying to figure out how to make the user enter a time instead of just a string

    String toString()
    {
        return name
    }

    static constraints = {
        name()
        address()
        postcode()
        telephone()
        numberOfPatients()
        description()
        openingTime()

        telephone size: 10..10 //This verifies that an invalid phone number cannot be entered
        numberOfPatients min: 1 //This verifies that the surgery can't have less than 1 patient

    }
}