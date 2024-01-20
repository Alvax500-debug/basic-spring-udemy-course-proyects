package asignacion.uno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class EmailService {

    private DataSource dbdatasource;

    //@Autowired
    public EmailService(@Qualifier("mySQLDataSource") DataSource dbdatasource) {
        this.dbdatasource = dbdatasource;
    }

    public void sendEmail() {
        System.out.println(Arrays.toString(this.dbdatasource.getEmails()));
    }

}
