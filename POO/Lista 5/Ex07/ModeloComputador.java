public class ModeloComputador {
    private int placaMae;
    private int processador;
    private int ram;
    private int hd;
    private int monitor;
    private double preco;

    public ModeloComputador() {
        this.placaMae = 0;
        this.processador = 0;
        this.ram = 0;
        this.hd = 0;
        this.monitor = 0;
        this.preco = 0.0;
    }

    public void setPlacaMae(int placaMae) {
        this.placaMae = placaMae;
    }

    public int getPlacaMae() {
        return placaMae;
    }

    public void setProcessador(int processador) {
        this.processador = processador;
    }

    public int getProcessador() {
        return processador;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public int getHd() {
        return hd;
    }

    public void setMonitor(int monitor) {
        this.monitor = monitor;
    }

    public int getMonitor() {
        return monitor;
    }

    public double calcularPreco() {
        this.preco = getPlacaMae() + getProcessador() + getRam() + getHd() + getMonitor();
        return preco;
    }
}
