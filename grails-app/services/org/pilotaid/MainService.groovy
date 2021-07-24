package org.pilotaid

import grails.gorm.transactions.Transactional
import grails.plugin.springsecurity.SpringSecurityService

@Transactional
class MainService {

	@Autowired SpringSecurityService springSecurityService

    User getUser(id) {
        id.toString().isNumber()? User.load(id) : User.findByUsername(id)
    }

    User getUserOrCurrentUser(id) {
    	if (!id) {
    		if (springSecurityService.isLoggedIn() && springSecurityService.principal) {
    			return getUser("${springSecurityService.principal.id}")	
    		}
    		return null
    	}
        getUser(id)
    }
}
