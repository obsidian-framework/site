package fr.kainovaii.obsidian.app.controllers;

import fr.kainovaii.obsidian.http.controller.BaseController;
import fr.kainovaii.obsidian.http.controller.annotations.Controller;
import fr.kainovaii.obsidian.routing.methods.GET;
import spark.Request;
import spark.Response;

import java.util.Map;

@Controller
public class DocController extends BaseController
{
    @GET(value = "/docs", name = "doc.installation")
    private Object index(Response res)
    {
        res.redirect("/docs/installation");
        return true;
    }


    @GET(value = "/docs/installation", name = "doc.installation")
    private Object installation(Request req, Response res)
    {
        return render("docs/partials/installation.html", Map.of());
    }

    @GET(value = "/docs/routing", name = "doc.routing")
    private Object routing(Request req, Response res)
    {
        return render("docs/partials/routing.html", Map.of());
    }

    @GET(value = "/docs/controllers", name = "doc.controllers")
    private Object controllers(Request req, Response res)
    {
        return render("docs/partials/controllers.html", Map.of());
    }

    @GET(value = "/docs/middlewares", name = "doc.middlewares")
    private Object middlewares(Request req, Response res)
    {
        return render("docs/partials/middlewares.html", Map.of());
    }

    @GET(value = "/docs/templates", name = "doc.template")
    private Object template(Request req, Response res)
    {
        return render("docs/partials/template.html", Map.of());
    }

    @GET(value = "/docs/validation", name = "doc.validation")
    private Object validation(Request req, Response res)
    {
        return render("docs/partials/validation.html", Map.of());
    }

    @GET(value = "/docs/csrf", name = "doc.csrf")
    private Object csrf(Request req, Response res)
    {
        return render("docs/partials/csrf.html", Map.of());
    }

    @GET(value = "/docs/flash-messages", name = "doc.flash-messages")
    private Object flashMessage(Request req, Response res)
    {
        return render("docs/partials/flash-messages.html", Map.of());
    }

    @GET(value = "/docs/database", name = "doc.database")
    private Object database(Request req, Response res)
    {
        return render("docs/partials/database.html", Map.of());
    }

    @GET(value = "/docs/models", name = "doc.models")
    private Object models(Request req, Response res)
    {
        return render("docs/partials/models.html", Map.of());
    }

    @GET(value = "/docs/migrations", name = "doc.migrations")
    private Object migrations(Request req, Response res)
    {
        return render("docs/partials/migrations.html", Map.of());
    }

    @GET(value = "/docs/repositories", name = "doc.repositories")
    private Object repositories(Request req, Response res)
    {
        return render("docs/partials/repositories.html", Map.of());
    }

    @GET(value = "/docs/seeders", name = "doc.seeders")
    private Object seeders(Request req, Response res)
    {
        return render("docs/partials/seeders.html", Map.of());
    }

    @GET(value = "/docs/security", name = "doc.security")
    private Object security(Request req, Response res)
    {
        return render("docs/partials/security.html", Map.of());
    }

    @GET(value = "/docs/cache", name = "doc.cache")
    private Object cache(Request req, Response res)
    {
        return render("docs/partials/cache.html", Map.of());
    }

    @GET(value = "/docs/storage", name = "doc.storage")
    private Object storage(Request req, Response res)
    {
        return render("docs/partials/storage.html", Map.of());
    }

    @GET(value = "/docs/websockets", name = "doc.websockets")
    private Object websockets(Request req, Response res)
    {
        return render("docs/partials/websockets.html", Map.of());
    }

    @GET(value = "/docs/sse", name = "doc.sse")
    private Object sse(Request req, Response res)
    {
        return render("docs/partials/sse.html", Map.of());
    }

    @GET(value = "/docs/live-components", name = "doc.live-components")
    private Object liveComponents(Request req, Response res)
    {
        return render("docs/partials/live-components.html", Map.of());
    }

    @GET(value = "/docs/flow", name = "doc.flow")
    private Object flow(Request req, Response res)
    {
        return render("docs/partials/flow.html", Map.of());
    }

    @GET(value = "/docs/cli", name = "doc.cli")
    private Object cli(Request req, Response res)
    {
        return render("docs/partials/cli.html", Map.of());
    }

    @GET(value = "/docs/config", name = "doc.config")
    private Object config(Request req, Response res)
    {
        return render("docs/partials/config.html", Map.of());
    }

    @GET(value = "/docs/realtime", name = "doc.realtime")
    private Object realtime(Request req, Response res)
    {
        return render("docs/partials/realtime-comparison.html", Map.of());
    }

    @GET(value = "/docs/services", name = "doc.services")
    private Object services(Request req, Response res)
    {
        return render("docs/partials/services.html", Map.of());
    }
}