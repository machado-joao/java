public class Lampada {
    private String marca;
    private String modelo;
    private String tipo;
    private boolean estado;

    public Lampada(String marca, String modelo, String tipo) {
        setMarca(marca);
        setModelo(modelo);
        setTipo(tipo);
        this.estado = false;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void acenderLampada() {
        this.estado = true;
    }
    
    public void apagarLampada() {
        this.estado = false;
    }
    
    @Override
    public String toString() {
        return "[Marca=" + getMarca() + ", Modelo=" + getModelo() + ", Tipo=" + getTipo() + ", Estado=" + (getEstado() ? "Ligada" : "Desligada") + "]";
    }
}
