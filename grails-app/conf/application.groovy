// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'org.pilotaid.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'org.pilotaid.UserRole'
grails.plugin.springsecurity.authority.className = 'org.pilotaid.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/**',               access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]
