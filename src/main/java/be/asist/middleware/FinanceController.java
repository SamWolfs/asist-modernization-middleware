package be.asist.middleware;

import com.google.inject.Singleton;
import com.jkecsmrti.schemas.jkecsmrtiinterface.DFHCOMMAREA;

import file.target.JKECSMRPortType;
import file.target.JKECSMRTService;
import io.javalin.http.Context;

@Singleton
public class FinanceController {
  private JKECSMRTService service;

  public FinanceController() {
    this.service = new JKECSMRTService();
  }

  public static void greeting(Context ctx) {
    ctx.res.setStatus(200);
    ctx.result("{\"greeting\": \"Hello World!\"}");
  }

  public void calculate(Context ctx) {
    DFHCOMMAREA request = ctx.bodyAsClass(DFHCOMMAREA.class);
    JKECSMRPortType proxy = service.getJKECSMRPort();
    com.jkecsmrto.schemas.jkecsmrtointerface.DFHCOMMAREA response = proxy.jkecsmrtOperation(request);
    ctx.json(response);
  }
}