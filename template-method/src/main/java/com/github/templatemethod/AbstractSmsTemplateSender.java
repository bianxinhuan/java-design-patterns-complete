package com.github.templatemethod;

import java.util.Map;

/**
 * 抽象短信模板发送器
 *
 * @author bianxinhuan
 */
public abstract class AbstractSmsTemplateSender {

    /**
     * 获取模板id的抽象方法
     *
     * @return
     */
    protected abstract int getTemplateId();

    /**
     * 发送短信
     *
     * @param params
     */
    public final void send(Map<String, String> params) {
        System.out.println("发送短信. 使用模板id: " + getTemplateId() + ", 参数: " + params);
    }

}
