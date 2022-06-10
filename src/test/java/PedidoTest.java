import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void naoDeveRealizarPedidoRealizado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoRealizado());
        assertEquals("Impossivel realizar o pedido", pedido.realizar());
    }

    @Test
    void deveConfirmarPedidoRealizado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoRealizado());
        assertEquals("Pedido confirmado", pedido.confirmar());
    }

    @Test
    void deveCancelarPedidoRealizado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoRealizado());
        assertEquals("Pedido cancelado", pedido.cancelar());
    }

    @Test
    void naoDeveEnviarPedidoRealizado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoRealizado());
        assertEquals("Só é possivel enviar pedidos confirmados", pedido.enviar());
    }

    @Test
    void naoDeveEntregarPedidoRealizado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoRealizado());
        assertEquals("Só é possivel entregar pedidos enviados", pedido.entregar());
    }

    //    Pedido confirmado
    @Test
    void naoDeveRealizarPedidoConfirmado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoConfirmado());
        assertEquals("Impossivel realizar pedido", pedido.realizar());
    }

    @Test
    void naoDeveConfirmarPedidoConfirmado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoConfirmado());
        assertEquals("Impossível confirmar pedido ja confirmado", pedido.confirmar());
    }

    @Test
    void deveCancelarPedidoConfirmado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoConfirmado());
        assertEquals("Pedido cancelado", pedido.cancelar());
    }

    @Test
    void deveEnviarPedidoConfirmado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoConfirmado());
        assertEquals("Pedido enviado", pedido.enviar());
    }

    @Test
    void naoDeveEntregarPedidoConfirmado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoConfirmado());
        assertEquals("Só é possivel entregar pedidos enviados", pedido.entregar());
    }

    //    Pedido Cancelado
    @Test
    void naoDeveRealizarPedidoCancelado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoCancelado());
        assertEquals("Impossivel realizar o pedido", pedido.realizar());
    }

    @Test
    void naoDeveConfirmarPedidoCancelado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoCancelado());
        assertEquals("Impossível confirmar pedido cancelado", pedido.confirmar());
    }

    @Test
    void naoDeveCancelarPedidoCancelado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoCancelado());
        assertEquals("Impossível cancelar pedido ja cancelado", pedido.cancelar());
    }

    @Test
    void deveEnviarPedidoCancelado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoCancelado());
        assertEquals("Só é possivel enviar pedidos confirmados", pedido.enviar());
    }

    @Test
    void naoDeveEntregarPedidoCancelado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoCancelado());
        assertEquals("Só é possivel entregar pedidos enviados", pedido.entregar());
    }

    //    Pedido Enviado
    @Test
    void naoDeveRealizarPedidoEnviado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoEnviado());
        assertEquals("Impossivel realizar pedido", pedido.realizar());
    }

    @Test
    void naoDeveConfirmarPedidoEnviado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoEnviado());
        assertEquals("Impossível confirmar pedido", pedido.confirmar());
    }

    @Test
    void naoDeveCancelarPedidoEnviado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoEnviado());
        assertEquals("Impossivel cancelar pedido enviado", pedido.cancelar());
    }

    @Test
    void naoDeveEnviarPedidoEnviado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoEnviado());
        assertEquals("Impossível enviar pedido ja enviado", pedido.enviar());
    }

    @Test
    void deveEntregarPedidoEnviado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoEnviado());
        assertEquals("Pedido entregue", pedido.entregar());
    }

//    Pedido entregue
    @Test
    void naoDeveRealizarPedidoEntregue() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoEntregue());
        assertEquals("Impossivel realizar pedido", pedido.realizar());
    }

    @Test
    void naoDeveConfirmarPedidoEntregue() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoEntregue());
        assertEquals("Impossível confirmar pedido", pedido.confirmar());
    }

    @Test
    void naoDeveCancelarPedidoEntregue() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoEntregue());
        assertEquals("Impossivel cancelar pedido entregue", pedido.cancelar());
    }

    @Test
    void naoDeveEnviarPedidoEntregue() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoEntregue());
        assertEquals("Impossível enviar pedido entregue", pedido.enviar());
    }

    @Test
    void deveEntregarPedidoEntregue() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoEstadoEntregue());
        assertEquals("Impossível entregar pedido entregue", pedido.entregar());
    }
}