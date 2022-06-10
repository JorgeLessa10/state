/*
 ** created by: jorge.lessa
 */
public interface IPedidoEstado {

    String getEstado();
    String realizar(Pedido pedido);
    String confirmar(Pedido pedido);
    String cancelar(Pedido pedido);
    String enviar(Pedido pedido);
    String entregar(Pedido pedido);


}
