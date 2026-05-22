package entities;

import java.time.LocalDate;

public interface Impressao {
    public static final String CABECALHO =
    "============   EXERCÍCIOS DO DIA  ===========\n";
    public static final String RODAPE =
    "=============================================\n"+
    "Impressão realizada em %s\n" + LocalDate.now();
    public void imprimirTreino();
    public void imprimirTreino(LocalDate data);
}
