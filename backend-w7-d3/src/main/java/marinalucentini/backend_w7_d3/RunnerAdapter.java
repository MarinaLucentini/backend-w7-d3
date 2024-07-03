package marinalucentini.backend_w7_d3;

import marinalucentini.backend_w7_d3.adapterPattern.DataSource;
import marinalucentini.backend_w7_d3.adapterPattern.Info;
import marinalucentini.backend_w7_d3.adapterPattern.UserData;
import marinalucentini.backend_w7_d3.adapterPattern.infoAdapter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;
@Component
public class RunnerAdapter implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");
        Calendar cal = Calendar.getInstance();
        cal.set(1990, Calendar.JANUARY, 1);
        info.setDataDiNascita(cal.getTime());
        DataSource adapter = new infoAdapter(info);
        UserData userData = new UserData();
        userData.getData(adapter);
        System.out.println("Nome Completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());
    }
}
