package model;

import java.util.List;

public class Funcionario {
    List<Funcionario> funcionarios;
    private int id;
    private String nome;
    private String cpf;
    private Cargo cargo;
    private double salarioBase;
    private int faltas;
    private double horasExtrasTotais;

    public Funcionario() {}

    public Funcionario(int id, String nome, String cpf, Cargo cargo, double salarioBase, int faltas, double horasExtrasTotais) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.faltas = faltas;
        this.horasExtrasTotais = horasExtrasTotais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public double getHorasExtrasTotais() {
        return horasExtrasTotais;
    }

    public void setHorasExtrasTotais(double horasExtrasTotais) {
        this.horasExtrasTotais = horasExtrasTotais;
    }

    public void cadastrarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }
}
