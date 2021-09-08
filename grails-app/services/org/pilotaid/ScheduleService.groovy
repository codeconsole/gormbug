package org.pilotaid

import grails.gorm.services.Service
import org.springframework.beans.factory.annotation.Autowired

@Service(Schedule)
abstract class ScheduleService {

    @Autowired MainService mainService

    abstract public Schedule get(Serializable id)

    List<Schedule> list(Map args) {
        def u = mainService.getUser(args.userId)
        u? Schedule.where { users.id == u.id }.list() : []
    }

    public void addUser(Schedule schedule, User user) {
        schedule.addToUsers(user)
        save(schedule)
    }

    public void addInstructor(Schedule schedule, User user) {
        schedule.addToInstructors(user)
        save(schedule)
    }

    public void removeUser(Schedule schedule, User user) {
        schedule.removeFromUsers(user)
        save(schedule)
    }

    public void removeInstructor(Schedule schedule, User user) {
        schedule.removeFromInstructors(user)
        save(schedule)
    }

    abstract public Long count()

    abstract public void delete(Serializable id)

    abstract public Schedule save(Schedule schedule)

}