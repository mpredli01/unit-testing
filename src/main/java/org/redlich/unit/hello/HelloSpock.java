package org.redlich.unit.hello;

public class HelloSpock {
    private String spock = new String();
    private String kirk = new String();
    private String scotty = new String();

    public HelloSpock() {
        setSpock("Spock");
        setKirk("Kirk");
        setScotty("Scotty");
        }

    public String getSpock() {
        return spock;
        }

    public void setSpock(String spock) {
        this.spock = spock;
        }

    public String getKirk() {
        return kirk;
        }

    public void setKirk(String kirk) {
        this.kirk = kirk;
        }

    public String getScotty() {
        return scotty;
        }

    public void setScotty(String scotty) {
        this.scotty = scotty;
        }
    }
