package uk.ac.shu.webarch.eregister2

class Student {

    String    fullStudentName 
    String    studentNumber 

    static mappedBy = [classes: 'student']
    static hasMany = [classes: RegisterEntry]


    static constraints = {
    }
}
