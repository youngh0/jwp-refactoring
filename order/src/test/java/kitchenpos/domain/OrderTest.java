package kitchenpos.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrderTest {
    @Test
    void 주문의_상태가_COMPLETION_인지_확인한다() {
        Order order = new Order(1L);
        order.changeOrderStatus(OrderStatus.COMPLETION);
        assertThat(order.isCompleted()).isTrue();
    }

    @Test
    void 주문의_상태가_COMPLETION이_아닌지_확인한다() {
        Order order = new Order(1L);

        assertThat(order.isCompleted()).isFalse();
    }
}