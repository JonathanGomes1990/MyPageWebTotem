package classes;

//import br.com.ci.integracao.zoom.service.*;
//import br.com.culturainglesa.cs.model.AlunoMatricula;
//import br.com.culturainglesa.cs.model.AlunoPresenca;
//import br.com.culturainglesa.cs.model.Retorno;
//import br.com.culturainglesa.cs.model.Turma;
//import br.com.culturainglesa.cs.rest.client.ServiceClientCS;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;


import br.com.culturainglesa.digibee.cs.client.ServiceClientDigibeeCS;
import br.com.culturainglesa.digibee.cs.model.Carreira;
import br.com.culturainglesa.digibee.cs.model.Documentos;
import br.com.culturainglesa.digibee.cs.model.Funcionario;
import br.com.culturainglesa.digibee.cs.model.IdExterno;
import br.com.culturainglesa.digibee.cs.model.Instrutor;
import br.com.culturainglesa.digibee.cs.model.Matricula;
import br.com.culturainglesa.digibee.cs.model.Pessoa;
import br.com.culturainglesa.digibee.cs.model.Professor;
import br.com.culturainglesa.digibee.cs.model.Relacionamentos;
import br.com.culturainglesa.digibee.cs.model.Semestre;
import br.com.culturainglesa.digibee.cs.model.Sessao;
import br.com.culturainglesa.digibee.cs.model.Turma;


public class TesteJavaNew {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Atualização na classe
		//Atualização via git
		//atualiza��o via eclipse
		
		
		
		//ZoomService zs = new ZoomService();
		//String urlZoom = null;
		/*HubspotService hubSpot = new HubspotService();
	    ServiceClientNM nm = new ServiceClientNM();
	    String retorno = "";
		
		try {
			//urlZoom = zs.getUserZoom("waldir.lorenzetti@culturainglesa.com.br");
			JSONObject jsonRetorno = hubSpot.getContact("", "culturainglesatecnologia@ci-ti.com");
			//retorno = cs.removeOrAddStudentFromCourse("bruno.queiroga@cooltura.com.br", "110042661411", "I");
			//retorno = nm.IncluirAlunoTurmaClassroom("bruno.queiroga@cooltura.com.br", "110042661411", "I");
		   System.out.println("retorno: "+jsonRetorno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		//System.out.println("urlZoom: "+urlZoom);
		 * 
		 
		
		ServiceClientCS service = new ServiceClientCS();	
		
		List<Turma> listaTurmas = new ArrayList<Turma>();
		
		listaTurmas = service.getTurmas("10000002");
		
		if(listaTurmas.size() > 0) {
			for(int i = 0; i < listaTurmas.size(); i++) {
				
				Turma t = listaTurmas.get(i);
				System.out.println("========== TURMA ==========");
				System.out.println("turma: "+t.getMateria());
				System.out.println("horario: "+t.getDiaSemanaHorario());
				System.out.println("vagas: "+t.getVagas());
				System.out.println("dtIni: "+t.getDtIni());
				System.out.println("dtFim: "+t.getDtFim());
				System.out.println("========== FIM ==========");
			}
		}else {
			System.out.println("Não existem turmas disponíveis");
		}
		
		
		ServiceClientCS service = new ServiceClientCS();	
		AlunoMatricula alunoMatricula = new AlunoMatricula();
		
		alunoMatricula.setEmplid("10000002");
		alunoMatricula.setTurma("000000018977");
		
		Retorno retorno = new Retorno();
		
		try {
			
			System.out.println("Enviando Matrícula ao CS");
			retorno = service.sendMatricula(alunoMatricula);
			System.out.println("Retorno do CS: "+retorno.getTexto());
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro na matrícula: "+e);
		}
		
		ServiceClientCS service = new ServiceClientCS();
		AlunoPresenca alunoPresenca = new AlunoPresenca();
		
		alunoPresenca.setEmplid("10000002");
		alunoPresenca.setTurma("000000018977");
		alunoPresenca.setData("2020-08-20");
		alunoPresenca.setPresenca("Y");
		
		Retorno retorno = new Retorno();
		
		try {
			
			System.out.println("Enviou presença ao CS.");
			retorno = service.sendPresenca(alunoPresenca);
			System.out.println("Retorno da presença no CS: "+retorno.getTexto());
			
		} catch (Exception e) {

			System.out.println("Ocorreu um erro: "+e);
			
		}
		
		
		String plainText = "teste123";
		System.out.println("Original Text  : "+plainText);

        String encryptText = CISP_AES_Encryption.encrypt(plainText);
        System.out.println("Encrypted Text : "+encryptText);
        
        String decryptedText = CISP_AES_Encryption.decrypt(encryptText);
        System.out.println("DeCrypted Text : "+decryptedText);
		
		
		
		ServiceClientLxp service = new ServiceClientLxp();
		AlunoMatricula alunoMatricula = new AlunoMatricula();
		AlunoCancelamento alunoCancelamento = new AlunoCancelamento();
		Turma turma = new Turma();
		Nivel nivel = new Nivel();
		
		nivel.setId(78965);
		nivel.setNome("AT1");
		
		turma.setNivel(nivel);
		turma.setId("12345U");
		turma.setNome("Turma JV");
		turma.setPeriodo("2202");
		turma.setInstituicao("JV");
		turma.setSessao("200");
		turma.setCarreira("JV");
		turma.setStartDate("2020-08-01");
		turma.setEndDate("2020-12-31");
		
		alunoMatricula.setEmplid("9999U");
		alunoMatricula.setFullname("Teste Jonathan JV");
		alunoMatricula.setTurma(turma);
		
		alunoCancelamento.setEmplid("9999U");
		alunoCancelamento.setTurma("12345U");
		
		//Retorno retorno = service.sendMatricula(alunoMatricula);
		Retorno retorno = service.sendCancelamento(alunoCancelamento);
		
		System.out.println("retorno: "+retorno.getTexto());*/
		
