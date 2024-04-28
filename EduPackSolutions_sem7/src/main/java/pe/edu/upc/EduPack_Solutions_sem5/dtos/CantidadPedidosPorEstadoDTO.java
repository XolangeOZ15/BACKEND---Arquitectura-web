package pe.edu.upc.EduPack_Solutions_sem5.dtos;

public class CantidadPedidosPorEstadoDTO {
    private String estado;
    private int cantidadPedidos;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidadPedidos() {
        return cantidadPedidos;
    }

    public void setCantidadPedidos(int cantidadPedidos) {
        this.cantidadPedidos = cantidadPedidos;
    }
}
