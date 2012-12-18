package uk.ac.shu.webarch.eregister2

class Course {

  String     courseName ;

  static mappedBy = [classes: 'course']

  static hasMany = [classes: RegClass]

    static constraints = {
    }
}
