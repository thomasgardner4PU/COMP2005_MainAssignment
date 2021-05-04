package com;

public class MockHttpLib implements IHttpLib {

    private int hours;

    public MockHttpLib (int hours) {
        this.hours = hours;
    }
    @Override
    public Response call(String url) throws Exception {
        String name = url.substring(url.indexOf("=")+1);
        if (hours < 12) {

        }
    }
}
