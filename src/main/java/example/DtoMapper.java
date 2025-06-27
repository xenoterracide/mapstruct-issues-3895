package example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = { ConverterMapper.class, Headers.class })
public interface DtoMapper {

  @Mapping(target = "correlationId", expression = "java(headers.correlationId())")
  MyDto toDto(MyEntity entity);

  MyError fromException(MyException exception);
}
