package org.pilotaid

class UrlMappings {
    static mappings = {
        "/" (controller:"home")
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
