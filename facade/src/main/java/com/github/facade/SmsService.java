package com.github.facade;

/**
 * 短信服务
 *
 * @author bianxinhuan
 */
public class SmsService {

    public void sendSms(String phone) {
        System.out.println("向" + phone + "发送短信: 您已下单，我们会尽快安排发货~");
    }

}
