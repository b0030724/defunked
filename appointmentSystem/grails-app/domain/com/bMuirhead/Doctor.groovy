package com.bMuirhead


class Doctor {

    String fullName
    String qualification
    String position
    String doctorEmail
    String password
    String doctorOffice
    String doctorPhone
    String bio

    String toString()
    {
        return fullName
    }

    static constraints = {
        fullName()
        qualification()
        position()
        doctorEmail()
        password()
        doctorOffice()
        doctorPhone()
        bio()

        password size: 7..12
        doctorPhone size: 10..10
    }
}