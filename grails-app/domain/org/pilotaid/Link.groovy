package org.pilotaid

class Link {

    static belongsTo = [user: User]
    String url
    String title
    String description

    static constraints = {
        version:false
    }
}
