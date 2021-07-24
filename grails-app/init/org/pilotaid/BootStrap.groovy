package org.pilotaid

class BootStrap {

    def init = { servletContext ->
        println "Bootstrap started ..."

        TimeZone.setDefault(TimeZone.getTimeZone("UTC"))

        List<Map> urls = [
                    [url: "https://www.faasafety.gov/WINGS/pub/default.aspx", title: "FAA Wings Portal"],
                    [url: "http://airnav.com", title: "AIR Nav"],
                    [url: "http://skyvector.com", title: "Sky Vector"],
                    [url: "http://liveatc.net", title: "LiveATC.net"],
                    [url: "http://www.qsl.net/n4jri/genavn.htm", title: "General Frequencies for Aircraft Listening"],               
                    [url: "http://aa.usno.navy.mil/data/docs/RS_OneDay.php", title: "Civil Twilight"],
                    [url: "http://aviation.und.edu/multimedia/interactive-trainers.aspx", title: "Interactive Trainers"],
                    [url: "https://www.aviationweather.gov/briefing", title: "Briefer"],
                    [url: "http://sapt.faa.gov/default.php", title: "RAIM Availability"],
                    [url: "https://www.faa.gov/regulations_policies/advisory_circulars/", title: "Advisory Circulars"],
                    [url: "http://www.cfidarren.com/hpart91.htm", title: "Helicopter Flight Rules"],
                    [url: "https://designee.faa.gov/SelectTypeOfSearch/SelectTypeOfSearch", title: "Medical Examiner Search "] ]

        if (!Link.count()) {
            def u = User.findByEmail('scott@pixoto.com')
            Link.withTransaction {
                urls.each {
                    new Link(url:it.url, title:it.title, user:u).save(flush:true)
                }
            }
        }
        println "... Bootstrap finished."
    }
    def destroy = {
    }
}
