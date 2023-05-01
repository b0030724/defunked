package com.bMuirhead

class Nurse {

    String nurseName
    String qualifications
    String nurseEmail
    String nurseOffice
    String nursePhone

    String toString()
    {
        return nurseName
    }

    static constraints = {
        nurseName()
        qualifications()
        nurseEmail()
        nurseOffice()
        nursePhone()

        nursePhone size: 10..10
    }
}
