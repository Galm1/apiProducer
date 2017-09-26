package com.example.Producer;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WidgetController {
    List<Widget> widgets = new ArrayList();


    @RequestMapping(path = "/api/v1/widgets", method = RequestMethod.GET)
    public List<Widget> getWidgetList() {
        if(widgets.size()==0){
            init(widgets);
        }
        return widgets;
    }

    private void init(List<Widget> widgets) {
        // create a few widgets and add them to the list
        Widget widget1 = new Widget();
        Widget widget2 = new Widget();
        Widget widget3 = new Widget();

        widget1.setName("widget1");
        widget2.setName("widget2");
        widget3.setName("widget3");

        widgets.add(widget1);
        widgets.add(widget2);
        widgets.add(widget3);
    }

}
