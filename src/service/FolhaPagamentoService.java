package service;

import model.FolhaPagamento;
import model.Funcionario;

import java.util.ArrayList;
import java.util.List;


public class FolhaPagamentoService {
    List<FolhaPagamento> folhaPagamento = new ArrayList<>();

    public double calcularSalario(
            Funcionario funcionario) {

        double desconto =
                funcionario.getFaltas() * 100;

        double extra =
                funcionario.getHorasExtrasTotais() * 50;

        return funcionario.getSalarioBase()
                - desconto
                + extra;
    }

    public void cadastrarPagamento(FolhaPagamento pagamento) {
        folhaPagamento.add(pagamento);
    }

    public List<FolhaPagamento> listarPagamento() {
        return folhaPagamento;
    }

    public void atualizarFolhaPagamento(String nome, String novoNome) {
        for (FolhaPagamento pagamento : folhaPagamento) {
            if (pagamento.getNome().equalsIgnoreCase(nome)) {
                pagamento.setNome(novoNome);
                System.out.println("Atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Pagamento não foi encontrado.");
    }

    public void deletarFolhaPagamento(int id) {
        for (int i = 0; i < folhaPagamento.size(); i++) {
            if (folhaPagamento.get(i).getId()) {
                folhaPagamento.remove(id);
                System.out.println("Deletado com sucesso!");
                return;
            }
            System.out.println("Pagamento não encontrado.");
        }
    }
}
