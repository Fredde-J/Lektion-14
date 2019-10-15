package com.company;

public enum MainMenu implements HasDescription{
    ADD_ACCOUNT("Add account"),
    DELETE_ACCOUNT("Delete Account"),
    SHOW_ACCOUNT_OVERVIEW("Show Accounts");
    private String description;

    MainMenu(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
