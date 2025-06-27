package example;

import org.springframework.stereotype.Service;

@Service
public class MyService {
  private final DtoMapper mapper;

  public MyService(DtoMapper mapper) {
    this.mapper = mapper;
  }

  public void doThings() {
  }
}
