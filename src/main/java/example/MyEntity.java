package example;

import org.immutables.value.Value;

@Value.Immutable
public interface MyEntity {
  EntityId getId();

  String name();
}
