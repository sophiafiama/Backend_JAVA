package Integradores.Aula0006.Mesa;

public class GradeDeFilmesProxy implements IGradeFilmes{

    private int ip_1;
    private int ip_2;
    private int ip_3;
    private int ip_4;
    private String ip;


    public GradeDeFilmesProxy(int ip_1, int ip_2, int ip_3, int ip_4, String ip) {
        this.ip_1 = ip_1;
        this.ip_2 = ip_2;
        this.ip_3 = ip_3;
        this.ip_4 = ip_4;
        this.ip = ip_1+"."+ip_2+"."+ip_3+"."+ip_4;
    }

    @Override
    public Filme getFilme(String nome) {
        String paisIp;

        if(ip_1 < 50){
            paisIp = "Argentina";
        }if (ip_1 < 100){
            paisIp = "Brasil";
        } if(ip_1 < 150){
            paisIp = "Colombia";
        }

    }

}
