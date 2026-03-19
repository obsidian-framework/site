package fr.kainovaii.obsidian.app.controllers;

import com.obsidian.core.http.controller.BaseController;
import com.obsidian.core.http.controller.annotations.Controller;
import com.obsidian.core.routing.methods.GET;
import spark.Request;
import spark.Response;

import java.util.Map;

@Controller("/docs")
public class DocController extends BaseController
{
    @GET(value = "", name = "doc.installation")
    private Object index(Response res)
    {
        res.redirect("/installation");
        return true;
    }

    @GET(value = "/installation", name = "doc.installation")
    private Object installation(Request req, Response res)
    {
        return render("docs/partials/installation.html", null);
    }

    @GET(value = "/routing", name = "doc.routing")
    private Object routing(Request req, Response res)
    {
        return render("docs/partials/routing.html", null);
    }

    @GET(value = "/controllers", name = "doc.controllers")
    private Object controllers(Request req, Response res)
    {
        return render("docs/partials/controllers.html", null);
    }

    @GET(value = "/middlewares", name = "doc.middlewares")
    private Object middlewares(Request req, Response res)
    {
        return render("docs/partials/middlewares.html", null);
    }

    @GET(value = "/templates", name = "doc.template")
    private Object template(Request req, Response res)
    {
        return render("docs/partials/template.html", null);
    }

    @GET(value = "/validation", name = "doc.validation")
    private Object validation(Request req, Response res)
    {
        return render("docs/partials/validation.html", null);
    }

    @GET(value = "/csrf", name = "doc.csrf")
    private Object csrf(Request req, Response res)
    {
        return render("docs/partials/csrf.html", null);
    }

    @GET(value = "/flash-messages", name = "doc.flash-messages")
    private Object flashMessage(Request req, Response res) {
        return render("docs/partials/flash-messages.html", null);
    }

    @GET(value = "/database", name = "doc.database")
    private Object database(Request req, Response res)
    {
        return render("docs/partials/database.html", null);
    }

    @GET(value = "/models", name = "doc.models")
    private Object models(Request req, Response res)
    {
        return render("docs/partials/models.html", null);
    }

    @GET(value = "/migrations", name = "doc.migrations")
    private Object migrations(Request req, Response res)
    {
        return render("docs/partials/migrations.html", null);
    }

    @GET(value = "/repositories", name = "doc.repositories")
    private Object repositories(Request req, Response res)
    {
        return render("docs/partials/repositories.html", null);
    }

    @GET(value = "/seeder", name = "doc.seeder")
    private Object seeder(Request req, Response res)
    {
        return render("docs/partials/seeders.html", null);
    }

    @GET(value = "/security", name = "doc.security")
    private Object security(Request req, Response res)
    {
        return render("docs/partials/security.html", null);
    }

    @GET(value = "/cache", name = "doc.cache")
    private Object cache(Request req, Response res)
    {
        return render("docs/partials/cache.html", null);
    }

    @GET(value = "/storage", name = "doc.storage")
    private Object storage(Request req, Response res)
    {
        return render("docs/partials/storage.html", null);
    }

    @GET(value = "/websockets", name = "doc.websockets")
    private Object websockets(Request req, Response res)
    {
        return render("docs/partials/websockets.html", null);
    }

    @GET(value = "/sse", name = "doc.sse")
    private Object sse(Request req, Response res)
    {
        return render("docs/partials/sse.html", null);
    }

    @GET(value = "/live-components", name = "doc.live-components")
    private Object liveComponents(Request req, Response res)
    {
        return render("docs/partials/live-components.html", null);
    }

    @GET(value = "/flow", name = "doc.flow")
    private Object flow(Request req, Response res)
    {
        return render("docs/partials/flow.html", null);
    }

    @GET(value = "/cli", name = "doc.cli")
    private Object cli(Request req, Response res)
    {
        return render("docs/partials/cli.html", null);
    }

    @GET(value = "/config", name = "doc.config")
    private Object config(Request req, Response res)
    {
        return render("docs/partials/config.html", null);
    }

    @GET(value = "/realtime", name = "doc.realtime")
    private Object realtime(Request req, Response res)
    {
        return render("docs/partials/realtime-comparison.html", null);
    }

    @GET(value = "/services", name = "doc.services")
    private Object services(Request req, Response res)
    {
        return render("docs/partials/services.html", null);
    }
}