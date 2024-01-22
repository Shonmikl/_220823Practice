package org.example._2023_01_22.mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TradeRepositoryTest {

    @Mock
    Trade trade;

    @Mock
    TradeRepository tradeRepository;

    @Mock
    AuditService auditService;

    @Test
    void createTrade() {
        Mockito.when(tradeRepository.createTrade(trade)).thenReturn(Mockito.anyLong());
        TradingService tradingService = new SimpleTradingService(tradeRepository, auditService);
        tradingService.createTrade(trade);

        Mockito.verify(auditService).logNewTrade(trade);
    }
}