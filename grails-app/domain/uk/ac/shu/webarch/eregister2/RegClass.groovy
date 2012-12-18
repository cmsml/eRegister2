package uk.ac.shu.webarch.eregister2

class RegClass {

    Course        course	
    Instructor    instructor

	Date	  classDate	

    static mappedBy = [classes: 'regClass']
    static hasMany = [classes: RegistrationSheet]


    static constraints = {
    }
}
