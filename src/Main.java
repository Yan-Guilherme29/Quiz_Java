public class Main {
    public static void main(String[] args) {
        Questao leia = new Questao();
        int acertos = 0;
        int erros   = 0;

        String[] perguntas = {
                " 01 - O que é Engenharia de Software? ",
                " 02 - O que é UML? ",
                " 03 - Qual a função do SCRUM? ",
                " 04 - Em um sistema de controle de versão, qual é o propósito de fazer um commit ?",
                " 05 - O que significa o termo deploy em desenvolvimento de software? ",
                " 06 - No contexto de Engenharia de Software, o que significa refatoração? ",
                " 07 - O que é uma variável em programação? ",
                " 08 - O que significa debugar um programa? ",
                " 09 - O que é uma linguagem de programação? ",
                " 10 - Qual das seguintes opções é um exemplo de uma linguagem de programação? ",
                " 11 - O que é um algoritmo? ",
                " 12 - Qual é a finalidade de um banco de dados? ",
                " 13 - O que significa a sigla IDE, no contexto de desenvolvimento de software? ",
                " 14 - Qual é a principal função de um compilador? ",
                " 15 - Qual a principal característica da metodologia em cascata? "
        };

        String[][] opcoes = {
                {" A) Um software de engenharia ", "B) Uma metodologia ", "C) Uma ciência ", "D) Nenhuma das anteriores ", "E) Todas as anteriores"},
                {" A) Linguagem de programação", "B) Linguagem de modelagem", "C) Linguagem matemática", "D) Linguagem de marcação", "E) Linguagem de montagem"},
                {" A) Organizar o desenvolvimento de projetos", "B) Definir funções", "C) Medir a qualidade de software", "D) Corrigir falhas", "E) Aumentar a segurança"},
                {" A) Enviar alterações locais para o repositório principal", "B) Reverter mudanças feitas no código", "C) Sincronizar o código entre diferentes branches", "D) Corrigir conflitos de versão", "E) Testar a integração do código"},
                {" A) Realizar testes unitários no software", "B) Colocar o software em operação, disponível para uso", "C) Iniciar o desenvolvimento de novas funcionalidades", "D) Criar o ambiente de desenvolvimento", "E) Documentar o código para a equipe técnica"},
                {" A) Reescrever todo o software do zero", "B) Testar novos métodos de integração de software", "C) Implementar novas funcionalidades no sistema", "D) Corrigir bugs de segurança críticos", "E) Alterar o código para melhorar sua estrutura sem alterar seu comportamento externo"},
                {" A) Um tipo de algoritmo", "B) Um componente físico do computador", "C) Um espaço na memória para armazenar valores temporários", "D) Um dispositivo de entrada de dados", "E) Uma função de sistema operacional"},
                {" A) Encontrar e corrigir erros no código", "B) Otimizar o desempenho do software", "C) Atualizar a documentação do projeto", "D) Adicionar novas funcionalidades ao software", "E) Testar o software em diferentes dispositivos"},
                {" A) Um aplicativo de gerenciamento de arquivos", "B) Uma ferramenta para criar hardware", "Um tipo de arquivo executável", "D) Um código para acessar a internet", "E) Uma maneira de comunicar instruções ao computador"},
                {" A) Microsoft Word", "B) Excel", "C) Photoshop", "D) Java", "E) HTML"},
                {" A) Um tipo de software", "B) Uma técnica de hardware", "C) Uma sequência de instruções para resolver um problema", "D) Um dispositivo de entrada de dados", "E) Um comando específico de uma linguagem"},
                {" A) Armazenar e organizar informações de maneira estruturada ", "B) Processar imagens digitais", "C) Controlar o acesso à internet", "D) Gerenciar o sistema operacional", "E) Proteger arquivos contra vírus"},
                {" A) Interface Design Environment", "B) Integrated Development Environment (Ambiente de Desenvolvimento Integrado)", "C) Internet Data Entry", "D) Input Device Emulator", "E) Internal Debugger Environment"},
                {" A) Traduzir o código-fonte para código executável", "B) Realizar a documentação do projeto","C) Executar o programa diretamente", "D) Gerar relatórios sobre o desempenho do software", "E) Corrigir erros automaticamente"},
                {" A) O software é entregue em pequenas partes", "B) O cliente participa de todas as fases", "C) O desenvolvimento é feito em etapas sequenciais", "D) O foco é na prototipagem rápida", "E) A equipe de desenvolvimento é autônoma"}
        };

        // Questões           1    2    3    4    5    6    7    8    9    10   11   12   13   14   15
        String[] corretas = {"c", "b", "a", "a", "b", "e", "c", "a", "e", "d", "c", "a", "b", "a", "c"};

        System.out.println(" ");
        System.out.println(" =-------------------------------------------------------------------------------------------------------= ");
        System.out.println(" =                              Centro Universitário Alfredo Nasser                                      = ");
        System.out.println(" =                                Yan Guilherme Siqueira Gomides                                         = ");
        System.out.println(" =                                        Brenno Pimenta                                                 = ");
        System.out.println(" =                                                                                                       = ");
        System.out.println(" =               Olá! Bem vindos ao QUIZ de Java com o tema 'Engenharia de Software'                     = ");
        System.out.println(" =                                      Te Desejo Boa Sorte !!!                                          = ");
        System.out.println(" =-------------------------------------------------------------------------------------------------------= ");
        System.out.println(" ");

        System.out.println("                                             Começando...                                                ");
        System.out.println(" ");


        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(" =-------------------------------------------------------------------------------------------------------= ");
            leia.pergunta = perguntas[i];
            leia.opcaoA   = opcoes[i][0];
            leia.opcaoB   = opcoes[i][1];
            leia.opcaoC   = opcoes[i][2];
            leia.opcaoD   = opcoes[i][3];
            leia.opcaoE   = opcoes[i][4];
            leia.correta  = corretas[i];

            leia.escrevaQuestao();
            String resposta = leia.leiaResposta();
            boolean correta = leia.isCorreta(resposta);

            if (correta) {
                acertos++;
            } else {
                erros++;
            }
        }

        System.out.println(" =-------------------------------------------------------------------------------------------------------= ");
        double porcentagemAcertos = ((double) acertos / perguntas.length) * 100;
        System.out.println(" Resultados");
        System.out.println(" ");
        System.out.println(" Quantidade de acertos: " + acertos);
        System.out.println(" Quantidade de erros: " + erros);
        System.out.printf(" Porcentagem de acertos: %.2f%%\n", porcentagemAcertos);

        if (porcentagemAcertos > 60) {
            System.out.println("Parabéns, você se esforçou bastante !! ");
        } else {
               System.out.println("Estude um pouco mais e irá se sair muito bem !! ");
        }


    }
}