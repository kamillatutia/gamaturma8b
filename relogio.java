/**
 * relogio
 */
public class relogio {

    private int hora;
    private int minuto;
    private int segundo;

public relogio(int h, int m, int s){
    hora = h;
    minuto = m;
    segundo = s;

}

public void acrescente(){
    if(++segundo>59){
        segundo = 0;
        if(++minuto > 59){
            minuto = 0;
            if(++hora > 23){
                hora = 0;
                segundo = 1;
            }
        }
    }
}

public void informahora(){
    System.out.println("Hora atual: " + hora + ":" + minuto + ":" + segundo);
}
}