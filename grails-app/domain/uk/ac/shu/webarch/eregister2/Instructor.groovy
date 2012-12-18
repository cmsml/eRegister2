package uk.ac.shu.webarch.eregister2

class Instructor {

  String   instructorName
  String   role

  static mappedBy = [classes: 'instructor']
  static hasMany = [classes: RegClass]


    static constraints = {
    }
}
