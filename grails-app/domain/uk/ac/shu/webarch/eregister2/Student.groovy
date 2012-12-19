package uk.ac.shu.webarch.eregister2

class Student {

    String    fullStudentName 
    String    studentNumber 
    Long      heightInCm
    Set       studentsRegistered
    Set       studentEnrolled


    static mappedBy = [studentsRegistered: 'student', studentEnrolled: 'student' ]
    static hasMany = [studentsRegistered: RegisterEntry, studentEnrolled: Enrollment ]


    static constraints = {
    }
}
