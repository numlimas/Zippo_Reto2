#language: en
Feature: Probar la busqueda de productos desde Excel

  Scenario Outline: Busqueda de producto en HomePage
    Given estoy en la pagina Home de Zippo <Url>
    When busco un producto en la pagina
    Then valido que se realice la busqueda

    Examples:
      | Url                      |
      | https://www.zippo.com.co |
      | https://www.zippo.com.co |
      | https://www.zippo.com.co |