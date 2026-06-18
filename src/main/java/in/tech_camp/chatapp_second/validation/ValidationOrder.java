package in.tech_camp.chatapp_second.validation;

import jakarta.validation.GroupSequence;

@GroupSequence({ ValidationPriority1.class, ValidationPriority2.class})
public interface ValidationOrder {
  
}
