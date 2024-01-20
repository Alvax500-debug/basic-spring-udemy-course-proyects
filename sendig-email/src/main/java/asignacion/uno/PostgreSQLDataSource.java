package asignacion.uno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSQLDataSource implements DataSource{

    @Override
    public String[] getEmails() {
        String[] correos = {"correo1@postgresql.com", "correo2@postgresql.com", "correo3@postgresql.com", "correo4@postgresql.com"};
        return correos;
    }

}
