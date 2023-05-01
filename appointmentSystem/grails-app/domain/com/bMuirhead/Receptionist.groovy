package com.bMuirhead

class Receptionist {

    String recepName
    String recepEmail
    String recepUsername
    String recepPassword
    String recepPhone

    String toString()
    {
        return recepName
    }

    static constraints = {
        recepName()
        recepEmail()
        recepUsername()
        recepPassword()
        recepPhone()

        recepPhone size: 10..10
    }
}
