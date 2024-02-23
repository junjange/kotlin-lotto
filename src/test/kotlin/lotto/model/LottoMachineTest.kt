package lotto.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class LottoMachineTest {
    @ParameterizedTest
    @CsvSource("-1", "한글")
    fun `구입 금액은 자연수이면서 1000 이상이다`(price: String) {
        assertThrows<IllegalArgumentException> {
            LottoMachine.createLottoBundle(price)
        }
    }

    @Test
    fun `1000으로 1장의 티켓을 받는다`() {
        assertThat(LottoMachine.getNumberOfLottoTickets("1000")).isEqualTo(1)
    }
}
