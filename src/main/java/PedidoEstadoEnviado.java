/*
 ** created by: jorge.lessa
 */
public class PedidoEstadoEnviado implements IPedidoEstado{
    @Override
    public String getEstado() {
        return "Enviado";
    }

    @Override
    public String realizar(Pedido pedido) {
        return "Impossivel realizar pedido";
    }

    @Override
    public String confirmar(Pedido pedido) {
        return "Impossível confirmar pedido";
    }

    @Override
    public String cancelar(Pedido pedido) {
        return "Impossivel cancelar pedido enviado";
    }

    @Override
    public String enviar(Pedido pedido) {
        return "Impossível enviar pedido ja enviado";
    }

    @Override
    public String entregar(Pedido pedido) {
        return "Pedido entregue";
    }
}
