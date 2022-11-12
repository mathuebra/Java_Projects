/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.callcenter;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.security.SecureRandom;

/**
 *
 * @author matheus
 */
public class SuporteTecnico {
    
    private HashMap<String,String> bancoSolucoes;
    private ArrayList<String> respostaPadrao;
    private SecureRandom generator = new SecureRandom();
    
    public SuporteTecnico () {
        
        bancoSolucoes = new HashMap<String,String>();
        respostaPadrao = new ArrayList<String>();
        
        inicializaValores();
    }
    
    public void inicializaValores() {
        
        bancoSolucoes.put("lento", "Penso que o problema está relacionado com o hardware. Fazer um upgrade\n do seu processador deve resolver o problema de performance. Você tem algum\n problema com o software?");
        bancoSolucoes.put("performance", "A performance está próxima do esperado nos testes que realizamos. Você está\n executando algum outro processo em paralelo?");
        bancoSolucoes.put("bug", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\n já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\n com mais detalhes?");
        bancoSolucoes.put("buggy", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\n já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\n com mais detalhes?");
        bancoSolucoes.put("windows", "Este é um problema do sistema operacional Windows. Por favor, \n entre em contato com a Microsoft. Não há nada que possamos fazer neste caso.");
        bancoSolucoes.put("macintosh", "Este é um problema do sistema operacional Mac. Por favor, \n entre em contato com a Apple. Não há nada que possamos fazer neste caso.");
        bancoSolucoes.put("caro", "O preço do nosso produto é competitivo. Você já fez uma pesquisa de mercado\n e comparou todas as características do nosso software com outras ofertas de mercado?");
        bancoSolucoes.put("instalação","A instalação é simples e direta. Nós temos programas de instalação previamente configurados\n que farão todo o trabalho para você. Você já leu as instruções\n de instalação?");
        bancoSolucoes.put("memória", "Se você observar detalhadamente os requisitos mínimos de sistema, você verá que\n a memória requerida é 1.5 giga byte. Você deverá adquirir\n mais memória. Mais alguma coisa que deseja saber?");
        bancoSolucoes.put("linux", "Nós consideramos seriamente o suporte Linux. Mas existem muitos problemas.\n Muitos deles dizem respeito a versões incompatíveis. Você poderia ser\n mais preciso?");
        bancoSolucoes.put("danificaram", "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\n no seu sistema. Diga-me sobre sua configuração.");
        bancoSolucoes.put("danificou",  "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\n no seu sistema. Diga-me sobre sua configuração.");
        
        respostaPadrao.add("Isso soa estranho. Você poderia descrever o problema com mais detalhes?");
        respostaPadrao.add("Nenhum outro cliente detalhou um problema parecido com este. \n Qual é a sua configuração de sistema?");
        respostaPadrao.add("Isso parece interessante. Diga-me mais a respeito...");
        respostaPadrao.add("Preciso de maiores informações a respeito.");
        respostaPadrao.add("Você já verificou se existe algum conflito de DLL?");
        respostaPadrao.add("Isso está descrito no manual. Você já deu uma lida no manual que veio junto do seu software?");
        respostaPadrao.add("Sua descrição não foi satisfatória. Você já procurou um técnico\n que poderia detalhar melhor este problema?");
        respostaPadrao.add("Isso não é um problema, é apenas uma característica do software!");
        respostaPadrao.add("Você poderia explicar melhor?");
    }
    
    public String buscaSolucoes (HashSet<String> palavras) {
        
        for (String i:palavras) {
            
            if (bancoSolucoes.containsKey(i)) {
                return bancoSolucoes.get(i);
            }
        }
        
        return null;
    }
    
    public String respostaAleatoria() {
     
        return respostaPadrao.get(generator.nextInt(9));
     
    }
    
    
    
    
}
