package entities;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class TreinoEntity {
    private int id;
    private ClienteEntity cliente;
    private TreinadorEntity treinador;
    private LocalDate dataTreino;
    private LocalDateTime dataHoraFim;
    private List<ExercicioEntity> exercicios;
    
    public TreinoEntity() {
        id=0;
        cliente=new ClienteEntity();
        treinador=new TreinadorEntity();
        dataTreino=LocalDate.now();
        dataHoraFim=null;
        exercicios=new ArrayList<>();
    }
    public TreinoEntity(int id, ClienteEntity cliente, TreinadorEntity treinador, LocalDate dataTreino, LocalDateTime dataHoraFim, List<ExercicioEntity> exercicios) {
        this.id = id;
        this.cliente = cliente;
        this.treinador = treinador;
        this.dataTreino = dataTreino;
        this.dataHoraFim = dataHoraFim;
        this.exercicios = exercicios;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ClienteEntity getCliente() {
        return cliente;
    }
    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }
    public TreinadorEntity getTreinador() {
        return treinador;
    }
    public void setTreinador(TreinadorEntity treinador) {
        this.treinador = treinador;
    }
    public List<ExercicioEntity> getExercicios() {
        return exercicios;
    }
    public void setExercicios(List<ExercicioEntity> exercicios) {
        this.exercicios = exercicios;
    }
    public void adicionarExercicio(ExercicioEntity exercicio) {
        this.exercicios.add(exercicio);
    }
    public void removerExercicio(ExercicioEntity exercicio) {
        this.exercicios.remove(exercicio);
    }



    public LocalDate getDataTreino() {
        return dataTreino;
    }
    public void setDataTreino(LocalDate dataTreino) {
        this.dataTreino = dataTreino;
    }
    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;}    
    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;}

}
