class TinyShip extends Embarcacao {
    public TinyShip(int linha, int coluna1, int coluna2, int coluna3, int coluna4) {
        super(linha, coluna1, 0, 0, 0);
    }

    @Override
    public char getInicial() {
        return 'T'; // 'T' representa o TinyShip
    }
}