import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * fileName     : AnswerOne
 * author       : jungwoo
 * description  :
 */

interface Bread{
  public String getBreadType();
  public Map<String, Integer> getRecipe();
}



class Cream implements Bread{

  private String breadType = "cream";

  @Override
  public Map<String, Integer> getRecipe() {
    Map<String, Integer> recipe = new HashMap<>();
    recipe.put("flour", 100);
    recipe.put("water", 100);
    recipe.put("cream", 100);
    return recipe;
  }

  public String getBreadType() {
    return breadType;
  }
}

class Sugar implements Bread {
  private String breadType = "sugar";

  @Override
  public Map<String, Integer> getRecipe() {
    Map<String, Integer> recipe = new HashMap<>();
    recipe.put("flour", 100);
    recipe.put("water", 50);
    recipe.put("sugar", 200);
    return recipe;
  }

  public String getBreadType() {
    return breadType;
  }
}

class Butter implements Bread {
  private String breadType = "butter";

  @Override
  public Map<String, Integer> getRecipe() {
    Map<String, Integer> recipe = new HashMap<>();
    recipe.put("flour", 100);
    recipe.put("water", 100);
    recipe.put("butter", 50);
    return recipe;
  }

  public String getBreadType() {
    return breadType;
  }
}

class BreadFactory{
  public Bread getBread(String boardType) {
    if (boardType == null) {
      return null;
    }
    switch (boardType) {
      case "cream":
        return new Cream();
      case "sugar":
        return new Sugar();
      case "butter":
        return new Butter();
    }
    return null;
  }
}

public class AnswerOne {

  public static void main(String[] args) {
    BreadFactory factory = new BreadFactory();
    List<Bread> breads = new ArrayList<>();

    breads.add(factory.getBread("cream"));
    breads.add(factory.getBread("sugar"));
    breads.add(factory.getBread("butter"));

    for (Bread bread : breads) {
      System.out.println("breadType: " + bread.getBreadType());
      System.out.println("recipe");

      Map<String, Integer> recipe = bread.getRecipe();
      for (String k : recipe.keySet()) {
        System.out.println(k + ": " + recipe.get(k));
      }

    }
  }
}
