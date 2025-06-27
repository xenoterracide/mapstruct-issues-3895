package example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(uses = { ConverterMapper.class, Headers.class })
public interface DtoMapper {

  @Mapping(target = "correlationId", expression = "java(headers.correlationId())")
  MyDto toDto(MyEntity entity);

  MyError fromException(MyException exception);

  @Mapping(target = "name", source = "name")
  void copyTo(MyDto source, @MappingTarget ImmutableMyEntity.Builder target);
}
