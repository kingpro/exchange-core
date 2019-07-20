package org.openpredict.exchange.tests.util;

import com.google.common.collect.Sets;
import org.openpredict.exchange.beans.CoreSymbolSpecification;
import org.openpredict.exchange.beans.SymbolType;

import java.util.Set;

public final class TestConstants {


    public static final int SYMBOL_MARGIN = 5991;
    public static final int SYMBOL_EXCHANGE = 9269;
    public static final int SYMBOL_EXCHANGE_FEE = 9340;

    public static final long UID_1 = 1440001;
    public static final long UID_2 = 1440002;

    public static final int SYMBOL_AUTOGENERATED_RANGE_START = 40000;

    public static final int CURRENECY_AUD = 36;
    public static final int CURRENECY_BRL = 986;
    public static final int CURRENECY_CAD = 124;
    public static final int CURRENECY_CHF = 756;
    public static final int CURRENECY_CNY = 156;
    public static final int CURRENECY_CZK = 203;
    public static final int CURRENECY_DKK = 208;
    public static final int CURRENECY_EUR = 978;
    public static final int CURRENECY_GBP = 826;
    public static final int CURRENECY_HKD = 344;
    public static final int CURRENECY_JPY = 392;
    public static final int CURRENECY_KRW = 410;
    public static final int CURRENECY_MXN = 484;
    public static final int CURRENECY_MYR = 458;
    public static final int CURRENECY_NOK = 578;
    public static final int CURRENECY_NZD = 554;
    public static final int CURRENECY_PLN = 985;
    public static final int CURRENECY_RUB = 643;
    public static final int CURRENECY_SEK = 752;
    public static final int CURRENECY_SGD = 702;
    public static final int CURRENECY_THB = 764;
    public static final int CURRENECY_TRY = 949;
    public static final int CURRENECY_UAH = 980;
    public static final int CURRENECY_USD = 840;
    public static final int CURRENECY_VND = 704;
    public static final int CURRENECY_XAG = 961;
    public static final int CURRENECY_XAU = 959;
    public static final int CURRENECY_ZAR = 710;

    public static final int CURRENECY_XBT = 3762; // satoshi, 1E-8
    public static final int CURRENECY_ETH = 3928; // szabo, 1E-6
    public static final int CURRENECY_LTC = 4141; // litoshi, 1E-8
    public static final int CURRENECY_XDG = 4142;
    public static final int CURRENECY_GRC = 4143;
    public static final int CURRENECY_XPM = 4144;
    public static final int CURRENECY_XRP = 4145;
    public static final int CURRENECY_DASH = 4146;
    public static final int CURRENECY_XMR = 4147;
    public static final int CURRENECY_XLM = 4148;
    public static final int CURRENECY_ETC = 4149;
    public static final int CURRENECY_ZEC = 4150;


    public static final Set<Integer> CURRENCIES_FUTURES = Sets.newHashSet(
            CURRENECY_USD,
            CURRENECY_EUR);

    public static final Set<Integer> CURRENCIES_EXCHANGE = Sets.newHashSet(
            CURRENECY_ETH,
            CURRENECY_XBT);


    public static final Set<Integer> ALL_CURRENCIES = Sets.newHashSet(
            CURRENECY_AUD,
            CURRENECY_BRL,
            CURRENECY_CAD,
            CURRENECY_CHF,
            CURRENECY_CNY,
            CURRENECY_CZK,
            CURRENECY_DKK,
            CURRENECY_EUR,
            CURRENECY_GBP,
            CURRENECY_HKD,
            CURRENECY_JPY,
            CURRENECY_KRW,
            CURRENECY_MXN,
            CURRENECY_MYR,
            CURRENECY_NOK,
            CURRENECY_NZD,
            CURRENECY_PLN,
            CURRENECY_RUB,
            CURRENECY_SEK,
            CURRENECY_SGD,
            CURRENECY_THB,
            CURRENECY_TRY,
            CURRENECY_UAH,
            CURRENECY_USD,
            CURRENECY_VND,
            CURRENECY_XAG,
            CURRENECY_XAU,
            CURRENECY_ZAR,

            CURRENECY_XBT,
            CURRENECY_ETH,
            CURRENECY_LTC,
            CURRENECY_XDG,
            CURRENECY_GRC,
            CURRENECY_XPM,
            CURRENECY_XRP,
            CURRENECY_DASH,
            CURRENECY_XMR,
            CURRENECY_XLM,
            CURRENECY_ETC,
            CURRENECY_ZEC);

    public static final CoreSymbolSpecification SYMBOLSPEC_EUR_USD = CoreSymbolSpecification.builder()
            .symbolId(SYMBOL_MARGIN)
            .type(SymbolType.FUTURES_CONTRACT)
            .baseCurrency(CURRENECY_EUR)
            .quoteCurrency(CURRENECY_USD)
            .baseScaleK(1)
            .quoteScaleK(1)
            .depositBuy(2200)
            .depositSell(3210)
            .takerFee(0)
            .makerFee(0)
            .build();

    public static final CoreSymbolSpecification SYMBOLSPEC_ETH_XBT = CoreSymbolSpecification.builder()
            .symbolId(SYMBOL_EXCHANGE)
            .type(SymbolType.CURRENCY_EXCHANGE_PAIR)
            .baseCurrency(CURRENECY_ETH)    // base = szabo
            .quoteCurrency(CURRENECY_XBT)   // quote = satoshi
            .baseScaleK(100_000)            // 1 lot = 100K szabo (0.1 ETH)
            .quoteScaleK(10)                // 1 step = 10 satoshi
            .takerFee(0)
            .makerFee(0)
            .build();

    // symbol with fees
    public static final CoreSymbolSpecification SYMBOLSPECFEE_XBT_LTC = CoreSymbolSpecification.builder()
            .symbolId(SYMBOL_EXCHANGE_FEE)
            .type(SymbolType.CURRENCY_EXCHANGE_PAIR)
            .baseCurrency(CURRENECY_XBT)    // base = satoshi
            .quoteCurrency(CURRENECY_LTC)   // quote = litoshi
            .baseScaleK(1_000_000)          // 1 lot = 1M satoshi (0.01 BTC)
            .quoteScaleK(10_000)            // 1 step = 10K litoshi
            .takerFee(1900)                 // taker fee 1900 litoshi per 1 lot
            .makerFee(700)                  // maker fee 700 litoshi per 1 lot
            .build();

}
