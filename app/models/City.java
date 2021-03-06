package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class City extends Model {

  @Id
  public Long id;
  
  @Required
  public String name;
  
  @OneToMany(mappedBy="city")
  public List<Place> places;
  
  public static Model.Finder<Long, City> find = new Model.Finder<Long, City>(Long.class, City.class);
  
  public static List<City> findAll() {
    return find.all();
  }
}
