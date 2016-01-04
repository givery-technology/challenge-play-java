package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import models.User;

public class Application extends Controller {
    
  public static Result index() {
    return ok("Hello Play Framework");
  }

  public static Result register(String email, String password) {
    try {
      User.create(email, password);
      return ok("User Registered !");
    }
    catch(Exception e){
      return ok("User Not Registered !");  
    }
  }

  public static Result login(Long id) {
    User.login(id);
    return ok("Logged In !");
  }
}