		ServiceClientDigibeeCS service = new ServiceClientDigibeeCS(); 
		
		Pessoa pessoa = service.getPessoaPerfil("1163612");
		
		System.out.println("====== PESSOA ======");
		System.out.println("emplid: "+pessoa.getEmplid());
		System.out.println("primeiro_nome: "+pessoa.getPrimeiroNome());
		System.out.println("nome_meio: "+pessoa.getNomeDoMeio());
		System.out.println("ultimo_nome: "+pessoa.getUltimoNome());
		System.out.println("telefone: "+pessoa.getTelefone());
		System.out.println("email: "+pessoa.getEmail());
		System.out.println("nascimento: "+pessoa.getDtNascimento());
		
		List<Documentos> listaDocumentos = pessoa.getListaDocumentos();
		for(int i = 0; i < listaDocumentos.size(); i++) {
			Documentos documentos = new Documentos();
			documentos.setTipo(listaDocumentos.get(i).getTipo());
			documentos.setNumero(listaDocumentos.get(i).getNumero());
			
			System.out.println("===== Documentos =====");
			System.out.println("tipo: "+documentos.getTipo());
			System.out.println("Numeto: "+documentos.getNumero());
		}
		
		List<IdExterno> listaIdsExternos = pessoa.getListaIdsExternos();
		for(int i = 0; i < listaIdsExternos.size(); i++) {
			IdExterno idExterno = new IdExterno();
			idExterno.setTipo(listaIdsExternos.get(i).getTipo());
			idExterno.setValor(listaIdsExternos.get(i).getValor());
			
			System.out.println("===== IdsExternos =====");
			System.out.println("tipo: "+idExterno.getTipo());
			System.out.println("Valor: "+idExterno.getValor());
		}
		
		
		List<Relacionamentos> listaRelacionamentos = pessoa.getListaRelacionamentos();
		for(int i = 0; i < listaRelacionamentos.size(); i++) {
			Relacionamentos relacionamentos = new Relacionamentos();
			relacionamentos.setTipo(listaRelacionamentos.get(i).getTipo());
			relacionamentos.setEmplidRelacionado(listaRelacionamentos.get(i).getEmplidRelacionado());
			
			System.out.println("===== Relacionamentos =====");
			System.out.println("Tipo: "+relacionamentos.getTipo());
			System.out.println("Emplid Relacionado: "+relacionamentos.getEmplidRelacionado());
			
		}
		
