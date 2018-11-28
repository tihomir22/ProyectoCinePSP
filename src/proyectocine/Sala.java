package proyectocine;

public class Sala {

    private int numeroSala;
    private boolean sala3D;
    private int files;
    private int tamanyFila;

    //CONSTRUCTORS
    //CONSTRUCTOR INTERACTIU
    public Sala() {
        //...
        // IMPLEMENTAR CODI ACÍ
        //...
    }

    //*********************************************************
    //CONSTRUCTOR1
    public Sala(int numero, int nfiles, int seients) {
        this.numeroSala = numero;
        this.files = nfiles;
        this.tamanyFila = seients;
    }

    //*********************************************************
    //CONSTRUCTOR2
    public Sala(int numero, boolean sala3d, int nfiles, int seients) {
        this.numeroSala = numero;
        this.sala3D = sala3d;
        this.files = nfiles;
        this.tamanyFila = seients;
    }

    //*********************************************************
    //MODIFICA LES DADES DE LA SALA
    public void modificaSala(Sala s) {
        
    }

    //*********************************************************
    //TOSTRING 
    @Override
    public String toString() {
        return "Sala [numeroSala=" + numeroSala + "\n\t sala3D=" + sala3D
                + "\n\t files=" + files + "\n\t tamanyFila=" + tamanyFila + "]";
    }

    //*********************************************************
    public int getNumeroSala() {
        return numeroSala;
    }

    //*********************************************************
    public int getFiles() {
        return files;
    }

    //*********************************************************
    public void setFiles(int files) {
        this.files = files;
    }

    //*********************************************************
    public int getTamanyFila() {
        return this.tamanyFila;
    }

    //*********************************************************
    public void setTamanyFila(int tamanyFila) {
        this.tamanyFila = tamanyFila;
    }

    //*********************************************************
    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    //*********************************************************
    public boolean isSala3D() {
        return sala3D;
    }

    //*********************************************************
    public void setSala3D(boolean sala3d) {
        sala3D = sala3d;
    }

}
