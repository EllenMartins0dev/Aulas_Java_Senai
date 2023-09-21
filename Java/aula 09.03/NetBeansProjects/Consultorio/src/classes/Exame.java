package classes;

import java.util.Date;

public class Exame {
private int id;
private Date data;
private Paciente paciente;
private Medico medico;
private boolean cobrar;
private boolean complexo;

public boolean cobrarExame(){
return true;}
public Paciente getPaciente(){
return this.paciente;
}


}
