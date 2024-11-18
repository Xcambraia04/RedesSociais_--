public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento, Comparable<GooglePlus>{

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("compartilhou um post do Google+");
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Google+");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um vídeo no Google+");
    }

    @Overrxide
    public void postarComentario() {
        System.out.println("postou um comentário no Google+");
    }

    @Override
    public void fazStreaming() {
        System.out.println("abriu uma live no Google+");
    }

    @Override
    public int compareTo(GooglePlus google) {
        if(google.senha==this.senha)
            return 0;
        else
            return 1;
    }
}