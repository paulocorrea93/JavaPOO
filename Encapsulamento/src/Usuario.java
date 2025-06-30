public class Usuario {

        private String nome;
        private String email;
        private String senha;

        Usuario(String nome, String email, String senha){

            this.nome = nome;
            this.email = email;
            this.senha = senha;

        }

        public String getNome(){
            return this.nome;
        }

        public void setNome(String novoNome){
            this.nome = novoNome;
        }

        public String getEmail(){
            return this.email;
    }

        public void setEmail(String novoEmail){
            this.email = novoEmail;
        }

        public void setSenha(String novaSenha){
           if (novaSenha.length() >=8){
            this.senha = novaSenha;
           }
        }
           public void mostrarUsuario(){
               System.out.println("Nome: " + nome + " | Email: " + email);
            }

}
