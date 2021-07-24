package org.pilotaid

class Schedule {

    String name

    User user

    static hasMany = [
            instructors: User,
            users: User]

   static mapping = {
       instructors column: 'SCHEDULE_INSTRUCTORS_ID',
            joinTable: 'SCHEDULE_INSTRUCTOR'
   }

    static constraints = {
        name()
    }
}
