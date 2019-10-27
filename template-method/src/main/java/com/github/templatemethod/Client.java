package com.github.templatemethod;

import java.util.HashMap;
import java.util.Map;

/**
 * -
 *
 * @author bianxinhuan
 */
public class Client {

    public static void main(String[] args) {
        Map<String, String> params = new HashMap<>();
        params.put("code", "1234");

        AbstractSmsTemplateSender smsSender = new LoginSmsTemplateSender();
        smsSender.send(params);

        smsSender = new ChangePasswordSmsTemplateSender();
        smsSender.send(params);
    }
}
