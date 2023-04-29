package com
class Surgery {
   String name
   String address
   static hasMany = [doctors: Doctor, nurses: Nurse, receptionists: Receptionist, patients: Patient, appointments: Appointment]
   static constraints = {
      name blank: false
      address blank: false
   }
}
