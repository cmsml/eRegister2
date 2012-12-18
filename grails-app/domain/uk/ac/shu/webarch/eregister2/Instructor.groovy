package uk.ac.shu.webarch.eregister2

class Instructor {

  static mappedBy = [classes: 'instructor']

  static hasMany = [classes: RegClass]


    static constraints = {
    }
}
