package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;


@Entity
public class User extends Model {
    
  @Id  
  public Long id;

  @Required
  public String email;
  private String password;
  
  public static Finder<Long,User> find = new Finder(
    Long.class, User.class
  );
  
  public static List<User> all() {
    return find.all();
  }
  
  public static void create(String email, String password) {
    User user = new User();
    user.email = email;
    user.password = password;
    user.save();
  }
  
  public static void delete(Long id) {
    find.ref(id).delete();
  }

  public static User login(Long id) {
    return find.ref(id);
  }

}