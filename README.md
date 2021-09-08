# Grails 5.0.0.RC2 - Controllers Render as Content-Type: application/xhtml depending on Service injection order

See https://github.com/grails/grails-core/issues/12057

```
sdk use grails 5.0.0.RC2
git clone https://github.com/codeconsole/gormbug
cd gormbug
grails run-app
```

Using Chrome or Safari in a private window
http://localhost:8080/link

Notice page is sent with content type xhtml 

![application/xhtml+xml;charset=UTF-8](https://raw.githubusercontent.com/codeconsole/gormbug/master/screenshots/chrome-error.jpg)

Next, do either of the following:
```
rm grails-app/domain/org/pilotaid/Schedule.groovy
rm grails-app/services/org/pilotaid/ScheduleService.groovy
```

or edit `./grails-app/services/org/pilotaid/MainService.groovy` and just comment out the following line
```
// @Autowired SpringSecurityService springSecurityService
```
then 
```
grails run-app
```

Using Chrome or Safari in a private window
http://localhost:8080/link

and notice the problem went away and the page renders correctly.
