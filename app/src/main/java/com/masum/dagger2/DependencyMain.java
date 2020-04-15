package com.masum.dagger2;

import javax.inject.Inject;

public class DependencyMain {
    @Inject
    BackendService backendService;
    private MyComponent myComponent;

    public DependencyMain() {
        myComponent = DaggerMyComponent.builder().build();

    }

    public void callServer() {
        boolean callServer = backendService.callServer();
        if (callServer) {
            System.out.println("Server call was successful. ");
        } else {
            System.out.println("Server call failed. ");
        }
    }
}
