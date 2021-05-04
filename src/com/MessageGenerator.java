package com;

public class MessageGenerator {

    private IHttpLib httpLib;

    public MessageGenerator (IHttpLib httpLib) {
        this.httpLib = httpLib;
    }

    public String generateMessage(String url) throws Exception {
        Response response = this.httpLib.call(url);
        if (response.getData().contains("")) { // need to add appropriate data
            return "Message recieved: '#" + response.getData() + "'";
        } else if (response.getData().contains("")) { // need to add appropriate data
            return "message recieved: '" + response.getData() + "'";
        } else if (response.getData().contains("")) { // need to add appropriate data
            return "Out of hours message recieved - look in the morning";
        }
         return "badly formatted message recieved";
    }
}
