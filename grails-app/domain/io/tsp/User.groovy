package io.tsp

class User {
    String firstName
    static constraints = {
        firstName blank: false
    }
}
