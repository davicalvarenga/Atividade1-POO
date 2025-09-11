public class main {
    public static void main(String[] args) {
        
        // Criando objetos de Livro e Revista
        Livro livro = new Livro();
        livro.setTitulo("1984");
        livro.setAno(1949);
        livro.setAutor("George Orwell");
        
        Revista revista = new Revista();
        revista.setTitulo("Veja");
        revista.setAno(2024);
        revista.setEdicao(2845);
        
        // Armazenando em um array de Publicacoes
        Publicacoes[] publicacoes = {livro, revista};
        
        // Percorrendo o array e exibindo as informações de cada item
        for (int i = 0; i < publicacoes.length; i++) {
            publicacoes[i].exibirInformacoes();
            System.out.println();
        }
    }
}