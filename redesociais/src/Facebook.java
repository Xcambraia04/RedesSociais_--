public class Facebook extends RedeSocial implements Compartilhamento, VideoConferencia, Comparable<Facebook>{


    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }


    @Override
    public void compartilhar() {
        System.out.println("compartilhou um post do Facebook");
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um vídeo Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentário Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("abriu uma live pelo Facebook");
    }

    @Override
    public int compareTo(Facebook facebook) {
        if(facebook.senha==this.senha)
            return 0;
        else
            return 1;
    }
}