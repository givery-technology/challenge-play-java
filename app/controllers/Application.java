package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.BodyParser;

import play.libs.Json;

import java.lang.Object;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

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

  @BodyParser.Of(BodyParser.Json.class)
  public static Result login(Long id) {
    JsonNode json = request().body().asJson();
    ObjectNode result = Json.newObject();
    result.put("result", "Logged In !");
    return ok(result);
  }

}






