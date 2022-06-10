/*
 ** created by: jorge.lessa
 */
public class Pedido {

    private Integer numero;
    private IPedidoEstado estado;

    public Pedido() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setEstado(IPedidoEstado estado) {
        this.estado = estado;
    }

    public String realizar()
    {
        return estado.realizar(this);
    }

    public String confirmar()
    {
        return estado.confirmar(this);
    }

    public String cancelar()
    {
        return estado.cancelar(this);
    }

    public String enviar()
    {
        return estado.enviar(this);
    }
    public String entregar()
    {
        return estado.entregar(this);
    }
}
