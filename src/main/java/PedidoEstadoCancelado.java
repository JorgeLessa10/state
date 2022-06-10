/*
 ** created by: jorge.lessa
 */
public class PedidoEstadoCancelado implements IPedidoEstado{
    @Override
    public String getEstado() {
        return "Cancelado";
    }

    @Override
    public String realizar(Pedido pedido) {
        return "Impossivel realizar o pedido";
    }

    @Override
    public String confirmar(Pedido pedido) {
        return "Impossível confirmar pedido cancelado";
    }

    @Override
    public String cancelar(Pedido pedido) {
        return "Impossível cancelar pedido ja cancelado";
    }

    @Override
    public String enviar(Pedido pedido) {
        return "Só é possivel enviar pedidos confirmados";
    }

    @Override
    public String entregar(Pedido pedido) {
        return "Só é possivel entregar pedidos enviados";
    }
}
