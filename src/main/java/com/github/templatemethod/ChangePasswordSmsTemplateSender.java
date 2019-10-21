package com.github.templatemethod;

/**
 * 修改密码短信模板发送器
 *
 * @author bianxinhuan
 */
public class ChangePasswordSmsTemplateSender extends AbstractSmsTemplateSender {

    @Override
    protected int getTemplateId() {
        return 9528;
    }

}
