package be.asist.middleware;

import io.javalin.Javalin;
import static io.javalin.apibuilder.ApiBuilder.*;

public class MiddleWare {
  public static void main(String[] args) {
    FinanceController controller = new FinanceController();
    Javalin.create(config -> {
      config.defaultContentType = "application/json";
      config.enableCorsForAllOrigins();
    }).routes(() -> {
      get("hello", FinanceController::greeting);
      post("calculate", controller::calculate);
    }).start(7000);
  }
}
