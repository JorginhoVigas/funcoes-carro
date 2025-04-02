public class Carro {
    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado && marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Não é possível desligar o carro. Certifique-se de que ele está em ponto morto e parado.");
        }
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro está desligado. Ligue-o primeiro.");
            return;
        }
        if (marcha == 0) {
            System.out.println("Não é possível acelerar em ponto morto.");
            return;
        }
        if (velocidade < 120 && velocidadeDentroDaMarcha(velocidade + 1)) {
            velocidade++;
            System.out.println("Acelerando. Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("Velocidade máxima atingida para esta marcha.");
        }
    }

    public void diminuirVelocidade() {
        if (!ligado) {
            System.out.println("O carro está desligado. Ligue-o primeiro.");
            return;
        }
        if (velocidade > 0) {
            velocidade--;
            System.out.println("Diminuindo velocidade. Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("O carro está desligado. Ligue-o primeiro.");
            return;
        }
        if (Math.abs(novaMarcha - marcha) != 1) {
            System.out.println("Não é permitido pular marchas.");
            return;
        }
        if (velocidadeDentroDaMarcha(velocidade)) {
            marcha = novaMarcha;
            System.out.println("Marcha trocada para: " + marcha);
        } else {
            System.out.println("Velocidade incompatível com a marcha desejada.");
        }
    }

    public void virar(String direcao) {
        if (!ligado) {
            System.out.println("O carro está desligado. Ligue-o primeiro.");
            return;
        }
        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para " + direcao);
        } else {
            System.out.println("Não é possível virar. A velocidade deve estar entre 1km/h e 40km/h.");
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

    private boolean velocidadeDentroDaMarcha(int velocidade) {
        switch (marcha) {
            case 0: return velocidade == 0;
            case 1: return velocidade >= 0 && velocidade <= 20;
            case 2: return velocidade >= 21 && velocidade <= 40;
            case 3: return velocidade >= 41 && velocidade <= 60;
            case 4: return velocidade >= 61 && velocidade <= 80;
            case 5: return velocidade >= 81 && velocidade <= 100;
            case 6: return velocidade >= 101 && velocidade <= 120;
            default: return false;
        }
    }
}