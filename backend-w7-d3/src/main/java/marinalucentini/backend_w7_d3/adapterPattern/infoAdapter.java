package marinalucentini.backend_w7_d3.adapterPattern;

import java.util.Calendar;

public class infoAdapter implements DataSource{
    private Info info;

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(info.getDataDiNascita());
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR) ;
        return age;
    }

    public infoAdapter(Info info) {
        this.info = info;
    }
}
