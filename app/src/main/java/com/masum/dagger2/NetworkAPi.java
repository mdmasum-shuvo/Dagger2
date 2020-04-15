package com.masum.dagger2;

import javax.inject.Inject;

public class NetworkAPi {

    @Inject
    public NetworkAPi() {

    }

    public boolean ValidateUser(String userName, String password) {
        if (userName != null && password != null) {
            return true;
        } else return false;
    }
}
