
package com.ideamart.sms.sample.receive;

import com.ideamart.sms.sample.operations.Operations;
import com.ideamart.sms.sample.send.SendMessage;
import hms.kite.samples.api.sms.MoSmsListener;
import hms.kite.samples.api.sms.messages.MoSmsReq;

public class Receiver implements MoSmsListener {
    @Override
    public void init() {

    }

    @Override
    public void onReceivedSms(MoSmsReq moSmsReq) {
        String message = moSmsReq.getMessage();
        SendMessage sendMessage = new SendMessage();
        sendMessage.SendMessage("Your Message Saved",moSmsReq.getApplicationId(),moSmsReq.getSourceAddress()
                ,"password","http://127.0.0.1:7000/sms/send");
    }
}
