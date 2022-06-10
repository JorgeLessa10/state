/*
 ** created by: jorge.lessa
 */
public class PedidoEstadoConfirmado implements IPedidoEstado{
    @Override
    public String getEstado() {
        return "Confirmado";
    }

    @Override
    public String realizar(Pedido pedido) {
        return "Impossivel realizar pedido";
    }

    @Override
    public String confirmar(Pedido pedido) {
        return "Impossível confirmar pedido ja confirmado";
    }

    @Override
    public String cancelar(Pedido pedido) {
        return "Pedido cancelado";
    }

    @Override
    public String enviar(Pedido pedido) {
        return "Pedido enviado";
    }

    @Override
    public String entregar(Pedido pedido) {
        return "Só é possivel entregar pedidos enviados";
    }
}
