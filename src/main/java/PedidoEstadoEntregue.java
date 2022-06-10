
/*
 ** created by: jorge.lessa
 */
public class PedidoEstadoEntregue implements IPedidoEstado{
    @Override
    public String getEstado() {
        return "Entregue";
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
        return "Impossivel cancelar pedido entregue";
    }

    @Override
    public String enviar(Pedido pedido) {
        return "Impossível enviar pedido entregue";
    }

    @Override
    public String entregar(Pedido pedido) {
        return "Impossível entregar pedido entregue";
    }
}
