package fr.kainovaii.obsidian.app.controllers;

import com.obsidian.core.http.controller.BaseController;
import com.obsidian.core.http.controller.annotations.Controller;
import com.obsidian.core.routing.methods.GET;
import spark.Request;
import spark.Response;

import java.util.Map;

@Controller
public class DemoController extends BaseController
{
    @GET(value = "/demo/live-components", name = "site.home")
    private Object homepage(Request req, Response res)
    {
        return render("demo/live-components.html", Map.of());
    }
}