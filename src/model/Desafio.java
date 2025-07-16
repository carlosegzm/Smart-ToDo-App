package model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Vinicius Corbellini
 */
public class Desafio {

    private Long id;
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private List<Tarefa> tarefas;
    private Usuario dono;
    private Long dono_id;
    private Double completo;

    //===== Construtores
    public Desafio(Long id, String nome, String descricao, LocalDate dataInicio, LocalDate dataFim, List<Tarefa> tarefas, Usuario dono, Long dono_id, Double completo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.tarefas = tarefas;
        this.dono = dono;
        this.dono_id = dono_id;
        this.completo = completo;
    }

    public Desafio() {
    }
    
    //===== Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public Usuario getDono() {
        return dono;
    }

    public void setDono(Usuario dono) {
        this.dono = dono;
    }

    public Long getDono_id() {
        return dono_id;
    }

    public void setDono_id(Long dono_id) {
        this.dono_id = dono_id;
    }

    public Double getCompleto() {
        return completo;
    }

    public void setCompleto(Double completo) {
        this.completo = completo;
    }
}
