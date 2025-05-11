
package com.aula4;

public enum Status {

    ON(true),OFF(false);

    private boolean statusCorrespodente;

    Status(boolean statusCorrespodente){

        this.statusCorrespodente=statusCorrespodente;
    }

    public boolean getStatus(){
        return statusCorrespodente;
    }
}
