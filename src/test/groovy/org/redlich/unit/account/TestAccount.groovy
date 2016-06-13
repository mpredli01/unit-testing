package org.redlich.unit.account

import spock.lang.Specification

class TestAccount extends Specification {
    def "withdraw from account" () {
        given:
        def account = new Account(500.00)

        when:
        account.withdraw(200.00)

        then:
        account.balance == 300.00
        }
    }
