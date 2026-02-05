package jokenpo;

public enum Gesto{
    PEDRA{
        @Override
        public boolean vence(Gesto outro) {
            return outro == TESOURA;
        }
    },
    PAPEL{
        @Override
        public boolean vence(Gesto outro) {
            return outro == PEDRA;
        }
    },
    TESOURA{
        @Override
        public boolean vence(Gesto outro) {
            return outro == PAPEL;
        }
    };

    public abstract boolean vence(Gesto outro);

}