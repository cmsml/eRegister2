package uk.ac.shu.webarch.eregister2

class RegistrationSheet {

    RegClass      regClass


    static mappedBy = [classes: 'registrationSheet']
    static hasMany = [classes: RegisterEntry]



    static constraints = {
    }
}
