package example;

import org.immutables.value.Value;

@Value.Immutable
public interface MyDto {

  String id();
  String name();
  String correlationId();
}
