package com.enginemobi.fx.service;

import com.enginemobi.fx.domain.CurrencyMap;
import com.enginemobi.fx.domain.enumeration.CurrencyRateProvider;
import com.enginemobi.fx.service.dto.CurrencyMapDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Service Interface for managing CurrencyMap.
 */
public interface CurrencyMapService {

    /**
     * Save a currencyMap.
     *
     * @param currencyMapDTO the entity to save
     * @return the persisted entity
     */
    CurrencyMapDTO save(CurrencyMapDTO currencyMapDTO);

    /**
     *  Get all the currencyMaps.
     *
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<CurrencyMapDTO> findAll(Pageable pageable);

    /**
     *  Get the "id" currencyMap.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    CurrencyMapDTO findOne(Long id);

    /**
     *  Delete the "id" currencyMap.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);

    /**
     * delete currency maps by provider
     * @param rateProvider
     * @return
     */
    Long deleteByProvider(CurrencyRateProvider rateProvider);

    /**
     * Get currency maps by rate provider
     * @param rateProvider
     * @return
     */
    List<CurrencyMap> getByProvider(CurrencyRateProvider rateProvider);
}