		List<Professor> listaProfessor = pessoa.getListaProfessor();
		for(int i = 0; i < listaProfessor.size(); i++) {
			Professor professor = new Professor();
			professor.setMacId(listaProfessor.get(i).getMacId());
			professor.setMacPass(listaProfessor.get(i).getMacPass());
			professor.setTurma(listaProfessor.get(i).getTurma());
			
			System.out.println("===== Professor =====");
			System.out.println("MacId: "+professor.getMacId());
			System.out.println("MacPass: "+professor.getMacPass());
			System.out.println("Turma: "+professor.getTurma());
			
		}
		
		List<Funcionario> listaFuncionario = pessoa.getListaFuncionario();
		for (int i = 0; i < listaFuncionario.size(); i++) {
			Funcionario funcionario = new Funcionario();
			funcionario.setDescricao(listaFuncionario.get(i).getDescricao());
			funcionario.setMacId(listaFuncionario.get(i).getMacId());
			funcionario.setMacPass(listaFuncionario.get(i).getMacPass());
			
			System.out.println("===== Funcionario =====");
			System.out.println("MacId: "+funcionario.getMacId());
			System.out.println("MacPass: "+funcionario.getMacPass());
			System.out.println("Descrição: "+funcionario.getDescricao());
		}
		
		List<Matricula> listaMatriculas = pessoa.getListaMatriculas();
		for (int i = 0; i < listaMatriculas.size(); i++) {
			Matricula matricula = new Matricula();
			matricula.setInstituicao(listaMatriculas.get(i).getInstituicao());
			matricula.setCarreiras(listaMatriculas.get(i).getCarreiras());
			
			System.out.println("===== Matricula =====");
			System.out.println("Insituição: "+matricula.getInstituicao());
			
			List<Carreira> listaCarreiras = matricula.getCarreiras();
			for (int j = 0; j < listaCarreiras.size(); j++) {
				Carreira carreira = new Carreira();
				carreira.setIdCarreira(listaCarreiras.get(j).getIdCarreira());
				carreira.setDescricaoCarreira(listaCarreiras.get(j).getDescricaoCarreira());
				carreira.setSemestres(listaCarreiras.get(j).getSemestres());
				
				System.out.println("\t===== Carreira =====");
				System.out.println("\tidCarreira: "+carreira.getIdCarreira());
				System.out.println("\tDescrição: "+carreira.getDescricaoCarreira());
				
				List<Semestre> listaSemestres = carreira.getSemestres();
				for (int k = 0; k < listaSemestres.size(); k++) {
					Semestre semestre = new Semestre();
					semestre.setDescricaiSemestre(listaSemestres.get(k).getDescricaiSemestre());
					semestre.setSessoes(listaSemestres.get(k).getSessoes());
					
					System.out.println("\t\t===== Semestre =====");
					System.out.println("\t\tdescricao: "+semestre.getDescricaiSemestre());
					
					
					List<Sessao> listaSessoes = semestre.getSessoes();
					for (int l = 0; l < listaSessoes.size(); l++) {
						Sessao sessao = new Sessao();
						sessao.setIdSessao(listaSessoes.get(l).getIdSessao());
						sessao.setDescricaoSessao(listaSessoes.get(l).getDescricaoSessao());
						sessao.setTurmas(listaSessoes.get(l).getTurmas());
						
						System.out.println("\t\t\t===== Sessao =====");
						System.out.println("\t\t\tidSessao: "+sessao.getIdSessao());
						System.out.println("\t\t\tdescricao: "+sessao.getDescricaoSessao());
						
						List<Turma> listaTurmas = sessao.getTurmas();
						for (int m = 0; m < listaTurmas.size(); m++) {
							Turma turma = new Turma();
							turma.setIdTurma(listaTurmas.get(m).getIdTurma());
							turma.setIdNivel(listaTurmas.get(m).getIdNivel());
							turma.setNomeNivel(listaTurmas.get(m).getNomeNivel());
							turma.setDescricaoNivel(listaTurmas.get(m).getDescricaoNivel());
							turma.setIdFilial(listaTurmas.get(m).getIdFilial());
							turma.setNomeFilial(listaTurmas.get(m).getNomeFilial());
							turma.setIdLocal(listaTurmas.get(m).getIdLocal());
							turma.setNomeLocal(listaTurmas.get(m).getNomeLocal());
							turma.setAnoAcademico(listaTurmas.get(m).getAnoAcademico());
							turma.setDtInicio(listaTurmas.get(m).getDtInicio());
							turma.setDtFim(listaTurmas.get(m).getDtFim());
							turma.setDiaSemana(listaTurmas.get(m).getDiaSemana());
							turma.setHorario(listaTurmas.get(m).getHorario());
							turma.setAcessoEcampus(listaTurmas.get(m).getAcessoEcampus());
							turma.setAcessoEyoung(listaTurmas.get(m).getAcessoEyoung());
							turma.setAcessoMyguide(listaTurmas.get(m).getAcessoMyguide());
							turma.setStatusTurma(listaTurmas.get(m).getStatusTurma());
							turma.setStatusMatricula(listaTurmas.get(m).getStatusMatricula());
							turma.setBoletimPrimeiroPeriodo(listaTurmas.get(m).getBoletimPrimeiroPeriodo());
							turma.setBoletimSegundoPeriodo(listaTurmas.get(m).getBoletimSegundoPeriodo());
							turma.setListaInstrutores(listaTurmas.get(m).getListaInstrutores());
							
							System.out.println("\t\t\t\t===== Turma =====");
							System.out.println("\t\t\t\tidTurma: "+turma.getIdTurma());
							System.out.println("\t\t\t\tidNivel: "+turma.getIdNivel());
							System.out.println("\t\t\t\tnmNivel: "+turma.getNomeNivel());
							System.out.println("\t\t\t\tdescNivel: "+turma.getDescricaoNivel());
							System.out.println("\t\t\t\tidFilial: "+turma.getIdFilial());
							System.out.println("\t\t\t\tnmFilial: "+turma.getNomeFilial());
							System.out.println("\t\t\t\tidLocal: "+turma.getIdLocal());
							System.out.println("\t\t\t\tnmLocal: "+turma.getNomeLocal());
							System.out.println("\t\t\t\tanoAcad: "+turma.getAnoAcademico());
							System.out.println("\t\t\t\tdtIni: "+turma.getDtInicio());
							System.out.println("\t\t\t\tdtFim: "+turma.getDtFim());
							System.out.println("\t\t\t\tdiaSemana: "+turma.getDiaSemana());
							System.out.println("\t\t\t\thorario: "+turma.getHorario());
							System.out.println("\t\t\t\tacessoECampus: "+turma.getAcessoEcampus());
							System.out.println("\t\t\t\tacessoEYoung: "+turma.getAcessoEyoung());
							System.out.println("\t\t\t\tacessoMyGuide: "+turma.getAcessoMyguide());
							System.out.println("\t\t\t\tstatusTurma: "+turma.getStatusTurma());
							System.out.println("\t\t\t\tstatusMatricula: "+turma.getStatusMatricula());
							System.out.println("\t\t\t\tboletim 1º periodo: "+turma.getBoletimPrimeiroPeriodo());
							System.out.println("\t\t\t\tboletim 1º periodo: "+turma.getBoletimSegundoPeriodo());
							
							List<Instrutor> listaInstrutores = turma.getListaInstrutores();
							for (int n = 0; n < listaInstrutores.size(); n++) {
								Instrutor instrutor = new Instrutor();
								instrutor.setEmplid(listaInstrutores.get(m).getEmplid());
								instrutor.setNome(listaInstrutores.get(m).getNome());
								instrutor.setTipo(listaInstrutores.get(m).getTipo());
								
								System.out.println("\t\t\t\t\t===== Instrutores =====");
								System.out.println("\t\t\t\t\templid: "+instrutor.getEmplid());
								System.out.println("\t\t\t\t\tnome: "+instrutor.getNome());
								System.out.println("\t\t\t\t\ttipo: "+instrutor.getTipo());
							}
							
						}
					}
				}
			}
		
			System.out.println("===== FIM MATRICULA =====");
		}
		
		
		System.out.println("plat_bilingue: "+pessoa.getPlataformas());
		
	}

}
 
