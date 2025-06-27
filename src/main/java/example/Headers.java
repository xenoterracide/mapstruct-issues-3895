package example;

import java.util.UUID;

public class Headers {

  public String correlationId() {
    // really retrieved from the servlet request
    return UUID.randomUUID().toString();
  }
}
