package fr.kainovaii.obsidian.app.controllers;

import com.obsidian.core.http.controller.BaseController;
import com.obsidian.core.http.controller.annotations.Controller;
import com.obsidian.core.routing.methods.GET;
import spark.Request;
import spark.Response;

import java.util.Map;

@Controller
public class HomeController extends BaseController
{
    @GET(value = "/", name = "site.home")
    private Object homepage(Request req, Response res)
    {
        return render("landing/home.html", Map.of());
    }
}