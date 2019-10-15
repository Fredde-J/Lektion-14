package com.company;

import java.util.Collections;

public enum CustomerMenu implements HasDescription {
    SHOW_ACCOUNT_DETAILS("Show acccount details"),
    INSERT_MONEY("Insert Money"),
    LOG_OUT("Log out")
    ;

    private String description;
    CustomerMenu(String description){
        this.description=description;
    }


    @Override
    public String getDescription() {
        return description;
    }
}
