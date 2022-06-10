/*
 ** created by: jorge.lessa
 */
public class PedidoEstadoRealizado implements IPedidoEstado{
    @Override
    public String getEstado() {
        return "Realizado";
    }

    @Override
    public String realizar(Pedido pedido) {
        return "Impossivel realizar o pedido";
    }

    @Override
    public String confirmar(Pedido pedido) {
        return "Pedido confirmado";
    }

    @Override
    public String cancelar(Pedido pedido) {
        return "Pedido cancelado";
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
