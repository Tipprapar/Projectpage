package controllers;

import

public class Application extends Controller {



public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

}
