package marinalucentini.backend_w7_d3.adapterPattern;

import lombok.Getter;

@Getter
public class UserData {
    private String nomeCompleto;
    private int eta;
    public void getData(DataSource ds){
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
