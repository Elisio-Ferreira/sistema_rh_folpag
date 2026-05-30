package controller;

import java.util.*;

import model.FolhaPagamento;
import service.FolhaPagamentoService;
import service.RelatorioService;

public class Controller {
    private FolhaPagamentoService folhaPagamentoService = new FolhaPagamentoService();

    public void cadastrarPagamento(FolhaPagamento pagamento) {
        folhaPagamentoService.cadastrarPagamento(pagamento);
    }
    public List<FolhaPagamento> listarPagamentos() {
        return folhaPagamentoService.listarPagamento();
    }
    public void atualizarPagamento(String nome, String novoNome) {
        folhaPagamentoService.atualizarFolhaPagamento(nome, novoNome);
    }
    public void deletarPagamento(String nome) {
        folhaPagamentoService.deletarFolhaPagamento(nome);
    }
}
