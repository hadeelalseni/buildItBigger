package com.udacity.gradle.builditbigger.backend;

import hadeel.com.javajokelib.MyJoke;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        String joke = new MyJoke().getJoke();
        return joke;

    }

    public void setData(String data) {
        myData = data;
    }
}