import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.edu.iftm.rastreamento.service.exceptions.IdNaoEncontradoException;
import br.edu.iftm.rastreamento.service.exceptions.NaoAcheiException;

@ControllerAdvice
public class ExceptionsController {

    @ExceptionHandler(NaoAcheiException.class)
    public ResponseEntity<?> naoAchei(NaoAcheiException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }

	
    @ExceptionHandler(IdNaoEncontradoException.class)
    public ResponseEntity<?> idNaoEncontrado(IdNaoEncontradoException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }