public class Lampada {
    private String marca;
    private String modelo;
    private String tipo;
    private int estado;
    private String estadoStr;

    public Lampada(String marca, String modelo, String tipo) {
        setMarca(marca);
        setModelo(modelo);
        setTipo(tipo);
        this.estado = 0;
        this.estadoStr = "Apagada";
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

    public int getEstado() {
        return estado;
    }

    public String getEstadoStr() {
        return estadoStr;
    }
    
    public void mudarEstado() {
        this.estado = (this.estado + 1) % 3;
        switch(this.estado) {
            case 0:
                this.estadoStr = "Apagada";
                break;
            case 1:
                this.estadoStr = "Acesa";
                break;
            case 2:
                this.estadoStr = "Meia-luz";
                break;
        }
    }
    
    @Override
    public String toString() {
        return "[Marca=" + getMarca() + ", Modelo=" + getModelo() + ", Tipo=" + getTipo() + ", Estado=" + getEstadoStr() + "]";
    }
}
