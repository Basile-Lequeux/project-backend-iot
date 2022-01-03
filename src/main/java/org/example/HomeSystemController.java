package org.example;

import org.example.core.Template;
import org.example.models.Light;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;

public class HomeSystemController {

    public String list(Request request, Response response){

        Map<String, Object> model = new HashMap<>();

        HomeSystem homeSystem = HomeSystem.getInstance();
        model.put("things", homeSystem.getThings());
        return Template.render("home.html", model);
    }
}
