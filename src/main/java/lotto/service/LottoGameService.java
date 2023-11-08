package lotto.service;

import lotto.domain.money.Money;

public class LottoGameService {
    private final InputService inputService;
    private final OutputService outputService;

    public LottoGameService(InputService inputService, OutputService outputService) {
        this.inputService = inputService;
        this.outputService = outputService;
    }

    public Money purchaseAmount() {
        outputService.purchaseAmount();
        return inputService.inputMoney();
    }
}
