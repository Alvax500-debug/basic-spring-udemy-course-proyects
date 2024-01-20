package asignacion.uno;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataSource implements DataSource{

    @Override
    public String[] getEmails() {
        String[] correos = {"correo1@mysql.com", "correo2@mysql.com", "correo3@mysql.com"};
        return correos;
    }

}
