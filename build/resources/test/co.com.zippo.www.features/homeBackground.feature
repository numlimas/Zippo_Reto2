#language: en
Feature: Busqueda de productos Background

  Background:
    Given estoy en la pagina Home de Zippo https://www.zippo.com.co


  Scenario: Buscar productos desde el HomePage
    When busco un producto en la caja de texto
      | productos |
      | Naipe     |
    Then valido que se cumpla la busqueda

  Scenario: Buscar productos desde el HomePage
    When busco un producto en la caja de texto
      | productos |
      | Estuche   |
    Then valido que se cumpla la busqueda

  Scenario: Buscar productos desde el HomePage
    When busco un producto en la caja de texto
      | productos |
      | Piedra    |
    Then valido que se cumpla la busqueda