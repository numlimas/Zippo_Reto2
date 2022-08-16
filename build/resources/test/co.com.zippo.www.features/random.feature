#language: en
Feature: Busqueda de producto aleatorio

  Background:
    Given estoy en la pagina Home de Zippo https://www.zippo.com.co


  Scenario: Buscar en subcategoria de la pagina de Zippo
    When busco un producto aleatorio
    Then valido que sea el producto elegido
