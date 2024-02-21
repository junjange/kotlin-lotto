package lotto.model

data class DrawResult(
    val winningLotto: Lotto,
    val bonusNumber: LottoNumber,
) {
    init {
        require(bonusNumber !in winningLotto.lottoNumbers) { BONUS_NUMBER_DUPLICATED_ERROR_MESSAGE }
    }

    companion object {
        const val BONUS_NUMBER_DUPLICATED_ERROR_MESSAGE = "보너스 숫자는 당첨 번호와 중복되면 안됩니다."
    }
}
