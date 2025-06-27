package example;

import java.util.UUID;
import org.immutables.value.Value;

@Value.Immutable
public interface EntityId {

  @Value.Default
  default UUID value() {
    return UUID.randomUUID();
  }
}
