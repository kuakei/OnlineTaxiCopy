package com.online.taxi.common.dto.valuation.adjustment;

import lombok.Data;

import java.util.List;

/**
 * 调价
 *
 */
@Data
public class PriceAdjustment {

    private List<String> cities;
}
