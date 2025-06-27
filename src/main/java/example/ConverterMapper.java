package example;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;

@Mapper
public abstract class ConverterMapper {

  @Autowired
  private ConversionService conversionService;

  /**
   * returns a base64 encoded string representation of the entity id. We are actually doing more, as that's simple these days
   * @param entityId
   * @return
   */
  String toString(EntityId entityId) {
    return conversionService.convert(entityId, String.class);
  }

  MyError fromException(MyException exception) {
    return conversionService.convert(exception, MyError.class);
  }
}
