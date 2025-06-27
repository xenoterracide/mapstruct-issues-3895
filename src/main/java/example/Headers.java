package example;

import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class Headers {

  public String correlationId() {
    // really retrieved from the servlet request
    return UUID.randomUUID().toString();
  }
}
