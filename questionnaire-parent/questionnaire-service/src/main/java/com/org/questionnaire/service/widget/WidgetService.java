package com.org.questionnaire.service.widget;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengaofeng
 * @date 2021年01月07日 10:29 上午
 */
@RestController
public class WidgetService {


    public String get() {
        return  "menu.umd.min";
    }
}
