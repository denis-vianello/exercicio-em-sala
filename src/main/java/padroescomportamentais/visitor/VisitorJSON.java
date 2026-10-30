/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padroescomportamentais.visitor;

/**
 *
 * @author user
 */
public class VisitorJSON implements Visitor {

    @Override
    public String exibirAluno(Aluno aluno) {
        return "{"
                + "\"matricula\": " + aluno.getMatricula() + ", "
                + "\"nome\": \"" + aluno.getNome() + "\", "
                + "\"curso\": \"" + aluno.getNomeCurso() + "\""
                + "}";
    }

    @Override
    public String exibirProfessor(Professor professor) {
        return "{"
                + "\"matricula\": " + professor.getMatricula() + ", "
                + "\"nome\": \"" + professor.getNome() + "\", "
                + "\"titulacao\": \"" + professor.getTitulacao() + "\""
                + "}";
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "{"
                + "\"codigo\": " + funcionario.getCodigo() + ", "
                + "\"nome\": \"" + funcionario.getNome() + "\", "
                + "\"salario\": " + funcionario.getSalario()
                + "}";
    }

}
